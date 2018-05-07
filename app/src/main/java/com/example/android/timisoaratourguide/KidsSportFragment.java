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
public class KidsSportFragment extends Fragment {


    public KidsSportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //create an arrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.first_kidssport_name),getString(R.string.first_kidssport_description),getString(R.string.first_kidssport_address),getString(R.string.first_kidssport_timetable),getString(R.string.first_kidssport_phone),getString(R.string.first_kidssport_website)));
        locations.add(new Location(getString(R.string.second_kidssport_name),getString(R.string.second_kidssport_description),getString(R.string.second_kidssport_address),getString(R.string.second_kidssport_timetable),getString(R.string.second_kidssport_phone),getString(R.string.second_kidssport_website)));
        locations.add(new Location(getString(R.string.first_kidssport_name),getString(R.string.third_kidssport_description),getString(R.string.third_kidssport_address),getString(R.string.third_kidssport_timetable),getString(R.string.third_kidssport_phone),getString(R.string.third_kidssport_website)));

        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
