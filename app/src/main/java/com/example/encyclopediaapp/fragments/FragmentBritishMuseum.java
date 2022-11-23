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

public class FragmentBritishMuseum extends Fragment {

    public static FragmentBritishMuseum newInstance()
    {
        return new FragmentBritishMuseum();
    }

    private ImageView imageViewBritishMuseum;
    private ProgressBar progressBarBritishMuseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_british_museum,container,false);

        imageViewBritishMuseum = view.findViewById(R.id.imageViewBritishMuseum);
        progressBarBritishMuseum = view.findViewById(R.id.progressBarBritishMuseum);



        Picasso.get().load("https://cdn.pixabay.com/photo/2017/04/05/01/10/natural-history-museum-2203648_960_720.jpg")
                .into(imageViewBritishMuseum, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBritishMuseum.setVisibility(View.INVISIBLE);

                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarBritishMuseum.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}