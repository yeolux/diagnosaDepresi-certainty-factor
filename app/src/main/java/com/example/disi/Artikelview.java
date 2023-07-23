package com.example.disi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Artikelview extends AppCompatActivity {
    ListView pdfListview;
    private int pdfFiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikelview);

        pdfListview = findViewById(R.id.myPDFList);

        String[] pdfFiles = {"Depression",
                "Mengenal Kesehatan Jiwa",
                "Emotional Healing Therapy",
                "Keperawatan Jiwa Mengenal Kesehatan Mental",
                "Buah Dan Sayuran Yang Berkhasiat Untuk Menghilangkan Stres Dan Depresi",
                "Gelombang Lautan Jiwa Sebuah Psikomemoar",
                "Loving the Wounded Soul (Alasan dan Tujuan Depresi Hadir di Hidup Manusia)",
                "Mengenal Depresi",
                "Petunjuk Hidup Bebas Stres dan Cemas"};

        CustomAdapter adapter = new CustomAdapter(this, pdfFiles);
        pdfListview.setAdapter(adapter);

        pdfListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String item = pdfFiles[i];

                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);
            }
        });
    }
    private class CustomAdapter extends ArrayAdapter<String> {
        private Context mContext;
        private String[] mItems;

        public CustomAdapter(Context context, String[] items) {
            super(context, R.layout.itemlist, items);
            this.mContext = context;
            this.mItems = items;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.itemlist, parent, false);

            ImageView imageView = view.findViewById(R.id.image);
            TextView textView = view.findViewById(R.id.textview);

            imageView.setImageResource(R.drawable.book);
            textView.setText(mItems[position]);

            return view;
        }
    }

    }
