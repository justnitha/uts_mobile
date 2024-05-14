package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


public class segitiga extends AppCompatActivity {

    EditText alas, tinggi;
    TextView hasil;


    Integer hasill, alass, tinggii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        Button btnBack = findViewById(R.id.btnBacSegitiga);
        Button btnHitung = findViewById(R.id.btnHitungSegitiga);
        alas = (EditText) findViewById(R.id.edtAlas);
        tinggi = (EditText) findViewById(R.id.edtTinggi);
        hasil = (TextView) findViewById(R.id.txtHasilSegitiga);

        // tempelkan fungsi klik untuk button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(segitiga.this,MainActivity.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ambil nilai dari EditText dan ubah menjadi Integer
                alass = Integer.valueOf(alas.getText().toString().trim());
                tinggii = Integer.valueOf(tinggi.getText().toString().trim());

                // Perhitungan luas segitiga
                hasill = (alass * tinggii) / 2;

                // Set hasil perhitungan pada TextView
                hasil.setText(String.valueOf("Hasil Luas Segitiga: " + hasill));
            }
        });
    }
}
