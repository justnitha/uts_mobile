package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // temukan button dengan id
        Button btnSegitiga = findViewById(R.id.btnSegitiga);
        Button btnLingkaran = findViewById(R.id.btnLingkaran);
        Button btnPersegi = findViewById(R.id.btnPersegi);


        // tempelkan fungsi klik untuk button
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(MainActivity.this, segitiga.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(MainActivity.this, lingkaran.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(MainActivity.this, persegi.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });
    }
}