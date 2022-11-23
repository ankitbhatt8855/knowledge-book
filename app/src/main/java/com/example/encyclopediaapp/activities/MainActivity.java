package com.example.encyclopediaapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.encyclopediaapp.adapters.AdapterClass;
import com.example.encyclopediaapp.ModelClass;
import com.example.encyclopediaapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //define how data is displayed on the screen and i decide GridLayout with 2 columns.
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


        arrayList = new ArrayList<>();

        //In total there are 4 categories that will be displayed on the Main screen
        ModelClass modelClass1 = new ModelClass("countries","The Countries");
        ModelClass modelClass2 = new ModelClass("leaders","The Leaders");
        ModelClass modelClass3 = new ModelClass("museums","The Museums");
        ModelClass modelClass4 = new ModelClass("wonders","Wonders of the World");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);

    }
}