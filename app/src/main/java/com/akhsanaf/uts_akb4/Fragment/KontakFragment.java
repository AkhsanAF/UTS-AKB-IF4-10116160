package com.akhsanaf.uts_akb4.Fragment;
/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 15 Mei 2019
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.akhsanaf.uts_akb4.R;



public class KontakFragment extends Fragment {

    ImageView fb;


    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);




    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        ImageView fb = (ImageView) view.findViewById(R.id.facebook);
        ImageView tw = (ImageView) view.findViewById(R.id.twitter);
        ImageView ig = (ImageView) view.findViewById(R.id.instagram);
        ImageView mp = (ImageView) view.findViewById(R.id.mapView);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://web.facebook.com/akhsan.andraf");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });


        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://twitter.com/Akhsan_AndraF");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://www.instagram.com/akhsanandra/");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });


        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Jl.+Ciheulang+II+No.19+D,+Sekeloa,+Kec.+Coblong,+Kota+Bandung,+Jawa+Barat+40134/@-6.8865489,107.6170972,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6ff87d0a653:0xcc9660fe499028aa!8m2!3d-6.8865542!4d107.6192859");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });






    }


}
