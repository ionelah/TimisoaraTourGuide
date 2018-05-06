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

        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.RATT_museum_description),getString(R.string.RATT_museum_address),getString(R.string.RATT_museum_timetable),getString(R.string.RATT_museum_phone),getString(R.string.RATT_museum_website)));
        locations.add(new Location(getString(R.string.second_museum_name),getString(R.string.Art_museum_description),getString(R.string.Art_museum_address),getString(R.string.Art_museum_timetable),getString(R.string.Art_museum_phone),getString(R.string.Art_museum_website)));
        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.Banat_Village_museum_description),getString(R.string.Banat_Village_address),getString(R.string.Banat_Village_timetable),getString(R.string.Banat_Village_phone),getString(R.string.Banat_Village_website)));
        locations.add(new Location(getString(R.string.first_museum_name),getString(R.string.Merlin_Theater_description),getString(R.string.Merlin_Theater_address),getString(R.string.Merlin_Theater_timetable),getString(R.string.Merlin_Theater_phone),getString(R.string.Merlin_Theater_website)));

        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
