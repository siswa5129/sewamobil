package com.example.siswa5129.sewamobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profil extends AppCompatActivity {
    TextView tv,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    Firebase fb,fb2,fb3,fb4,fb5,fb6,fb7,fb8;
    private FirebaseAuth fAuth;

    String s,s2,s3,s4,s5,s6,s7,s8;

    String key = "-KvQ2nCGMUFqxBVIgHMq";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
        Firebase.setAndroidContext(this);
        fAuth = FirebaseAuth.getInstance();
        s = "namakonsumen";
        s2 = "emailkonsumen";
        s3 = "passwordkonsumen";
        s4 = "notelpkonsumen";
        s5 = "alamat";

        fb = new Firebase("https://konveksi-4f4be.firebaseio.com/akunkonsumen/"+ key +"/"+s);
        fb2 = new Firebase("https://konveksi-4f4be.firebaseio.com/akunkonsumen/"+ key +"/"+s2);
        fb3 = new Firebase("https://konveksi-4f4be.firebaseio.com/akunkonsumen/"+ key +"/"+s3);
        fb4 = new Firebase("https://konveksi-4f4be.firebaseio.com/akunkonsumen/"+ key +"/"+s4);
        fb5 = new Firebase("https://konveksi-4f4be.firebaseio.com/akunkonsumen/"+ key +"/"+s5);
        tv = (TextView) findViewById(R.id.namakonsumen);
        tv2 = (TextView) findViewById(R.id.emailkonsumen);
        tv3 = (TextView) findViewById(R.id.passwordkonsumen);
        tv4 = (TextView) findViewById(R.id.notelpkonsumen);
        tv5 = (TextView) findViewById(R.id.alamatkonsumen);

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
