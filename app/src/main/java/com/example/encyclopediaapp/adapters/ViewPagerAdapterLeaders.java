package com.example.encyclopediaapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.encyclopediaapp.fragments.FragmentAlexander;
import com.example.encyclopediaapp.fragments.FragmentAshoka;
import com.example.encyclopediaapp.fragments.FragmentGreatWallOfChina;
import com.example.encyclopediaapp.fragments.FragmentMachuPicchu;
import com.example.encyclopediaapp.fragments.FragmentTajMahal;

public class ViewPagerAdapterLeaders extends FragmentStateAdapter {

    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override

    //In which position do you want to return and display which fragment? It is defined here.
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position)
        {
            case 0:
                fragment = FragmentAshoka.newInstance();
                break;

            case 1:
                fragment = FragmentAlexander.newInstance();
                break;

            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}