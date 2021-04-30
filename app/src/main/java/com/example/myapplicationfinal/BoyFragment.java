package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class BoyFragment extends Fragment {

ImageView g7,g8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  view= inflater.inflate(R.layout.fragment_boy, container, false);
        g7=view.findViewById(R.id.g7Id);
        g8=view.findViewById(R.id.g8Id);


        return view;
    }
}