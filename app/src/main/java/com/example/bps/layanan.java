package com.example.bps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class layanan extends AppCompatActivity
{
    int[] images =
            {R.drawable.mottobps,
                    R.drawable.maklumatpelayananbps,
                    R.drawable.jenislayananbps,
                    R.drawable.standarlayananbps,
                    R.drawable.tatatertibbps,
                    R.drawable.alurlayananbps,
                    R.drawable.laporanlayananbps,
                    R.drawable.pengaduanbps};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);

        SliderView sliderView = (SliderView) findViewById(R.id.image_slider);

        ImageSliderAdapter sliderAdapter = new ImageSliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
}
