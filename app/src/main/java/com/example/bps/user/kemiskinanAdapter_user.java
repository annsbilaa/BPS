package com.example.bps.user;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bps.R;
import com.example.bps.kemiskinan.datakemiskinan;

import java.util.ArrayList;

public class kemiskinanAdapter_user extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private Context context;
    ArrayList<datakemiskinan> list = new ArrayList<>();
    public kemiskinanAdapter_user(Context ctx)
    {
        this.context = ctx;
    }
    public void setItems(ArrayList<datakemiskinan> emp)
    {
        list.addAll(emp);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_user,parent,false);
        return new EmployeeVH_user(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        datakemiskinan e = null;
        this.onBindViewHolder(holder,position,e);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, datakemiskinan e)
    {
        EmployeeVH_user vh = (EmployeeVH_user) holder;
        datakemiskinan emp = e==null? list.get(position):e;
        vh.txt_name.setText(emp.getTahun());
        vh.txt_position.setText(emp.getTotal());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
