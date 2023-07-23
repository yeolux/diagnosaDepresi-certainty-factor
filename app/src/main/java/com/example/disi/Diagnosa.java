package com.example.disi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.xmlpull.v1.XmlPullParser;

import java.text.DecimalFormat;

public class Diagnosa extends AppCompatActivity {
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    dbDiagnosa dbDiagnosa;
    private ImageButton back;
    private EditText nim, nama, jk, jurusan, instansi;
    private Button btncek, btnkosong;
    private CheckBox gejala1, gejala2, gejala3, gejala4, gejala5, gejala6, gejala7, gejala8, gejala9, gejala10, gejala11, gejala12, gejala13, gejala14, gejala15, gejala16, gejala17, gejala18, gejala19, gejala20, gejala21, gejala22, gejala23, gejala24, gejala25, gejala26, gejala27, gejala28, gejala29, gejala30, gejala31, gejala32, gejala33, gejala34, gejala35, gejala36, gejala37, gejala38, gejala39, gejala40, gejala41, gejala42, gejala43;
    private AutoCompleteTextView nilaigejala1, nilaigejala2, nilaigejala3, nilaigejala4, nilaigejala5, nilaigejala6, nilaigejala7, nilaigejala8, nilaigejala9, nilaigejala10, nilaigejala11, nilaigejala12, nilaigejala13, nilaigejala14, nilaigejala15, nilaigejala16, nilaigejala17, nilaigejala18, nilaigejala19, nilaigejala20, nilaigejala21, nilaigejala22, nilaigejala23, nilaigejala24, nilaigejala25, nilaigejala26, nilaigejala27, nilaigejala28, nilaigejala29, nilaigejala30, nilaigejala31, nilaigejala32, nilaigejala33, nilaigejala34, nilaigejala35, nilaigejala36, nilaigejala37, nilaigejala38, nilaigejala39, nilaigejala40, nilaigejala41, nilaigejala42, nilaigejala43;

    String[] dialognilaikeyakinangejala = {"Tidak yakin : 0", "Tidak tahu : 0.2", "Kurang yakin : 0.4", "Cukup yakin : 0.6", "Yakin : 0.8", "Sangat yakin : 1", "Mungkin tidak : -0.4"};
    String[] nilaikeyakinangejala = {"0", "0.2", "0.4", "0.6", "0.8", "1", "-0.4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        jk = findViewById(R.id.jk);
        jurusan = findViewById(R.id.jurusan);
        instansi = findViewById(R.id.instansi);
        back = findViewById(R.id.back);
        btncek = findViewById(R.id.btncek);
        btnkosong = findViewById(R.id.btnkosong);


        gejala1 = findViewById(R.id.gejala1);
        gejala2 = findViewById(R.id.gejala2);
        gejala3 = findViewById(R.id.gejala3);
        gejala4 = findViewById(R.id.gejala4);
        gejala5 = findViewById(R.id.gejala5);
        gejala6 = findViewById(R.id.gejala6);
        gejala7 = findViewById(R.id.gejala7);
        gejala8 = findViewById(R.id.gejala8);
        gejala9 = findViewById(R.id.gejala9);
        gejala10 = findViewById(R.id.gejala10);
        gejala11 = findViewById(R.id.gejala11);
        gejala12 = findViewById(R.id.gejala12);
        gejala13 = findViewById(R.id.gejala13);
        gejala14 = findViewById(R.id.gejala14);
        gejala15 = findViewById(R.id.gejala15);
        gejala16 = findViewById(R.id.gejala16);
        gejala17 = findViewById(R.id.gejala17);
        gejala18 = findViewById(R.id.gejala18);
        gejala19 = findViewById(R.id.gejala19);
        gejala20 = findViewById(R.id.gejala20);
        gejala21 = findViewById(R.id.gejala21);
        gejala22 = findViewById(R.id.gejala22);
        gejala23 = findViewById(R.id.gejala23);
        gejala24 = findViewById(R.id.gejala24);
        gejala25 = findViewById(R.id.gejala25);
        gejala26 = findViewById(R.id.gejala26);
        gejala27 = findViewById(R.id.gejala27);
        gejala28 = findViewById(R.id.gejala28);
        gejala29 = findViewById(R.id.gejala29);
        gejala30 = findViewById(R.id.gejala30);
        gejala31 = findViewById(R.id.gejala31);
        gejala32 = findViewById(R.id.gejala32);
        gejala33 = findViewById(R.id.gejala33);
        gejala34 = findViewById(R.id.gejala34);
        gejala35 = findViewById(R.id.gejala35);
        gejala36 = findViewById(R.id.gejala36);
        gejala37 = findViewById(R.id.gejala37);
        gejala38 = findViewById(R.id.gejala38);
        gejala39 = findViewById(R.id.gejala39);
        gejala40 = findViewById(R.id.gejala40);
        gejala41 = findViewById(R.id.gejala41);
        gejala42 = findViewById(R.id.gejala42);
        gejala43 = findViewById(R.id.gejala43);


        nilaigejala1 = findViewById(R.id.nilaigejala1);
        nilaigejala2 = findViewById(R.id.nilaigejala2);
        nilaigejala3 = findViewById(R.id.nilaigejala3);
        nilaigejala4 = findViewById(R.id.nilaigejala4);
        nilaigejala5 = findViewById(R.id.nilaigejala5);
        nilaigejala6 = findViewById(R.id.nilaigejala6);
        nilaigejala7 = findViewById(R.id.nilaigejala7);
        nilaigejala8 = findViewById(R.id.nilaigejala8);
        nilaigejala9 = findViewById(R.id.nilaigejala9);
        nilaigejala10 = findViewById(R.id.nilaigejala10);
        nilaigejala11 = findViewById(R.id.nilaigejala11);
        nilaigejala12 = findViewById(R.id.nilaigejala12);
        nilaigejala13 = findViewById(R.id.nilaigejala13);
        nilaigejala14 = findViewById(R.id.nilaigejala14);
        nilaigejala15 = findViewById(R.id.nilaigejala15);
        nilaigejala16 = findViewById(R.id.nilaigejala16);
        nilaigejala17 = findViewById(R.id.nilaigejala17);
        nilaigejala18 = findViewById(R.id.nilaigejala18);
        nilaigejala19 = findViewById(R.id.nilaigejala19);
        nilaigejala20 = findViewById(R.id.nilaigejala20);
        nilaigejala21 = findViewById(R.id.nilaigejala21);
        nilaigejala22 = findViewById(R.id.nilaigejala22);
        nilaigejala23 = findViewById(R.id.nilaigejala23);
        nilaigejala24 = findViewById(R.id.nilaigejala24);
        nilaigejala25 = findViewById(R.id.nilaigejala25);
        nilaigejala26 = findViewById(R.id.nilaigejala26);
        nilaigejala27 = findViewById(R.id.nilaigejala27);
        nilaigejala28 = findViewById(R.id.nilaigejala28);
        nilaigejala29 = findViewById(R.id.nilaigejala29);
        nilaigejala30 = findViewById(R.id.nilaigejala30);
        nilaigejala31 = findViewById(R.id.nilaigejala31);
        nilaigejala32 = findViewById(R.id.nilaigejala32);
        nilaigejala33 = findViewById(R.id.nilaigejala33);
        nilaigejala34 = findViewById(R.id.nilaigejala34);
        nilaigejala35 = findViewById(R.id.nilaigejala35);
        nilaigejala36 = findViewById(R.id.nilaigejala36);
        nilaigejala37 = findViewById(R.id.nilaigejala37);
        nilaigejala38 = findViewById(R.id.nilaigejala38);
        nilaigejala39 = findViewById(R.id.nilaigejala39);
        nilaigejala40 = findViewById(R.id.nilaigejala40);
        nilaigejala41 = findViewById(R.id.nilaigejala41);
        nilaigejala42 = findViewById(R.id.nilaigejala42);
        nilaigejala43 = findViewById(R.id.nilaigejala43);


        final ArrayAdapter<String> adapterGejala1 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala1.setThreshold(1);
        nilaigejala1.setAdapter(adapterGejala1);

        final ArrayAdapter<String> adapterGejala2 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala2.setThreshold(1);
        nilaigejala2.setAdapter(adapterGejala2);

        final ArrayAdapter<String> adapterGejala3 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala3.setThreshold(1);
        nilaigejala3.setAdapter(adapterGejala3);

        final ArrayAdapter<String> adapterGejala4 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala4.setThreshold(1);
        nilaigejala4.setAdapter(adapterGejala4);

        final ArrayAdapter<String> adapterGejala5 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala5.setThreshold(1);
        nilaigejala5.setAdapter(adapterGejala5);

        final ArrayAdapter<String> adapterGejala6 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala6.setThreshold(1);
        nilaigejala6.setAdapter(adapterGejala6);

        final ArrayAdapter<String> adapterGejala7 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala7.setThreshold(1);
        nilaigejala7.setAdapter(adapterGejala7);

        final ArrayAdapter<String> adapterGejala8 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala8.setThreshold(1);
        nilaigejala8.setAdapter(adapterGejala8);

        final ArrayAdapter<String> adapterGejala9 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala9.setThreshold(1);
        nilaigejala9.setAdapter(adapterGejala9);

        final ArrayAdapter<String> adapterGejala10 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala10.setThreshold(1);
        nilaigejala10.setAdapter(adapterGejala10);

        final ArrayAdapter<String> adapterGejala11 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala11.setThreshold(1);
        nilaigejala11.setAdapter(adapterGejala11);

        final ArrayAdapter<String> adapterGejala12 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala12.setThreshold(1);
        nilaigejala12.setAdapter(adapterGejala12);

        final ArrayAdapter<String> adapterGejala13 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala13.setThreshold(1);
        nilaigejala13.setAdapter(adapterGejala13);

        final ArrayAdapter<String> adapterGejala14 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala14.setThreshold(1);
        nilaigejala14.setAdapter(adapterGejala14);

        final ArrayAdapter<String> adapterGejala15 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala15.setThreshold(1);
        nilaigejala15.setAdapter(adapterGejala15);

        final ArrayAdapter<String> adapterGejala16 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala16.setThreshold(1);
        nilaigejala16.setAdapter(adapterGejala16);

        final ArrayAdapter<String> adapterGejala17 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala17.setThreshold(1);
        nilaigejala17.setAdapter(adapterGejala17);

        final ArrayAdapter<String> adapterGejala18 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala18.setThreshold(1);
        nilaigejala18.setAdapter(adapterGejala18);

        final ArrayAdapter<String> adapterGejala19 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala19.setThreshold(1);
        nilaigejala19.setAdapter(adapterGejala19);

        final ArrayAdapter<String> adapterGejala20 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala20.setThreshold(1);
        nilaigejala20.setAdapter(adapterGejala20);

        final ArrayAdapter<String> adapterGejala21 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala21.setThreshold(1);
        nilaigejala21.setAdapter(adapterGejala21);

        final ArrayAdapter<String> adapterGejala22 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala22.setThreshold(1);
        nilaigejala22.setAdapter(adapterGejala22);

        final ArrayAdapter<String> adapterGejala23 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala23.setThreshold(1);
        nilaigejala23.setAdapter(adapterGejala23);

        final ArrayAdapter<String> adapterGejala24 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala24.setThreshold(1);
        nilaigejala24.setAdapter(adapterGejala24);

        final ArrayAdapter<String> adapterGejala25 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala25.setThreshold(1);
        nilaigejala25.setAdapter(adapterGejala25);

        final ArrayAdapter<String> adapterGejala26 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala26.setThreshold(1);
        nilaigejala26.setAdapter(adapterGejala26);

        final ArrayAdapter<String> adapterGejala27 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala27.setThreshold(1);
        nilaigejala27.setAdapter(adapterGejala27);

        final ArrayAdapter<String> adapterGejala28 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala28.setThreshold(1);
        nilaigejala28.setAdapter(adapterGejala28);

        final ArrayAdapter<String> adapterGejala29 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala29.setThreshold(1);
        nilaigejala29.setAdapter(adapterGejala29);

        final ArrayAdapter<String> adapterGejala30 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala30.setThreshold(1);
        nilaigejala30.setAdapter(adapterGejala30);

        final ArrayAdapter<String> adapterGejala31 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala31.setThreshold(1);
        nilaigejala31.setAdapter(adapterGejala31);

        final ArrayAdapter<String> adapterGejala32 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala32.setThreshold(1);
        nilaigejala32.setAdapter(adapterGejala32);

        final ArrayAdapter<String> adapterGejala33 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala33.setThreshold(1);
        nilaigejala33.setAdapter(adapterGejala33);

        final ArrayAdapter<String> adapterGejala34 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala34.setThreshold(1);
        nilaigejala34.setAdapter(adapterGejala34);

        final ArrayAdapter<String> adapterGejala35 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala35.setThreshold(1);
        nilaigejala35.setAdapter(adapterGejala35);

        final ArrayAdapter<String> adapterGejala36 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala36.setThreshold(1);
        nilaigejala36.setAdapter(adapterGejala36);

        final ArrayAdapter<String> adapterGejala37 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala37.setThreshold(1);
        nilaigejala37.setAdapter(adapterGejala37);

        final ArrayAdapter<String> adapterGejala38 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala38.setThreshold(1);
        nilaigejala38.setAdapter(adapterGejala38);

        final ArrayAdapter<String> adapterGejala39 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala39.setThreshold(1);
        nilaigejala39.setAdapter(adapterGejala39);

        final ArrayAdapter<String> adapterGejala40 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala40.setThreshold(1);
        nilaigejala40.setAdapter(adapterGejala40);

        final ArrayAdapter<String> adapterGejala41 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala41.setThreshold(1);
        nilaigejala41.setAdapter(adapterGejala41);

        final ArrayAdapter<String> adapterGejala42 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala42.setThreshold(1);
        nilaigejala42.setAdapter(adapterGejala42);

        final ArrayAdapter<String> adapterGejala43 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, dialognilaikeyakinangejala);
        nilaigejala43.setThreshold(1);
        nilaigejala43.setAdapter(adapterGejala43);


        nilaigejala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala1.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala2, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala2.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala3, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala3.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala4, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala4.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala5, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala5.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });


        nilaigejala6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala6, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala6.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala7, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala7.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala8, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala8.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala9, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala9.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala10, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala10.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala11, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala11.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala12, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala12.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala13, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala13.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala14, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala14.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala15, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala15.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala16, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala16.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala17, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala17.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala18, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala18.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala19, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala19.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala20, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala20.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala21, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala21.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala22, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala22.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala23, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala23.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala24, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala24.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala25, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala25.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala26, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala26.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala27, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala27.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala28, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala28.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala29, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala29.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala30, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala30.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala31, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala31.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala32, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala32.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala33, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala33.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala34, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala34.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala35, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala35.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala36, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala36.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala37, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala37.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala38, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala38.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala39, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala39.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala40, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala40.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala41, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala41.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala42, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala42.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        nilaigejala43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Diagnosa.this).setTitle("Pilihlah Nilai Gejala").
                        setAdapter(adapterGejala43, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nilaigejala43.setText(nilaikeyakinangejala[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });



        btncek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strnim = nim.getText().toString();
                String strnama = nama.getText().toString();
                String strjk = jk.getText().toString();
                String strjurusan = jurusan.getText().toString();
                String strinstansi = instansi.getText().toString();

                if (strnim.isEmpty()) {
                    nim.setError("NIM harus diisi");
                    nim.requestFocus();
                    return;
                }

                if (strnama.isEmpty()) {
                    nama.setError("Nama harus diisi");
                    nama.requestFocus();
                    return;
                }

                if (strjk.isEmpty()) {
                    jk.setError("Jenis Kelamin harus diisi");
                    jk.requestFocus();
                    return;
                }

                if (strjurusan.isEmpty()) {
                    jurusan.setError("Jurusan harus diisi");
                    jurusan.requestFocus();
                    return;
                }

                if (strinstansi.isEmpty()) {
                    instansi.setError("Instansi harus diisi");
                    instansi.requestFocus();
                    return;
                }

                CheckBox[] gejala = new CheckBox[43];
                AutoCompleteTextView[] nilaiGejala = new AutoCompleteTextView[43];
                for (int i = 0; i < 43; i++) {
                    String gejalaId = "gejala" + (i + 1);
                    String nilaiGejalaId = "nilaigejala" + (i + 1);
                    int gejalaResId = getResources().getIdentifier(gejalaId, "id", getPackageName());
                    int nilaiGejalaResId = getResources().getIdentifier(nilaiGejalaId, "id", getPackageName());
                    gejala[i] = findViewById(gejalaResId);
                    nilaiGejala[i] = findViewById(nilaiGejalaResId);
                }

                for (int i = 0; i < gejala.length; i++) {
                    if (!gejala[i].isChecked() || nilaiGejala[i].getText().toString().isEmpty()) {
                        gejala[i].setError("Gejala dan nilai gejala harus diisi");
                        nilaiGejala[i].setError("Gejala dan nilai gejala harus diisi");
                        nilaiGejala[i].requestFocus();
                        return;
                    }
                }

                if (gejala1.isChecked() && gejala2.isChecked() && gejala3.isChecked() && gejala4.isChecked() && gejala5.isChecked() && gejala6.isChecked() && gejala7.isChecked() && gejala8.isChecked() && gejala9.isChecked() && gejala10.isChecked() && gejala11.isChecked() && gejala12.isChecked() && gejala13.isChecked() && gejala14.isChecked() && gejala15.isChecked() && gejala16.isChecked() && gejala17.isChecked() && gejala18.isChecked() && gejala19.isChecked() && gejala20.isChecked() && gejala21.isChecked() && gejala22.isChecked() && gejala23.isChecked() && gejala24.isChecked() && gejala25.isChecked() && gejala26.isChecked() && gejala27.isChecked() && gejala28.isChecked() && gejala29.isChecked() && gejala30.isChecked()
                        && gejala31.isChecked() && gejala32.isChecked() && gejala33.isChecked() && gejala34.isChecked() && gejala35.isChecked() && gejala36.isChecked() && gejala37.isChecked() && gejala38.isChecked() && gejala39.isChecked() && gejala40.isChecked() && gejala41.isChecked() && gejala42.isChecked() && gejala43.isChecked()) {

                    double nilaicfGejala1 = 0.3;
                    double nilaicfGejala2 = 0.3;
                    double nilaicfGejala3 = 0.3;
                    double nilaicfGejala4 = 0.3;
                    double nilaicfGejala5 = 0.4;
                    double nilaicfGejala6 = 0.2;
                    double nilaicfGejala7 = 0.3;
                    double nilaicfGejala8 = 0.3;
                    double nilaicfGejala9 = 0.3;
                    double nilaicfGejala10 = 0.6;
                    double nilaicfGejala11 = 0.3;
                    double nilaicfGejala12 = 0.5;
                    double nilaicfGejala13 = 0.4;
                    double nilaicfGejala14 = 0.3;
                    double nilaicfGejala15 = 0.2;
                    double nilaicfGejala16 = 0.2;
                    double nilaicfGejala17 = 0.2;
                    double nilaicfGejala18 = 0.4;
                    double nilaicfGejala19 = 0.4;
                    double nilaicfGejala20 = 0.4;
                    double nilaicfGejala21 = 0.7;
                    double nilaicfGejala22 = 0.7;
                    double nilaicfGejala23 = 0.5;
                    double nilaicfGejala24 = 0.6;
                    double nilaicfGejala25 = 0.2;
                    double nilaicfGejala26 = 0.1;
                    double nilaicfGejala27 = 0.2;
                    double nilaicfGejala28 = 0.3;
                    double nilaicfGejala29 = 0.4;
                    double nilaicfGejala30 = 0.4;
                    double nilaicfGejala31 = 0.2;
                    double nilaicfGejala32 = 0.2;
                    double nilaicfGejala33 = 0.3;
                    double nilaicfGejala34 = 0.3;
                    double nilaicfGejala35 = 0.4;
                    double nilaicfGejala36 = 0.4;
                    double nilaicfGejala37 = 0.5;
                    double nilaicfGejala38 = 0.4;
                    double nilaicfGejala39 = 0.6;
                    double nilaicfGejala40 = 0.5;
                    double nilaicfGejala41 = 0.7;
                    double nilaicfGejala42 = 0.4;
                    double nilaicfGejala43 = 0.7;


                    double doubleGejala1 = Double.parseDouble(nilaigejala1.getText().toString());
                    double doubleGejala2 = Double.parseDouble(nilaigejala2.getText().toString());
                    double doubleGejala3 = Double.parseDouble(nilaigejala3.getText().toString());
                    double doubleGejala4 = Double.parseDouble(nilaigejala4.getText().toString());
                    double doubleGejala5 = Double.parseDouble(nilaigejala5.getText().toString());
                    double doubleGejala6 = Double.parseDouble(nilaigejala6.getText().toString());
                    double doubleGejala7 = Double.parseDouble(nilaigejala7.getText().toString());
                    double doubleGejala8 = Double.parseDouble(nilaigejala8.getText().toString());
                    double doubleGejala9 = Double.parseDouble(nilaigejala9.getText().toString());
                    double doubleGejala10 = Double.parseDouble(nilaigejala10.getText().toString());
                    double doubleGejala11 = Double.parseDouble(nilaigejala11.getText().toString());
                    double doubleGejala12 = Double.parseDouble(nilaigejala12.getText().toString());
                    double doubleGejala13 = Double.parseDouble(nilaigejala13.getText().toString());
                    double doubleGejala14 = Double.parseDouble(nilaigejala14.getText().toString());
                    double doubleGejala15 = Double.parseDouble(nilaigejala15.getText().toString());
                    double doubleGejala16 = Double.parseDouble(nilaigejala16.getText().toString());
                    double doubleGejala17 = Double.parseDouble(nilaigejala17.getText().toString());
                    double doubleGejala18 = Double.parseDouble(nilaigejala18.getText().toString());
                    double doubleGejala19 = Double.parseDouble(nilaigejala19.getText().toString());
                    double doubleGejala20 = Double.parseDouble(nilaigejala20.getText().toString());
                    double doubleGejala21 = Double.parseDouble(nilaigejala21.getText().toString());
                    double doubleGejala22 = Double.parseDouble(nilaigejala22.getText().toString());
                    double doubleGejala23 = Double.parseDouble(nilaigejala23.getText().toString());
                    double doubleGejala24 = Double.parseDouble(nilaigejala24.getText().toString());
                    double doubleGejala25 = Double.parseDouble(nilaigejala25.getText().toString());
                    double doubleGejala26 = Double.parseDouble(nilaigejala26.getText().toString());
                    double doubleGejala27 = Double.parseDouble(nilaigejala27.getText().toString());
                    double doubleGejala28 = Double.parseDouble(nilaigejala28.getText().toString());
                    double doubleGejala29 = Double.parseDouble(nilaigejala29.getText().toString());
                    double doubleGejala30 = Double.parseDouble(nilaigejala30.getText().toString());
                    double doubleGejala31 = Double.parseDouble(nilaigejala31.getText().toString());
                    double doubleGejala32 = Double.parseDouble(nilaigejala32.getText().toString());
                    double doubleGejala33 = Double.parseDouble(nilaigejala33.getText().toString());
                    double doubleGejala34 = Double.parseDouble(nilaigejala34.getText().toString());
                    double doubleGejala35 = Double.parseDouble(nilaigejala35.getText().toString());
                    double doubleGejala36 = Double.parseDouble(nilaigejala36.getText().toString());
                    double doubleGejala37 = Double.parseDouble(nilaigejala37.getText().toString());
                    double doubleGejala38 = Double.parseDouble(nilaigejala38.getText().toString());
                    double doubleGejala39 = Double.parseDouble(nilaigejala39.getText().toString());
                    double doubleGejala40 = Double.parseDouble(nilaigejala40.getText().toString());
                    double doubleGejala41 = Double.parseDouble(nilaigejala41.getText().toString());
                    double doubleGejala42 = Double.parseDouble(nilaigejala42.getText().toString());
                    double doubleGejala43 = Double.parseDouble(nilaigejala43.getText().toString());


                    double hasilHitunganGejala1 = nilaicfGejala1 * doubleGejala1;
                    double hasilHitunganGejala2 = nilaicfGejala2 * doubleGejala2;
                    double hasilHitunganGejala3 = nilaicfGejala3 * doubleGejala3;
                    double hasilHitunganGejala4 = nilaicfGejala4 * doubleGejala4;
                    double hasilHitunganGejala5 = nilaicfGejala5 * doubleGejala5;
                    double hasilHitunganGejala6 = nilaicfGejala6 * doubleGejala6;
                    double hasilHitunganGejala7 = nilaicfGejala7 * doubleGejala7;
                    double hasilHitunganGejala8 = nilaicfGejala8 * doubleGejala8;
                    double hasilHitunganGejala9 = nilaicfGejala9 * doubleGejala9;
                    double hasilHitunganGejala10 = nilaicfGejala10 * doubleGejala10;
                    double hasilHitunganGejala11 = nilaicfGejala11 * doubleGejala11;
                    double hasilHitunganGejala12 = nilaicfGejala12 * doubleGejala12;
                    double hasilHitunganGejala13 = nilaicfGejala13 * doubleGejala13;
                    double hasilHitunganGejala14 = nilaicfGejala14 * doubleGejala14;
                    double hasilHitunganGejala15 = nilaicfGejala15 * doubleGejala15;
                    double hasilHitunganGejala16 = nilaicfGejala16 * doubleGejala16;
                    double hasilHitunganGejala17 = nilaicfGejala17 * doubleGejala17;
                    double hasilHitunganGejala18 = nilaicfGejala18 * doubleGejala18;
                    double hasilHitunganGejala19 = nilaicfGejala19 * doubleGejala19;
                    double hasilHitunganGejala20 = nilaicfGejala20 * doubleGejala20;
                    double hasilHitunganGejala21 = nilaicfGejala21 * doubleGejala21;
                    double hasilHitunganGejala22 = nilaicfGejala22 * doubleGejala22;
                    double hasilHitunganGejala23 = nilaicfGejala23 * doubleGejala23;
                    double hasilHitunganGejala24 = nilaicfGejala24 * doubleGejala24;
                    double hasilHitunganGejala25 = nilaicfGejala25 * doubleGejala25;
                    double hasilHitunganGejala26 = nilaicfGejala26 * doubleGejala26;
                    double hasilHitunganGejala27 = nilaicfGejala27 * doubleGejala27;
                    double hasilHitunganGejala28 = nilaicfGejala28 * doubleGejala28;
                    double hasilHitunganGejala29 = nilaicfGejala29 * doubleGejala29;
                    double hasilHitunganGejala30 = nilaicfGejala30 * doubleGejala30;
                    double hasilHitunganGejala31 = nilaicfGejala31 * doubleGejala31;
                    double hasilHitunganGejala32 = nilaicfGejala32 * doubleGejala32;
                    double hasilHitunganGejala33 = nilaicfGejala33 * doubleGejala33;
                    double hasilHitunganGejala34 = nilaicfGejala34 * doubleGejala34;
                    double hasilHitunganGejala35 = nilaicfGejala35 * doubleGejala35;
                    double hasilHitunganGejala36 = nilaicfGejala36 * doubleGejala36;
                    double hasilHitunganGejala37 = nilaicfGejala37 * doubleGejala37;
                    double hasilHitunganGejala38 = nilaicfGejala38 * doubleGejala38;
                    double hasilHitunganGejala39 = nilaicfGejala39 * doubleGejala39;
                    double hasilHitunganGejala40 = nilaicfGejala40 * doubleGejala40;
                    double hasilHitunganGejala41 = nilaicfGejala41 * doubleGejala41;
                    double hasilHitunganGejala42 = nilaicfGejala42 * doubleGejala42;
                    double hasilHitunganGejala43 = nilaicfGejala43 * doubleGejala43;


                    double Combine_CF1_CF2_1 = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1);
                    double Combine_CFold_CF3 = Combine_CF1_CF2_1 + hasilHitunganGejala3 * (1 - Combine_CF1_CF2_1);
                    double Combine_CFold_CF4 = Combine_CFold_CF3 + hasilHitunganGejala4 * (1 - Combine_CFold_CF3);
                    double Combine_CFold_CF5 = Combine_CFold_CF4 + hasilHitunganGejala5 * (1 - Combine_CFold_CF4);
                    double Combine_CFold_CF6 = Combine_CFold_CF5 + hasilHitunganGejala6 * (1 - Combine_CFold_CF5);
                    double Combine_CFold_CF7 = Combine_CFold_CF6 + hasilHitunganGejala7 * (1 - Combine_CFold_CF6);
                    double Combine_CFold_CF8 = Combine_CFold_CF7 + hasilHitunganGejala8 * (1 - Combine_CFold_CF7);
                    double Combine_CFold_CF9 = Combine_CFold_CF8 + hasilHitunganGejala9 * (1 - Combine_CFold_CF8);
                    double Combine_CFold_CF10 = Combine_CFold_CF9 + hasilHitunganGejala10 * (1 - Combine_CFold_CF9);
                    double Combine_CFold_CF11 = Combine_CFold_CF10 + hasilHitunganGejala11 * (1 - Combine_CFold_CF10);
                    double Combine_CFold_CF12 = Combine_CFold_CF11 + hasilHitunganGejala12 * (1 - Combine_CFold_CF11);
                    double Combine_CFold_CF13 = Combine_CFold_CF12 + hasilHitunganGejala13 * (1 - Combine_CFold_CF12);
                    double Combine_CFold_CF14 = Combine_CFold_CF13 + hasilHitunganGejala14 * (1 - Combine_CFold_CF13);
                    double Combine_CFold_CF15 = Combine_CFold_CF14 + hasilHitunganGejala15 * (1 - Combine_CFold_CF14);
                    double Combine_CFold_CF16 = Combine_CFold_CF15 + hasilHitunganGejala16 * (1 - Combine_CFold_CF15);
                    double Combine_CFold_CF17 = Combine_CFold_CF16 + hasilHitunganGejala17 * (1 - Combine_CFold_CF16);
                    double Combine_CFold_CF18 = Combine_CFold_CF17 + hasilHitunganGejala18 * (1 - Combine_CFold_CF17);
                    double Combine_CFold_CF19 = Combine_CFold_CF18 + hasilHitunganGejala19 * (1 - Combine_CFold_CF18);
                    double Combine_CFold_CF20 = Combine_CFold_CF19 + hasilHitunganGejala20 * (1 - Combine_CFold_CF19);
                    double Combine_CFold_CF21 = Combine_CFold_CF20 + hasilHitunganGejala21 * (1 - Combine_CFold_CF20);
                    double Combine_CFold_CF22 = Combine_CFold_CF21 + hasilHitunganGejala22 * (1 - Combine_CFold_CF21);
                    double Combine_CFold_CF23 = Combine_CFold_CF22 + hasilHitunganGejala23 * (1 - Combine_CFold_CF22);
                    double Combine_CFold_CF24 = Combine_CFold_CF23 + hasilHitunganGejala24 * (1 - Combine_CFold_CF23);
                    double Combine_CFold_CF25 = Combine_CFold_CF24 + hasilHitunganGejala25 * (1 - Combine_CFold_CF24);
                    double Combine_CFold_CF26 = Combine_CFold_CF25 + hasilHitunganGejala26 * (1 - Combine_CFold_CF25);
                    double Combine_CFold_CF27 = Combine_CFold_CF26 + hasilHitunganGejala27 * (1 - Combine_CFold_CF26);
                    double Combine_CFold_CF28 = Combine_CFold_CF27 + hasilHitunganGejala28 * (1 - Combine_CFold_CF27);
                    double Combine_CFold_CF29 = Combine_CFold_CF28 + hasilHitunganGejala29 * (1 - Combine_CFold_CF28);
                    double Combine_CFold_CF30 = Combine_CFold_CF29 + hasilHitunganGejala30 * (1 - Combine_CFold_CF29);
                    double Combine_CFold_CF31 = Combine_CFold_CF30 + hasilHitunganGejala31 * (1 - Combine_CFold_CF30);
                    double Combine_CFold_CF32 = Combine_CFold_CF31 + hasilHitunganGejala32 * (1 - Combine_CFold_CF31);
                    double Combine_CFold_CF33 = Combine_CFold_CF32 + hasilHitunganGejala33 * (1 - Combine_CFold_CF32);
                    double Combine_CFold_CF34 = Combine_CFold_CF33 + hasilHitunganGejala34 * (1 - Combine_CFold_CF33);
                    double Combine_CFold_CF35 = Combine_CFold_CF34 + hasilHitunganGejala35 * (1 - Combine_CFold_CF34);
                    double Combine_CFold_CF36 = Combine_CFold_CF35 + hasilHitunganGejala36 * (1 - Combine_CFold_CF35);
                    double Combine_CFold_CF37 = Combine_CFold_CF36 + hasilHitunganGejala37 * (1 - Combine_CFold_CF36);
                    double Combine_CFold_CF38 = Combine_CFold_CF37 + hasilHitunganGejala38 * (1 - Combine_CFold_CF37);
                    double Combine_CFold_CF39 = Combine_CFold_CF38 + hasilHitunganGejala39 * (1 - Combine_CFold_CF38);
                    double Combine_CFold_CF40 = Combine_CFold_CF39 + hasilHitunganGejala40 * (1 - Combine_CFold_CF39);
                    double Combine_CFold_CF41 = Combine_CFold_CF40 + hasilHitunganGejala41 * (1 - Combine_CFold_CF40);
                    double Combine_CFold_CF42 = Combine_CFold_CF41 + hasilHitunganGejala42 * (1 - Combine_CFold_CF41);
                    double Combine_CFold_CF43 = Combine_CFold_CF42 + hasilHitunganGejala43 * (1 - Combine_CFold_CF42);


                    double hasilHitungGejalaDepresi = (Combine_CFold_CF43 * 100);
                    double hasilBulat = Math.round(hasilHitungGejalaDepresi); // Memulai pembulatan
                    int hasilBulatInt = (int) hasilBulat; // Mengonversi hasil bulatan menjadi tipe data int


                    String JenisDepresi;
                    if (hasilBulatInt <= 50) {
                        JenisDepresi = "\nAnda mengalami depresi ringan dengan persentase " + hasilBulatInt + "%";

                    } else if (hasilBulatInt <= 80) {
                        JenisDepresi = "\nAnda mengalami depresi sedang dengan persentase " + hasilBulatInt + "%";

                    } else {
                        JenisDepresi = "\nAnda Mengalami depresi berat dengan persentase " + hasilBulatInt + "%";

                    }

                    Intent i = new Intent(getApplicationContext(), Hasildiagnosa.class);
                    i.putExtra("nim", nim.getText().toString());
                    i.putExtra("nama", nama.getText().toString());
                    i.putExtra("jk", jk.getText().toString());
                    i.putExtra("jurusan", jurusan.getText().toString());
                    i.putExtra("instansi", instansi.getText().toString());
                    i.putExtra("JenisDepresi", JenisDepresi);
                    i.putExtra("hasilHitungGejalaDepresi", hasilBulatInt);
                    startActivity(i);

                }

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosa.this, Home.class));
            }
        });

        btnkosong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nim.setText("");
                nama.setText("");
                jk.setText("");
                jurusan.setText("");
                instansi.setText("");

                AutoCompleteTextView[] nilaiGejalaArray = {
                        nilaigejala1, nilaigejala2, nilaigejala3, nilaigejala4, nilaigejala5,
                        nilaigejala6, nilaigejala7, nilaigejala8, nilaigejala9, nilaigejala10,
                        nilaigejala11, nilaigejala12, nilaigejala13, nilaigejala14, nilaigejala15,
                        nilaigejala16, nilaigejala17, nilaigejala18, nilaigejala19, nilaigejala20,
                        nilaigejala21, nilaigejala22, nilaigejala23, nilaigejala24, nilaigejala25,
                        nilaigejala26, nilaigejala27, nilaigejala28, nilaigejala29, nilaigejala30,
                        nilaigejala31, nilaigejala32, nilaigejala33, nilaigejala34, nilaigejala35,
                        nilaigejala36, nilaigejala37, nilaigejala38, nilaigejala39, nilaigejala40,
                        nilaigejala41, nilaigejala42, nilaigejala43
                };

                for (AutoCompleteTextView nilaiGejala : nilaiGejalaArray) {
                    nilaiGejala.setText("");
                }
            }
        });

    }
}