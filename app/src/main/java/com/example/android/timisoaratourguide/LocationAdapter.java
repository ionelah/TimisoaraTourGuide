package com.example.android.timisoaratourguide;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.ImageView;
import android.widget.TextView;

/* LocationAdapter is an ArrayAdaptor that can provide the layout for each list
* based on a data source, which is a list of location objects
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /** we create our constructor. The context is used to inflate the layout file.
     * The list is the data we want to populate the lists
     * @param context used to inflate the layout file
     * @param locations a list of location objects
     */
    public LocationAdapter(Context context, ArrayList<Location>locations) {
        super(context, 0, locations);
    }

    /** Provides a view for an AdapterView (ListView, GridView...)
     *
     * @param position - the position in the list of data that shoul be displayed in the list item view
     * @param convertView - the recycled view to populate
     * @param parent - the parent ViewGroup that is used for inflation
     * @return - the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the Location object located at the position in the list
        Location currentLocation = getItem(position);

        //find the ImageView in the list_item.xml layout with the ID image
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentLocation.hasImage()) {
            //get the image for the current word and set this to the Image View
            defaultImageView.setImageResource(currentLocation.getImageResourceID());
            //make sure the is visible
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else {
            defaultImageView.setVisibility(View.GONE);
        }

        //find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        //get the name for the current activity object and set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        //find the TextView in the list_item.xml layout with the ID description_text_view
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        //get the description for the current activity and set this text on the default text view
        descriptionTextView.setText(currentLocation.getDescription());

        //find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        //get the address for the current activity and set this text on the default text view
        addressTextView.setText(currentLocation.getAddress());

        //find the TextView in the list_item.xml layout with the ID timetable_text_view
        TextView timetableTextView = (TextView) listItemView.findViewById(R.id.timetable_text_view);
        //get the opening and closing hours for the current activity and set this text on the default text view
        timetableTextView.setText(currentLocation.getTimetable());

        //find the TextView in the list_item.xml layout with the ID phone_text_view
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        //get the phone for the current activity and set this text on the default text view
        phoneTextView.setText(currentLocation.getPhone());

        //find the TextView in the list_item.xml layout with the ID website_text_view
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);
        //get the website for the current activity and set this text on the default text view
        websiteTextView.setText(currentLocation.getWebsite());

        //return the whole list item layout
        return listItemView;
    }
}

