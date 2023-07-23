package com.example.disi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Depression")) {
            myPDFViewer.fromAsset("ebook1.pdf").load();
        }

        if (getItem.equals("Mengenal Kesehatan Jiwa")) {
            myPDFViewer.fromAsset("ebook2.pdf").load();
        }

        if (getItem.equals("Emotional Healing Therapy")) {
            myPDFViewer.fromAsset("ebook3.pdf").load();
        }

        if (getItem.equals("Keperawatan Jiwa Mengenal Kesehatan Mental")) {
            myPDFViewer.fromAsset("ebook4.pdf").load();
        }

        if (getItem.equals("Buah Dan Sayuran Yang Berkhasiat Untuk Menghilangkan Stres Dan Depresi")) {
            myPDFViewer.fromAsset("ebook5.pdf").load();
        }

        if (getItem.equals("Gelombang Lautan Jiwa Sebuah Psikomemoar")) {
            myPDFViewer.fromAsset("ebook6.pdf").load();
        }

        if (getItem.equals("Loving the Wounded Soul (Alasan dan Tujuan Depresi Hadir di Hidup Manusia)")) {
            myPDFViewer.fromAsset("ebook7.pdf").load();
        }

        if (getItem.equals("Mengenal Depresi")) {
            myPDFViewer.fromAsset("ebook8.pdf").load();
        }

        if (getItem.equals("Petunjuk Hidup Bebas Stres dan Cemas")) {
            myPDFViewer.fromAsset("ebook9.pdf").load();
        }


    }
}