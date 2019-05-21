package com.akhsanaf.uts_akb4.Adapter;

/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 21 Mei 2019
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.akhsanaf.uts_akb4.Model.FriendsModel;
import com.akhsanaf.uts_akb4.R;
import java.util.ArrayList;

public class MyFriendsAdapter extends RecyclerView.Adapter<MyFriendsAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<FriendsModel> friendsModels;

    public MyFriendsAdapter(Context context, ArrayList<FriendsModel> friendsModels) {
        this.context = context;
        this.friendsModels = friendsModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friends, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        FriendsModel friendsModel = friendsModels.get(position);
        holder.txtNim.setText(friendsModel.getNim());
        holder.txtNama.setText(friendsModel.getNama());
        holder.txtKelas.setText(friendsModel.getKelas());
        holder.txtTelp.setText(friendsModel.getTelephone());
        holder.txtEmail.setText(friendsModel.getEmail());
        holder.txtSosmed.setText(friendsModel.getSosmed());
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeItem(position);
            }
        });
        holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateItem(position);
            }
        });
    }


    public void removeItem(int position) {
        friendsModels.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, friendsModels.size());
    }

    private void updateItem(int position) {
        friendsModels.set(position,new FriendsModel("10116094","Agus Pratama","IF4","082740540111","aguspratama@gmail.com","instagram : aguspratama"));
        notifyItemChanged(position,friendsModels);
    }
    @Override
    public int getItemCount() {
        return friendsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNim;

        public TextView txtNama;

        public TextView txtKelas;

        public TextView txtTelp;

        public TextView txtEmail;

        public TextView txtSosmed;

        public ImageView btnDelete;

        public ImageView btnEdit;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView txt_nim = (TextView) itemView.findViewById(R.id.txt_nim);
            TextView txt_nama = (TextView) itemView.findViewById(R.id.txt_nama);
            TextView txt_kelas  = (TextView) itemView.findViewById (R.id.txt_kelas);
            TextView txt_tlp  = (TextView) itemView.findViewById (R.id.txt_tlp);
            TextView txt_email  = (TextView) itemView.findViewById (R.id.txt_email);
            TextView txt_sosmed  = (TextView) itemView.findViewById (R.id.txt_sosmed);
            ImageView btn_delete = (ImageView) itemView.findViewById (R.id.btn_delete);
            ImageView btn_edit = (ImageView) itemView.findViewById (R.id.btn_edit);

        }
    }
}