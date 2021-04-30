package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class ImageSliderFragment extends Fragment {

private int[]images;
private SliderAdapter adapter;
private SliderView sliderView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View  view =inflater.inflate(R.layout.fragment_image_slider, container, false);

       sliderView=view.findViewById(R.id.SliderView);
        images=new int[]{R.drawable.automobil,R.drawable.electronic,R.drawable.football};
adapter=new SliderAdapter(images);
sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.startAutoCycle();
       return view;
    }
}