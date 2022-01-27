package com.example.bps.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.bps.ImageSliderAdapter;
import com.example.bps.R;
import com.example.bps.admin.ipmRVActivity_admin;
import com.example.bps.admin.kemiskinanRVActivity_admin;
import com.example.bps.admin.pdrbRVActivity_admin;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class userHomeFragment extends Fragment{
    Activity context;
    
    int[] images =
            {R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_homeuser, container, false);
        context = getActivity();

        SliderView sliderView = (SliderView) root.findViewById(R.id.image_slider);

        ImageSliderAdapter sliderAdapter = new ImageSliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
        return root;
    }

    public void onStart(){
        super.onStart();
        CardView cardipm =(CardView) context.findViewById(R.id.cardipm);
        cardipm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ipmRVActivity_admin.class);
                startActivity(intent);
            }
        });

        CardView cardpdrb =(CardView) context.findViewById(R.id.cardpdrb);
        cardpdrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, pdrbRVActivity_admin.class);
                startActivity(intent);
            }
        });

        CardView cardkemiskinan =(CardView) context.findViewById(R.id.cardkemiskinan);
        cardkemiskinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, kemiskinanRVActivity_admin.class);
                startActivity(intent);
            }
        });
    }
}