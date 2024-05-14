package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class persegi extends AppCompatActivity {
    EditText sisi;
    TextView hasil;

    Integer hasill,sisii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        Button btnBack = findViewById(R.id.btnbackPersegi);
        Button btnHitung = findViewById(R.id.btnHitungPersegi);
        sisi = (EditText) findViewById(R.id.edt_sisi);
        hasil = (TextView) findViewById(R.id.txtHasilPersegi);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(persegi.this,MainActivity.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisii = Integer.valueOf(sisi.getText().toString().trim());

                hasill = sisii * sisii;
                hasil.setText(String.valueOf("Hasil Luas persegi: " + hasill));
            }
        });
    }
}