package com.example.android.timisoaratourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view pager that will allow the user to swipe between the fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        //set the adapter on to the viewpager
        viewPager.setAdapter(adapter);

        //find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //connect the tab layout with the view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}


