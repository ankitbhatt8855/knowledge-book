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

public class FragmentLouvreMuseum extends Fragment {

    public static FragmentLouvreMuseum newInstance()
    {
        return new FragmentLouvreMuseum();
    }

    private ImageView imageViewLouvreMuseum;
    private ProgressBar progressBarLouvreMuseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_louvre_museum,container,false);

        imageViewLouvreMuseum = view.findViewById(R.id.imageViewLouvreMuseum);
        progressBarLouvreMuseum = view.findViewById(R.id.progressBarLouvreMuseum);

        Picasso.get().load("https://cdn.pixabay.com/photo/2013/04/11/19/46/building-102840_960_720.jpg")
                .into(imageViewLouvreMuseum, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLouvreMuseum.setVisibility(View.INVISIBLE);

                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarLouvreMuseum.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}