package com.example.android.timisoaratourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

        locations.add(new Location(getString(R.string.first_restaurant_name), getString(R.string.first_restaurant_description),getString(R.string.first_restaurant_address),getString(R.string.first_restaurant_timetable),getString(R.string.first_restaurant_phone),getString(R.string.first_restaurant_website)));
        locations.add(new Location(getString(R.string.second_restaurant_name), getString(R.string.second_restaurant_description),getString(R.string.second_restaurant_address),getString(R.string.second_restaurant_timetable),getString(R.string.second_restaurant_phone),getString(R.string.second_restaurant_website)));
        locations.add(new Location(getString(R.string.third_restaurant_name), getString(R.string.third_restaurant_description),getString(R.string.third_restaurant_address),getString(R.string.third_restaurant_timetable),getString(R.string.third_restaurant_phone),getString(R.string.third_restaurant_website)));
        locations.add(new Location(getString(R.string.fourth_restaurant_name), getString(R.string.fourth_restaurant_description),getString(R.string.fourth_restaurant_address),getString(R.string.fourth_restaurant_timetable),getString(R.string.fourth_restaurant_phone),getString(R.string.fourth_restaurant_website)));
        locations.add(new Location(getString(R.string.fith_restaurant_name), getString(R.string.fifth_restaurant_description),getString(R.string.fifth_restaurant_address),getString(R.string.fifth_restaurant_timetable),getString(R.string.fifth_restaurant_phone),getString(R.string.fifth_restaurant_website)));
        locations.add(new Location(getString(R.string.sixth_restaurant_name), getString(R.string.sixth_restaurant_description),getString(R.string.sixth_restaurant_address),getString(R.string.sixth_restaurant_timetable),getString(R.string.sixth_restaurant_phone),getString(R.string.sixth_restaurant_website)));


        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
