package com.example.android.timisoaratourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

 //A simple Fragment subclass.

public class ParkFragment extends Fragment {

    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //create an arrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

       locations.add(new Location(R.drawable.parc1,getString(R.string.first_park_name),getString(R.string.Bucovina_park_description),getString(R.string.Bucovina_park_address)));
       locations.add(new Location(R.drawable.parc2,getString(R.string.second_park_name),getString(R.string.Children_park_description),getString(R.string.Children_park_address)));
       locations.add(new Location(R.drawable.parc2,getString(R.string.third_park_name),getString(R.string.Clabucet_park_description),getString(R.string.Clabucet_park_address)));
       locations.add(new Location(R.drawable.parc2,getString(R.string.fourth_park_name),getString(R.string.Lidia_park_description),getString(R.string.Lidia_park_address)));
       locations.add(new Location(R.drawable.parc2,getString(R.string.fith_park_name),getString(R.string.Uzinei_park_description),getString(R.string.Uzinei_park_address)));

       //Create an ArrayAdapter whose data source is a list of strings.
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}




