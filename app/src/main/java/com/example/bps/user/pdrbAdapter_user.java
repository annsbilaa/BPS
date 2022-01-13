package com.example.bps.user;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bps.R;
import com.example.bps.pdrb.datapdrb;

import java.util.ArrayList;

public class pdrbAdapter_user extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private Context context;
    ArrayList<datapdrb> list = new ArrayList<>();
    public pdrbAdapter_user(Context ctx)
    {
        this.context = ctx;
    }
    public void setItems(ArrayList<datapdrb> emp)
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
        datapdrb e = null;
        this.onBindViewHolder(holder,position,e);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, datapdrb e)
    {
        EmployeeVH_user vh = (EmployeeVH_user) holder;
        datapdrb emp = e==null? list.get(position):e;
        vh.txt_name.setText(emp.getTahun());
        vh.txt_position.setText(emp.getTotal());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
