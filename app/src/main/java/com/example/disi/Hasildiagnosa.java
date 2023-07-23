package com.example.disi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Hasildiagnosa extends AppCompatActivity {
    private TextView texthasil, texthasil2, berat, sedang, ringan;
    private ImageButton backk;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasildiagnosa);

        berat = findViewById(R.id.berat);
        sedang = findViewById(R.id.sedang);
        ringan = findViewById(R.id.ringan);
        backk = findViewById(R.id.backk);


        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");
        String jk = getIntent().getExtras().getString("jk");
        String jurusan = getIntent().getExtras().getString("jurusan");
        String instansi = getIntent().getExtras().getString("instansi");
        String JenisDepresi = getIntent().getExtras().getString("JenisDepresi");
        int hasilHitungGejalaDepresi = getIntent().getIntExtra("hasilHitungGejalaDepresi", 0);
        int hasilBulatInt = hasilHitungGejalaDepresi; // Tidak perlu melakukan pembulatan karena sudah menggunakan intExtra


        texthasil = findViewById(R.id.texthasil);
        texthasil2 = findViewById(R.id.texthasil2);

        texthasil.setText("NIM : " + nim + "\nNama : " + nama + "\nJenis Kelamin : " + jk + "\nJurusan : " + jurusan + "\nInstansi : " + instansi);
        texthasil2.setText(JenisDepresi);
        if (hasilBulatInt <= 50) {
            ringan.setVisibility(View.VISIBLE);
        } else if (hasilBulatInt <= 80) {
            sedang.setVisibility(View.VISIBLE);
        } else {
            berat.setVisibility(View.VISIBLE);
        }

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("hasil_diagnosa");

        db_hasildiagnosa hasilDiagnosa = new db_hasildiagnosa(nim, nama, jk, jurusan, instansi, JenisDepresi);
        databaseReference.child(nim).setValue(hasilDiagnosa);


        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hasildiagnosa.this, Diagnosa.class));
            }
        });

    }
}