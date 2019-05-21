package com.akhsanaf.uts_akb4;
/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 19 Mei 2019
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.akhsanaf.uts_akb4.Fragment.FragmentFriends;
import com.akhsanaf.uts_akb4.Fragment.HomeFragment;
import com.akhsanaf.uts_akb4.Fragment.ProfileFragment;
import com.akhsanaf.uts_akb4.Fragment.KontakFragment;


public class MainActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set default nya Home Fragment
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        // listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }


@Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
            case R.id.navigation_kontak:
                fragment = new KontakFragment();
                break;
            case R.id.navigation_daftarteman:
                fragment = new FragmentFriends();
                break;
        }
        return loadFragment(fragment);
    }
}
