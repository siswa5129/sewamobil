package com.example.siswa5129.sewamobil;

/**
 * Created by siswa5129 on 10/1/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Akun extends AppCompatActivity {

    private EditText Email, Password;

    private EditText ettEmail;
    private EditText ettPassword;
    private FirebaseAuth fAuth;
    private static final String TAG = Akun.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");

        Email = (EditText) findViewById(R.id.et_email);
        Password = (EditText) findViewById(R.id.et_password);
        fAuth = FirebaseAuth.getInstance();

        Button btnmasuk = (Button) findViewById(R.id.bt_signin);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.login);
                if(!validatelogin()){
                    signIn(Email.getText().toString(), Password.getText().toString());
                }
            }
        });

        Button btndaftar = (Button) findViewById(R.id.btnBuatAkun);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportActionBar().setTitle("Pendaftaran");
                setContentView(R.layout.login);
                Button btndaftar2 = (Button) findViewById(R.id.bt_signup);
                btndaftar2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ettEmail = (EditText) findViewById(R.id.ett_email);
                        ettPassword = (EditText) findViewById(R.id.ett_password);
                        if(!validatedaftar()) {
                            signUp(ettEmail.getText().toString(), ettPassword.getText().toString());
                        }
                    }
                });
            }
        });

    }
    private boolean validatelogin(){
        if(Email.getText().toString().trim().length() <= 0){
            Email.setError("Masukkan Email");
            return true;
        }else if(Password.getText().toString().trim().length() <= 0){
            Password.setError("Masukkan Password");
            return true;
        }else
        return false;
    }
    private boolean validatedaftar(){
        if(ettEmail.getText().toString().trim().length() <= 0){
            ettEmail.setError("Masukkan Email");
            return true;
        }else if(ettPassword.getText().toString().trim().length() <= 0){
            ettPassword.setError("Masukkan Password");
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
                            ettPassword.setError("Daftar Gagal");
                        } else {
                            Intent t2 = new Intent(getApplicationContext(),Pendaftaran.class);
                            startActivity(t2);
                            ettPassword.setError("Daftar Berhasil");
                        }
                    }
                });
    }
    public void signIn(final String email, String password){
        fAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()) {
                            Password.setError("Login Gagal");
                        } else{
                            setContentView(R.layout.menukosumen);
                            setTitle("MenuKonsumen");



                            ImageButton btnnegosiasi = (ImageButton) findViewById(R.id.button_negosiasi);
                            btnnegosiasi.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t1 = new Intent(getApplicationContext(),Mobil.class);
                                    startActivity(t1);
                                }
                            });

                            ImageButton btnbayar = (ImageButton) findViewById(R.id.button_bayar);
                            btnbayar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t2 = new Intent(getApplicationContext(),StatusPeminjaman.class);
                                    startActivity(t2);
                                }
                            });

                            ImageButton btnposting = (ImageButton) findViewById(R.id.button_perjanjian);
                            btnposting.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t3 = new Intent(getApplicationContext(),Supir.class);
                                    startActivity(t3);
                                }
                            });

                            ImageButton btnprofil = (ImageButton) findViewById(R.id.button_profil);
                            btnprofil.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t4 = new Intent(getApplicationContext(),Profil.class);
                                    startActivity(t4);
                                }
                            });

                            ImageButton btncari = (ImageButton) findViewById(R.id.button_posting);
                            btncari.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t5 = new Intent(getApplicationContext(),Sewa.class);
                                    startActivity(t5);
                                }
                            });

                            ImageButton btnrespon = (ImageButton) findViewById(R.id.button_pesanansaya);
                            btnrespon.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent t6 = new Intent(getApplicationContext(),HistorySewa.class);
                                    startActivity(t6);
                                }
                            });
                            //Intent t1 = new Intent(getApplicationContext(),MenuUtama.class);
                            //startActivity(t1);
                            //Password.setError("Login Berhasil");
                        }
                    }
                });
    }
}
