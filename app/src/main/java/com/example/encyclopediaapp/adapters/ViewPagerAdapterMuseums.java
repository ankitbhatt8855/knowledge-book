package com.example.encyclopediaapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.encyclopediaapp.fragments.FragmentBritishMuseum;
import com.example.encyclopediaapp.fragments.FragmentGreatWallOfChina;
import com.example.encyclopediaapp.fragments.FragmentLouvreMuseum;
import com.example.encyclopediaapp.fragments.FragmentMachuPicchu;
import com.example.encyclopediaapp.fragments.FragmentTajMahal;

public class ViewPagerAdapterMuseums extends FragmentStateAdapter {

    public ViewPagerAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        //In which position do you want to return and display which fragment? It is defined here.
        Fragment fragment;

        switch (position)
        {
            case 0:
                fragment = FragmentLouvreMuseum.newInstance();
                break;

            case 1:
                fragment = FragmentBritishMuseum.newInstance();
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