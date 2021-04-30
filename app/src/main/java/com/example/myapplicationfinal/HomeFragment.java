package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {
    ImageView g1,g2,g3,g4;

    @Nullable
    @Override
    public View onCreateView(    @Nullable LayoutInflater inflater,    @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {

     View view= inflater.inflate(R.layout.fragment_home, container, false);
        ImageView g1=(ImageView)view.findViewById(R.id.g1Id);
        ImageView g2=(ImageView)view.findViewById(R.id.g2Id);
        ImageView g3=(ImageView)view.findViewById(R.id.g3Id);
        ImageView g4=(ImageView)view.findViewById(R.id.g4Id);
   g1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           FragmentTransaction fr=getFragmentManager().beginTransaction();
           fr.replace(R.id.fragment_container,new MenFragment());
           fr.addToBackStack(null);
           fr.commit();
       }
   });

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new WomenFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ImageSliderFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });


        return view;
    }
}