package com.example.encyclopediaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.encyclopediaapp.R;
import com.example.encyclopediaapp.adapters.ViewPagerAdapterCountries;
import com.example.encyclopediaapp.adapters.ViewPagerAdapterMuseums;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MuseumsActivity extends AppCompatActivity {

    private TabLayout tabLayoutMuseums;
    private ViewPager2 viewPagerMuseums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        tabLayoutMuseums = findViewById(R.id.tabLayoutMuseums);
        viewPagerMuseums = findViewById(R.id.viewPagerMuseums);

        ViewPagerAdapterMuseums adapter = new ViewPagerAdapterMuseums(getSupportFragmentManager(),getLifecycle());

        viewPagerMuseums.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutMuseums, viewPagerMuseums
                , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("Louvre Museum");
                        break;
                    case 1:
                        tab.setText("British Museum");
                }

            }
        });

        tabLayoutMediator.attach();
    }
}