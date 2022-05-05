package com.isilsubasi.hafta11.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.isilsubasi.hafta11.R;
import com.isilsubasi.hafta11.model.Hoca;
import com.isilsubasi.hafta11.util.GlideUtil;

import java.util.ArrayList;
import java.util.List;

public class HocaAdapter extends RecyclerView.Adapter<HocaViewHolder> {

    List<Hoca> hocalar=new ArrayList<>();
    Context context;

    public HocaAdapter(List<Hoca> hocalar, Context context) {
        this.hocalar = hocalar;
        this.context = context;
    }

    @NonNull
    @Override
    public HocaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_ogretmen,parent,false);
        return new HocaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HocaViewHolder viewHolder, int position) {

        viewHolder.txtMail.setText(hocalar.get(position).getEposta());
        viewHolder.txtIsim.setText(hocalar.get(position).getAdiSoyadi());
        viewHolder.txtDers.setText(hocalar.get(position).getVerdiIDers());

        GlideUtil.resmiIndiripGoster(context,hocalar.get(position).getResimURL(),viewHolder.imgHoca);

    }

    @Override
    public int getItemCount() {
        return hocalar.size();
    }
}
