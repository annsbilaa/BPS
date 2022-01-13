package com.example.bps.fragmentslider;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bps.R;
import com.smarteist.autoimageslider.SliderView;

public class page1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @NonNull Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.page_1, container, false);
//        TextView  tv = (TextView ) rootView.findViewById(R.id.p1);
//        tv.setGravity(Gravity.RIGHT);
        return rootView;
//        return inflater.inflate(R.layout.fragment_map, container, false);
    }
}