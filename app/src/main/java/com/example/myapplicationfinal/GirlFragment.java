package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class GirlFragment extends Fragment {
ImageView g9,games;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl, container, false);

        g9 = view.findViewById(R.id.g9Id);
        games = view.findViewById(R.id.gamesId);


        g9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewFragment webViewFragment = new WebViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("url", "https://www.youtube.com/watch?v=lSx3RuHH5LE");
                webViewFragment.setArguments(bundle);
                FragmentManager cfManager=getChildFragmentManager();
                FragmentTransaction fragmentTransaction = cfManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, webViewFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
return view;
    }
    }
