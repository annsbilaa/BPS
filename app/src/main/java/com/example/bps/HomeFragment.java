package com.example.bps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment{
    Activity context;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    public void onStart(){
        super.onStart();
        CardView cardipm =(CardView) context.findViewById(R.id.cardipm);
        cardipm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ipm.class);
                startActivity(intent);
            }
        });

        CardView cardpdrb =(CardView) context.findViewById(R.id.cardpdrb);
        cardpdrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,pdrb.class);
                startActivity(intent);
            }
        });

        CardView cardkemiskinan =(CardView) context.findViewById(R.id.cardkemiskinan);
        cardkemiskinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,kemiskinan.class);
                startActivity(intent);
            }
        });
    }
}