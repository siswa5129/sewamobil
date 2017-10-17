package com.example.siswa5129.kovenksi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profil extends AppCompatActivity {
    TextView tv,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    Firebase fb,fb2,fb3,fb4,fb5,fb6,fb7,fb8;
    private FirebaseAuth fAuth;

    String s,s2,s3,s4,s5,s6,s7,s8;

    String key = "-KvG7NOSlfn6wscQ4AtJ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
        Firebase.setAndroidContext(this);
        fAuth = FirebaseAuth.getInstance();
        s = "namakonveksi";
        s2 = "nama";
        s3 = "username";
        s4 = "email";
        s5 = "notelp";
        s6 = "alamatkonveksi";
        s7 = "nonpwp";
        s8 = "nosiup";

        fb = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s);
        fb2 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s2);
        fb3 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s3);
        fb4 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s4);
        fb5 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s5);
        fb6 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s6);
        fb7 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s7);
        fb8 = new Firebase("https://konveksi-4f4be.firebaseio.com/konveksi/-KvG7NOSlfn6wscQ4AtJ/"+s8);
        tv = (TextView) findViewById(R.id.namakonveksi);
        tv2 = (TextView) findViewById(R.id.nama);
        tv3 = (TextView) findViewById(R.id.username);
        tv4 = (TextView) findViewById(R.id.email);
        tv5 = (TextView) findViewById(R.id.notelp);
        tv6 = (TextView) findViewById(R.id.alamatkonveksi);
        tv7 = (TextView) findViewById(R.id.nonpwp);
        tv8 = (TextView) findViewById(R.id.nosiup);

        fb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv2.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv3.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value2 = dataSnapshot.getValue(String.class);
                tv4.setText(value2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv5.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value2 = dataSnapshot.getValue(String.class);
                tv6.setText(value2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv7.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        fb8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value2 = dataSnapshot.getValue(String.class);
                tv8.setText(value2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        checkLogin();
        Button btnklr = (Button) findViewById(R.id.btnKeluar);
        btnklr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
                Intent t2 = new Intent(getApplicationContext(),Akun.class);
                startActivity(t2);
            }
        });
    }


    private void checkLogin(){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            String email = user.getEmail();
            String uid = user.getUid();
            //btnklr.setEnabled(true);
        }
    }
    private void signOut(){
        fAuth.signOut();
    }

}
