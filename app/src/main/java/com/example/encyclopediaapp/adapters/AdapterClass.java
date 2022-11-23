package com.example.encyclopediaapp.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.encyclopediaapp.ModelClass;
import com.example.encyclopediaapp.R;
import com.example.encyclopediaapp.activities.CountriesActivity;
import com.example.encyclopediaapp.activities.LeadersActivity;
import com.example.encyclopediaapp.activities.MuseumsActivity;
import com.example.encyclopediaapp.activities.WondersActivity;

import java.util.ArrayList;


//The adapter class that we created should extend RecyclerView.Adapter class but it will also add 3methods that are:-
// onCreateViewHolder(),onBindViewHolder(),getItemCount()
public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private final ArrayList<ModelClass> modelList; //to receive objects from ModelClass
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    //These 3 methods have to be implemented by us
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        //false because we don't want to be attached, we want it is reused again and again

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ModelClass model = modelList.get(position);
        holder.textViewSplash.setText(model.getCategoryName()); //put the category name on the TextView
        holder.imageViewSplash.setImageResource(context.getResources() //show category name on the screen in the CardView
                .getIdentifier(model.getImageName(),"drawable",context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //When any category is clicked we want the user to move to a relevant screen

                //There are 4 cards and their positions are 0,1,2,3.
                if (position == 0)
                {
                    //Since we are in AdapterClass so write context in the intent!!
                    Intent intent = new Intent(context, CountriesActivity.class);
                    context.startActivity(intent);
                }
                if (position == 1)
                {
                    Intent intent = new Intent(context, LeadersActivity.class);
                    context.startActivity(intent);
                }
                if (position == 2)
                {
                    Intent intent = new Intent(context, MuseumsActivity.class);
                    context.startActivity(intent);
                }
                if (position == 3)
                {
                    Intent intent = new Intent(context, WondersActivity.class);
                    context.startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}