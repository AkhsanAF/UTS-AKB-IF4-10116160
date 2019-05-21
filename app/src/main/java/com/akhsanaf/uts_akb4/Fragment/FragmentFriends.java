package com.akhsanaf.uts_akb4.Fragment;
/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 20 Mei 2019
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.akhsanaf.uts_akb4.Adapter.MyFriendsAdapter;
import com.akhsanaf.uts_akb4.Model.FriendsModel;
import com.akhsanaf.uts_akb4.R;
import java.util.ArrayList;



public class FragmentFriends extends Fragment  {

    FloatingActionButton btn;
    RecyclerView rvFriends;

    //private MainFriendsPresenter mainFriendsPresenter;
    private MyFriendsAdapter myFriendsAdapter;
    private ArrayList<FriendsModel> friendsModels = new ArrayList<>();

    public FragmentFriends() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn = (Button) view.findViewById (R.id.btn_tambah);
        RecyclerView rvFriends = (RecyclerView) view.findViewById(R.id.rvFriends);


        friendsModels.add(new FriendsModel("10116095","Chandra Delvano","IF3","082240527813","chandradelvano@gmail.com","instagram : delvano"));
        setRecyclerFriends();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friendsModels.add(new FriendsModel("10116096","Budi Soegoto","IF3","082240520613","budisoegoto@gmail.com","instagram : budisoegoto"));
                setRecyclerFriends();
            }
        });
    }


    public void setRecyclerFriends() {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        myFriendsAdapter = new MyFriendsAdapter(getContext(),friendsModels);


        rvFriends.setItemAnimator(new DefaultItemAnimator());
        rvFriends.setAdapter(myFriendsAdapter);
        rvFriends.setLayoutManager(layoutManager);
    }
}
