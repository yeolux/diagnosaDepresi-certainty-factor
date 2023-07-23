package com.example.disi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.xmlpull.v1.XmlPullParser;

import java.util.Calendar;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private CardView btncard, btnpetunjuk, btndiagnosa, btnartikel, btnvideo;
    private TextView salam;
    private static final int REQUEST_SIGN_IN = 1;
    private SharedPreferences sharedPreferences;
    private FirebaseAuth auth;

    androidx.appcompat.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sharedPreferences = getSharedPreferences("loginStatus", MODE_PRIVATE);

        auth = FirebaseAuth.getInstance();
        btnpetunjuk = findViewById(R.id.btnpetunjuk);
        btndiagnosa = findViewById(R.id.btndiagnosa);
        btnartikel = findViewById(R.id.btnartikel);
        btnvideo = findViewById(R.id.btnvideo);
        salam = findViewById(R.id.salam);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        toolbar.setNavigationIcon(R.drawable.menu);

        btncard = findViewById(R.id.btnpetunjuk);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        navigationView.bringToFront();
        navigationView.setCheckedItem(R.id.nav_home);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        Calendar kalender = Calendar.getInstance();
        int jam = kalender.get(Calendar.HOUR_OF_DAY);

        if (jam >= 0 && jam < 12) {
            salam.setText("Good Morning");
        } else if (jam >= 12 && jam < 16) {
            salam.setText("Good Afternoon");
        } else if (jam >= 16 && jam < 21) {
            salam.setText("Good Evening");
        } else if (jam >= 21 && jam < 24) {
            salam.setText("Good Night");
        } else {
            salam.setText("Welcome");
        }

        btnpetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Petunjuk.class));
            }
        });

        btndiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Diagnosa.class));
            }
        });

        btnartikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Artikelview.class));
            }
        });

        btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Videos.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                break;
            case R.id.nav_desk:
                Intent intent = new Intent(Home.this, Petunjuk.class);
                startActivity(intent);
                break;
            case R.id.nav_diagnosa:
                Intent i = new Intent(Home.this, Diagnosa.class);
                startActivity(i);
                break;
            case R.id.nav_ebook:
                Intent e = new Intent(Home.this, Artikelview.class);
                startActivity(e);
                break;
            case R.id.nav_video:
                Intent v = new Intent(Home.this, Videos.class);
                startActivity(v);
                break;
            case R.id.nav_keluar:
                showExitConfirmationDialog();
                break;
            case R.id.nav_logout:
                logout();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private void logout() {
        SharedPreferences sharedPreferences = getSharedPreferences("login_status", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("status", "");
        editor.apply();

        // Logout dari Firebase Authentication
        auth.signOut();

        // Redirect ke halaman SignIn
        Intent intent = new Intent(Home.this, SignIn.class);
        startActivity(intent);
        finish();
    }

    private void showExitConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Konfirmasi Keluar");
        builder.setMessage("Apakah Anda yakin ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Kode yang dijalankan jika tombol "Ya" diklik
                finish(); // Mengakhiri aktivitas aplikasi
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Kode yang dijalankan jika tombol "Tidak" diklik
                dialog.dismiss(); // Menutup dialog konfirmasi
            }
        });
        builder.show();
    }
}