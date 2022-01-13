package com.example.bps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.bps.fragmentslider.page1;
import com.example.bps.fragmentslider.page2;
import com.example.bps.fragmentslider.page3;
import com.example.bps.fragmentslider.page4;
import com.example.bps.fragmentslider.page5;
import com.google.android.material.tabs.TabLayout;

public class AboutFragment extends Fragment {
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    public AboutFragment (){

    }

    public static  AboutFragment getInstance() {return  new AboutFragment();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_about, container, false);
        viewPager = myFragment.findViewById(R.id.pager);
        tabLayout = myFragment.findViewById(R.id.tab_layout);

        return  myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
         SliderAdapter adapter= new SliderAdapter(getChildFragmentManager());

        adapter.addFragment(new page1(), "Informasi Umum");
        adapter.addFragment(new page2(), "Visi Misi");
        adapter.addFragment(new page3(), "Tugas,fungsi dan kewenangan");
        adapter.addFragment(new page4(), "Struktur Organisasi");
        adapter.addFragment(new page5(), "Pengolahan Data");

        viewPager.setAdapter(adapter);
    }
}