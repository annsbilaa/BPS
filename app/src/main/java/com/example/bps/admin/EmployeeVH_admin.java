package com.example.bps.admin;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bps.R;

public class EmployeeVH_admin extends RecyclerView.ViewHolder
{
    public TextView txt_name,txt_position,txt_option;
    public EmployeeVH_admin(@NonNull View itemView)
    {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        txt_position = itemView.findViewById(R.id.txt_position);
        txt_option = itemView.findViewById(R.id.txt_option);
    }
}
