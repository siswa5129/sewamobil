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

public class BuatAkunKonsumen extends AppCompatActivity{
    Button ton1;
    EditText text11, text12, text13, text14, text15;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftarankonsumen);

        setTitle("BuatAkunKonsumen");


        databaseReference = FirebaseDatabase.getInstance().getReference("akunkonsumen");

        text11 = (EditText) findViewById(R.id.namakonsumen);
        text12 = (EditText) findViewById(R.id.emailkonsumen);
        text13 = (EditText) findViewById(R.id.passwordkonsumen);
        text14 = (EditText) findViewById(R.id.notelpkonsumen);
        text15 = (EditText) findViewById(R.id.alamatkonsumen);
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
        String namakonsumen = text11.getText().toString().trim();
        String emailkonsumen = text12.getText().toString().trim();
        String passwordkonsumen = text13.getText().toString().trim();
        String notelpkonsumen = text14.getText().toString().trim();
        String alamatkonsumen = text15.getText().toString().trim();
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
