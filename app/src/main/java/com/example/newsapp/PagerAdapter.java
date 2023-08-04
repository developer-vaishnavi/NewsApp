package com.example.newsapp;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new HomeFragment();
           case 1:
               return new SportsFragment();
           case 2:
               return new HealthFragment();
           case 3:
               return new ScienceFragment();
           case 4:
               return new EntertainmentFragment();
           case 5:
               return new TechnologyFragment();
           default:
               return null;

       }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Sports";
            case 2:
                return "Health";
            case 3:
                return "Science";
            case 4:
                return "Entertainment";
            case 5:
                return "Technology";
            default:
                return null;

        }
    }
}
