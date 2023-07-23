package com.example.disi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

public class Videos extends AppCompatActivity {
    VideoView videoview;
    ListView listview;
    ArrayList<String>videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        videoview = findViewById(R.id.videoview);
        listview = findViewById(R.id.lvideo);

        videolist = new ArrayList<>();
        videolist.add("Apa itu Depresi");
        videolist.add("Teori keputusasaan dalam depresi");
        videolist.add("Depresi Tersembunyi _ 5 Tanda Kamu Menutupi Depresi dalam Senyuman");
        videolist.add("Apa itu kelelahan akibat depresi");
        videolist.add("9 Penyebab anak zaman sekarang lebih banyak yang mengalami depresi");
        videolist.add("7 Rahasia untuk memiliki mental yang kuat");
        videolist.add("6 Tanda Ini Depresi, Bukan Sekedar Kelelahan");
        videolist.add("6 Hal yang Perlu Kamu Ketahui Mengenai Penderita Depresi (BAGIAN 1)");
        videolist.add("6 Hal yang Perlu Kamu Ketahui Mengenai Penderita Depresi (BAGIAN 2)");
        videolist.add("6 Hal Menyakitkan Mengenai Depresi yang Tidak Pernah Dibicarakan Orang-Orang");
        videolist.add("6 Kebiasaan yang Membuat Mental Semakin Kuat");
        videolist.add("5 Tanda Depresi yang Tersembunyi");
        videolist.add("5 Tanda Depresi Pada Remaja");
        videolist.add("5 Makanan yang Harus Kamu Hindari Jika Mengalami Depresi");
        videolist.add("4 Alasan Mengapa Depresi Semakin Sering Terjadi");
        videolist.add("10 Tanda Peringatan Depresi Besar");

        adapter = new CustomAdapter(this, videolist);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video1));
                        break;
                    case 1:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video2));
                        break;
                    case 2:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video3));
                        break;
                    case 3:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video4));
                        break;
                    case 4:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video5));
                        break;
                    case 5:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video6));
                        break;
                    case 6:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video7));
                        break;
                    case 7:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video8));
                        break;
                    case 8:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video9));
                        break;
                    case 9:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video10));
                        break;
                    case 10:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video11));
                        break;
                    case 11:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video12));
                        break;
                    case 12:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video13));
                        break;
                    case 13:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video14));
                        break;
                    case 14:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video15));
                        break;
                    case 15:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video16));
                        break;
                    default:
                        break;

                }
                videoview.setMediaController(new MediaController(Videos.this));
                videoview.requestFocus();
                videoview.start();
            }
        });

    }

    private class CustomAdapter extends ArrayAdapter<String> {
        private Context mContext;
        private ArrayList<String> mItems;

        public CustomAdapter(Context context, ArrayList<String> items) {
            super(context, R.layout.itemlistv, items);
            this.mContext = context;
            this.mItems = items;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.itemlistv, parent, false);

            ImageView imageView = view.findViewById(R.id.imagev);
            TextView textView = view.findViewById(R.id.textviewv);

            imageView.setImageResource(R.drawable.play);
            textView.setText(mItems.get(position));

            return view;
        }
    }
}