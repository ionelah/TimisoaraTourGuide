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
public class IndoorPlaygroundFragment extends Fragment {


    public IndoorPlaygroundFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //create an arrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.first_playground_name),getString(R.string.first_playground_description),getString(R.string.first_playground_address),getString(R.string.first_playground_timetable),getString(R.string.first_playground_phone),getString(R.string.first_playground_website)));
        locations.add(new Location(getString(R.string.second_playground_name),getString(R.string.second_playground_description),getString(R.string.second_playground_address),getString(R.string.second_playground_timetable),getString(R.string.second_playground_phone),getString(R.string.second_playground_website)));
        locations.add(new Location(getString(R.string.first_playground_name),getString(R.string.third_playground_description),getString(R.string.third_playground_address),getString(R.string.third_playground_timetable),getString(R.string.third_playground_phone),getString(R.string.third_playground_website)));
        locations.add(new Location(getString(R.string.first_playground_name),getString(R.string.fourth_playground_description),getString(R.string.fourth_playground_address),getString(R.string.fourth_playground_timetable),getString(R.string.fourth_playground_phone),getString(R.string.fifth_playground_website)));

        //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
