package com.example.siswa5129.kovenksi;

/**
 * Created by siswa5129 on 9/30/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    EditText nama, email, pass, notlp, alamat;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftarankonsumen);
        setTitle("BuatAkunKonsumen");
        databaseReference = FirebaseDatabase.getInstance().getReference("akunkonsumen");

        nama = (EditText) findViewById(R.id.namakonsumen);
        email = (EditText) findViewById(R.id.emailkonsumen);
        pass = (EditText) findViewById(R.id.passwordkonsumen);
        notlp = (EditText) findViewById(R.id.notelpkonsumen);
        alamat = (EditText) findViewById(R.id.alamatkonsumen);
        ton1 = (Button) findViewById(R.id.btnDaftarkonsumen);

        ton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                tambahkonsumen();
                Intent t2 = new Intent(getApplicationContext(),Login.class);
                startActivity(t2);
            }
        });
    }
    private void tambahkonsumen(){
        String namakonsumen = nama.getText().toString().trim();
        String emailkonsumen = email.getText().toString().trim();
        String passwordkonsumen = pass.getText().toString().trim();
        String notelpkonsumen = notlp.getText().toString().trim();
        String alamatkonsumen = alamat.getText().toString().trim();
        if(!TextUtils.isEmpty(namakonsumen)){
            String id = databaseReference.push().getKey();
            AkunKonsumen akunkonsumen = new AkunKonsumen(id, namakonsumen, emailkonsumen, passwordkonsumen, notelpkonsumen, alamatkonsumen);
            databaseReference.child(namakonsumen).setValue(akunkonsumen);
            Toast.makeText(this, "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Isian Kurang Lengkap", Toast.LENGTH_LONG).show();
        }
    }
}
