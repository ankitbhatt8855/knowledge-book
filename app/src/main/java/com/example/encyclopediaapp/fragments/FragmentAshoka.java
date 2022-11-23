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

public class FragmentAshoka extends Fragment {

    public static FragmentAshoka newInstance()
    {
        return new FragmentAshoka();
    }

    private ImageView imageViewAshoka;
    private ProgressBar progressBarAshoka;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ashoka,container,false);

        imageViewAshoka = view.findViewById(R.id.imageViewAshoka);
        progressBarAshoka = view.findViewById(R.id.progressBarAshoka);

        Picasso.get().load("https://www.shutterstock.com/image-illustration/samrat-ashoka-maurya-most-popular-600w-1871914297.jpg")
                .into(imageViewAshoka, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAshoka.setVisibility(View.INVISIBLE);

                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarAshoka.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}