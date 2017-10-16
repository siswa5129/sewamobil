package com.example.siswa5129.kovenksi;

/**
 * Created by siswa5129 on 10/1/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Akun extends AppCompatActivity {

    private EditText Email, Password;

    private EditText etEmail;
    private EditText etPassword;
    private FirebaseAuth fAuth;
    private static final String TAG = Akun.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Logintesting");

        Email = (EditText) findViewById(R.id.et_email);
        Password = (EditText) findViewById(R.id.et_password);

        fAuth = FirebaseAuth.getInstance();

        Button btnmasuk = (Button) findViewById(R.id.bt_signin);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.login);
                if(!validate()){
                    signIn(Email.getText().toString(), Password.getText().toString());
                }

            }
        });

        Button btndaftar = (Button) findViewById(R.id.btnBuatAkun);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.login);
                Button btndaftar2 = (Button) findViewById(R.id.bt_signup);
                btndaftar2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        etEmail = (EditText) findViewById(R.id.et_email);
                        etPassword = (EditText) findViewById(R.id.et_password);
                        signUp(etEmail.getText().toString(), etPassword.getText().toString());
                    }
                });
            }
        });


    }
    private boolean validate(){
        if(Email.getText().toString().trim().length() <= 0){
            Toast.makeText(Akun.this, "Masukkan email", Toast.LENGTH_LONG).show();
            return true;
        }else if(Password.getText().toString().trim().length() <= 0){
            Toast.makeText(Akun.this, "Masukkan Password", Toast.LENGTH_LONG).show();
            return true;
        }else
        return false;
    }
    public void signUp(final String email, String password){
        fAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
                        if (!task.isSuccessful()) {
                            task.getException().printStackTrace();
                            Toast.makeText(Akun.this, "Proses Pendaftaran Gagal",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Akun.this, "Proses Pendaftaran Berhasil\n" +
                                            "Email "+email,
                                    Toast.LENGTH_SHORT).show();
                            Intent t2 = new Intent(getApplicationContext(),Pendaftaran.class);
                            startActivity(t2);
                        }
                    }
                });
    }
    private void signIn(final String email, String password){
        fAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "signInWithEmail:failed", task.getException());
                            Toast.makeText(Akun.this, "Proses Login Gagal\n",
                                    Toast.LENGTH_SHORT).show();
                        } else{
                            Intent t1 = new Intent(getApplicationContext(),MenuUtama.class);
                            startActivity(t1);
                            //setContentView(R.layout.activity_login);
                            Toast.makeText(Akun.this, "Login Berhasil\n" +
                                            "Email "+email,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}
