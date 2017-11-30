package com.example.siswa5129.sewamobil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by siswa5129 on 9/28/2017.
 */

public class Sewa extends AppCompatActivity{

    Button ton111;
    EditText text111, text112, text113, text114, text115,text116, text117, text118, text119;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postingpesanan);

        databaseReference = FirebaseDatabase.getInstance().getReference("dataposting");

        text111 = (EditText) findViewById(R.id.txtNamaPesanan);
        text112 = (EditText) findViewById(R.id.txtJenisKain);
        text113 = (EditText) findViewById(R.id.txtnamaKain);
        text114 = (EditText) findViewById(R.id.txtVariasi);
        text115 = (EditText) findViewById(R.id.txtWarnaVariasi);
        text116 = (EditText) findViewById(R.id.txtUkuran);
        text117 = (EditText) findViewById(R.id.txtTanggalSelesai);
        text118 = (EditText) findViewById(R.id.txtDanaBudget);
        text119 = (EditText) findViewById(R.id.txtKeteranganTambahan);
        ton111 = (Button) findViewById(R.id.daftar);

        ton111.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                //tambah();
                Intent t2 = new Intent(getApplicationContext(),Akun.class);
                startActivity(t2);
            }
        });
    }
    /*
    private void tambah(){
        String namapesanan  = text111.getText().toString().trim();
        String jenis = text112.getText().toString().trim();
        String warna = text113.getText().toString().trim();
        String variasi = text114.getText().toString().trim();
        String warnavariasi = text115.getText().toString().trim();
        String ukuran = text116.getText().toString().trim();
        String tanggalselesai = text117.getText().toString().trim();
        String dana = text118.getText().toString().trim();
        String keterangan = text119.getText().toString().trim();
        if(!TextUtils.isEmpty(namapesanan)){
            String id = databaseReference.push().getKey();
            DataPosting posting = new DataPosting(id, namapesanan, jenis, warna, variasi, warnavariasi, ukuran, tanggalselesai, dana, keterangan);
            databaseReference.child(namapesanan).setValue(posting);

        }
        else{
        }
    }*/
}
