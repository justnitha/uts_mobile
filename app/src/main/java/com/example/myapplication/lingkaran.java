package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    EditText r;
    TextView hasil;

    Double luas;
    Integer jarijari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        Button btnBack = findViewById(R.id.btnBackLingkaran);
        Button btnHitung = findViewById(R.id.btnHitungLingkaran);
        r = findViewById(R.id.edtJariJari);
        hasil = findViewById(R.id.txtHasilLingkaran);

        // tempelkan fungsi klik untuk button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menggunakan intent untuk berpindah
                Intent intent = new Intent(lingkaran.this,MainActivity.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(intent);
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ambil nilai dari EditText dan ubah menjadi Integer
                jarijari = Integer.valueOf(r.getText().toString().trim());

                // Perhitungan luas lingkaran
                luas = Math.PI * jarijari * jarijari;

                // Set hasil perhitungan pada TextView
                hasil.setText("Hasil Luas Lingkaran: " + String.format("%.2f", luas));
            }
        });
    }
}
