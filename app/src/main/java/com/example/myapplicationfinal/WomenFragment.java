package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplicationfinal.Adapter.SectionPageAdapter;
import com.google.android.material.tabs.TabLayout;


public class WomenFragment extends Fragment {

    View view;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View view= inflater.inflate(R.layout.fragment_women, container, false);
     viewPager=view.findViewById(R.id.ViewPager);
tabLayout=view.findViewById(R.id.TabLayoutId);

     return view;
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
        SectionPageAdapter adapter =new SectionPageAdapter(getChildFragmentManager());

adapter.addFragment(new BoyFragment(),"BOY");
        adapter.addFragment(new GirlFragment(),"GIRL");
viewPager.setAdapter(adapter);
    }
}