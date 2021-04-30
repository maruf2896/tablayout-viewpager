package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MenFragment extends Fragment {
ImageView g5,g6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

 View view =inflater.inflate(R.layout.fragment_men, container, false);
        ImageView g5=(ImageView)view.findViewById(R.id.g5Id);
        ImageView g6=(ImageView)view.findViewById(R.id.g6Id);

        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewFragment webViewFragment=new WebViewFragment();
                Bundle bundle=new Bundle();
                bundle.putString("url","https://www.youtube.com/watch?v=lSx3RuHH5LE");
                webViewFragment.setArguments(bundle);
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,webViewFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewFragment webViewFragment=new WebViewFragment();
                Bundle bundle=new Bundle();
                bundle.putString("url","https://www.youtube.com/watch?v=lSx3RuHH5LE");
                webViewFragment.setArguments(bundle);
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,webViewFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

 return view;
    }
}