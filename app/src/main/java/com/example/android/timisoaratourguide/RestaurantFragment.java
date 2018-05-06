package com.example.android.timisoaratourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //create an arrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.first_restaurant_name), getString(R.string.Gloria_restaurant_description),getString(R.string.Gloria_restaurant_address),getString(R.string.Gloria_timetable),getString(R.string.Gloria_phone),getString(R.string.Gloria_website)));
        locations.add(new Location(getString(R.string.second_restaurant_name), getString(R.string.Old_House_restaurant_description),getString(R.string.Old_House_restaurant_address),getString(R.string.Old_House_timetable),getString(R.string.Old_House_phone),getString(R.string.Old_House_website)));
        locations.add(new Location(getString(R.string.third_restaurant_name), getString(R.string.Casa_Bunicii1_restaurant_description),getString(R.string.Casa_Bunicii1_restaurant_address),getString(R.string.Casa_Bunicii1_timetable),getString(R.string.Casa_Bunicii1_phone),getString(R.string.Casa_Bunicii1_website)));
        locations.add(new Location(getString(R.string.fourth_restaurant_name), getString(R.string.Casa_Bunicii2_restaurant_description),getString(R.string.Casa_Bunicii2_restaurant_address),getString(R.string.Casa_Bunicii2_timetable),getString(R.string.Casa_Bunicii2_phone),getString(R.string.Casa_Bunicii2_website)));
        locations.add(new Location(getString(R.string.fith_restaurant_name), getString(R.string.Petito_restaurant_description),getString(R.string.Petito_restaurant_address),getString(R.string.Petito_timetable),getString(R.string.Petito_phone),getString(R.string.Petito_website)));
        locations.add(new Location(getString(R.string.sixth_restaurant_name), getString(R.string.Padurea_Verde_restaurant_description),getString(R.string.Padurea_Verde_restaurant_address),getString(R.string.Padurea_Verde_timetable),getString(R.string.Padurea_Verde_phone),getString(R.string.Padurea_Verde_website)));


        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
