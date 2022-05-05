package com.isilsubasi.hafta11.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.isilsubasi.hafta11.R;

public class HocaViewHolder extends RecyclerView.ViewHolder {

    ImageView imgHoca;
    TextView txtIsim;
    TextView txtMail;
    TextView txtDers;


    public HocaViewHolder(@NonNull View itemView) {
        super(itemView);

        imgHoca=itemView.findViewById(R.id.imgHoca);
        txtIsim=itemView.findViewById(R.id.txtIsim);
        txtMail=itemView.findViewById(R.id.txtMail);
        txtDers=itemView.findViewById(R.id.txtDers);


    }
}
