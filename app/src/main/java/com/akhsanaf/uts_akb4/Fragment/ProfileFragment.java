package com.akhsanaf.uts_akb4.Fragment;
/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 15 Mei 2019
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.akhsanaf.uts_akb4.R;




public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
