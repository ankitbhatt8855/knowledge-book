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

public class FragmentMachuPicchu extends Fragment {

    public static FragmentMachuPicchu newInstance()
    {
        return new FragmentMachuPicchu();
    }

    private ImageView imageViewMachuPicchu;
    private ProgressBar progressBarMachuPicchu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_machu_picchu,container,false);

        imageViewMachuPicchu = view.findViewById(R.id.imageViewMachuPicchu);
        progressBarMachuPicchu = view.findViewById(R.id.progressBarMachuPicchu);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Before_Machu_Picchu.jpg/1024px-Before_Machu_Picchu.jpg")
                .into(imageViewMachuPicchu, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMachuPicchu.setVisibility(View.INVISIBLE);

                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarMachuPicchu.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}