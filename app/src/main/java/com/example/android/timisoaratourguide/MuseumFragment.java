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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //create an arrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.first_museum_description),getString(R.string.first_museum_address),getString(R.string.first_museum_timetable),getString(R.string.first_museum_phone),getString(R.string.first_museum_website)));
        locations.add(new Location(getString(R.string.second_museum_name),getString(R.string.second_museum_description),getString(R.string.second_museum_address),getString(R.string.second_museum_timetable),getString(R.string.second_museum_phone),getString(R.string.second_museum_website)));
        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.third_museum_description),getString(R.string.third_museum_address),getString(R.string.third_museum_timetable),getString(R.string.third_museum_phone),getString(R.string.third_museum_website)));
        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.fourth_museum_description),getString(R.string.fourth_museum_address),getString(R.string.fourth_museum_timetable),getString(R.string.fourth_museum_phone),getString(R.string.fifth_museum_website)));

        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
