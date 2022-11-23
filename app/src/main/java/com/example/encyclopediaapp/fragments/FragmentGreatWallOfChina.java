package com.example.encyclopediaapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.encyclopediaapp.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentGreatWallOfChina extends Fragment {



    public static FragmentGreatWallOfChina newInstance()
    {
        return new FragmentGreatWallOfChina();
    }

    private ImageView imageViewGreatWallofChina;
    private ProgressBar progressBarGreatWallofChina;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_great_wall_of_china,container,false);

        imageViewGreatWallofChina = view.findViewById(R.id.imageViewGreatWallofChina);
        progressBarGreatWallofChina = view.findViewById(R.id.progressBarGreatWallofChina);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/1280px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                .into(imageViewGreatWallofChina, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGreatWallofChina.setVisibility(View.INVISIBLE);

                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarGreatWallofChina.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}