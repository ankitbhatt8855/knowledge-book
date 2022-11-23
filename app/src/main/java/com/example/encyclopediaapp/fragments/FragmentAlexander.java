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

public class FragmentAlexander extends Fragment {

    public static FragmentAlexander newInstance()
    {
        return new FragmentAlexander();
    }

    private ImageView imageViewAlexander;
    private ProgressBar progressBarAlexander;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_alexander,container,false);

        imageViewAlexander = view.findViewById(R.id.imageViewAlexander);
        progressBarAlexander = view.findViewById(R.id.progressBarAlexander);

        Picasso.get().load("https://cdn.pixabay.com/photo/2017/09/03/15/12/greece-2710626_960_720.jpg")
                .into(imageViewAlexander, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAlexander.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarAlexander.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}