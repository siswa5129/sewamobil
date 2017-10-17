package com.example.siswa5129.kovenksi;

/**
 * Created by siswa5129 on 9/30/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.siswa5129.kovenksi.model.AkunKonsumen;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Pendaftaran extends AppCompatActivity{
    Button ton1;
    EditText nama, email, password, notelp, alamat;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftarankonsumen);

        setTitle("Pendaftaran");


        databaseReference = FirebaseDatabase.getInstance().getReference("akunkonsumen");

        nama = (EditText) findViewById(R.id.namakonsumen);
        email = (EditText) findViewById(R.id.emailkonsumen);
        password = (EditText) findViewById(R.id.passwordkonsumen);
        notelp = (EditText) findViewById(R.id.notelpkonsumen);
        alamat = (EditText) findViewById(R.id.alamatkonsumen);
        ton1 = (Button) findViewById(R.id.btnDaftarkonsumen);



        ton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if(!validate(nama)) {
                    if(!validate(email)) {
                        if(!validate(password)) {
                            if(!validate(notelp)) {
                                if(!validate(alamat)) {
                                    tambahkonsumen();
                                    Intent t2 = new Intent(getApplicationContext(),Akun.class);
                                    startActivity(t2);
                                }
                            }
                        }
                    }
                }
            }
        });
    }
    public String tambahkonsumen(){
        String namakonsumen = nama.getText().toString().trim();
        String emailkonsumen = email.getText().toString().trim();
        String passwordkonsumen = password.getText().toString().trim();
        String notelpkonsumen = notelp.getText().toString().trim();
        String alamatkonsumen = alamat.getText().toString().trim();
            String id = databaseReference.push().getKey();
            AkunKonsumen akunkonsumen = new AkunKonsumen(id, namakonsumen, emailkonsumen, passwordkonsumen, notelpkonsumen, alamatkonsumen);
            databaseReference.child(namakonsumen).setValue(akunkonsumen);
        return namakonsumen;
    }

    private boolean validate(EditText a){
        if(a.getText().toString().trim().length() <= 0){
            a.setError("Mohon Diisi");
            return true;
        }else
            return false;
    }
}
