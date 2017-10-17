package com.example.siswa5129.kovenksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by siswa5129 on 9/28/2017.
 */

public class MenuUtama extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menukosumen);
        setTitle("MenuKonsumen");



        ImageButton btnnegosiasi = (ImageButton) findViewById(R.id.button_negosiasi);
        btnnegosiasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t1 = new Intent(getApplicationContext(),Negosiasi.class);
                startActivity(t1);
            }
        });

        ImageButton btnbayar = (ImageButton) findViewById(R.id.button_bayar);
        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t2 = new Intent(getApplicationContext(),Pembayaran.class);
                startActivity(t2);
            }
        });

        ImageButton btnposting = (ImageButton) findViewById(R.id.button_perjanjian);
        btnposting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t3 = new Intent(getApplicationContext(),Perjanjian.class);
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
                Intent t5 = new Intent(getApplicationContext(),Posting.class);
                startActivity(t5);
            }
        });

        ImageButton btnrespon = (ImageButton) findViewById(R.id.button_pesanansaya);
        btnrespon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t6 = new Intent(getApplicationContext(),Pesanan.class);
                startActivity(t6);
            }
        });
    }


}