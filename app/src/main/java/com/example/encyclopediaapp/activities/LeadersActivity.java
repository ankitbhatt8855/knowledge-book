package com.example.encyclopediaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.encyclopediaapp.R;
import com.example.encyclopediaapp.adapters.ViewPagerAdapterCountries;
import com.example.encyclopediaapp.adapters.ViewPagerAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        tabLayoutLeaders = findViewById(R.id.tabLayoutLeaders);
        viewPagerLeaders = findViewById(R.id.viewPagerLeaders);

        ViewPagerAdapterLeaders adapter = new ViewPagerAdapterLeaders(getSupportFragmentManager(),getLifecycle());

        viewPagerLeaders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders
                , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("Ashoka The Great");
                        break;
                    case 1:
                        tab.setText("Alexander The Great");

                }

            }
        });

        tabLayoutMediator.attach();
    }
}