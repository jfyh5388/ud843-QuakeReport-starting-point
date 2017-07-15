package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nxf31834 on 7/11/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Earthquake currentEarthquake = getItem(position);


        // Find the TextView in the earthquake_list_item.xmlst_item.xml layout with the ID version_name
        TextView levelTextView = (TextView) listItemView.findViewById(R.id.level);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        levelTextView.setText(currentEarthquake.getmLevel());

        // Find the TextView in the earthquake_list_iteme_list_item.xml layout with the ID version_number
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationTextView.setText(currentEarthquake.getmLocation());

        // Find the TextView in the earthquake_list_item.xmlst_item.xml layout with the ID version_number
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquake.getmDate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
