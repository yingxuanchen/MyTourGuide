package com.example.android.mytourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /** Resource ID for the background color for this list of places */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the View in the list_item.xml layout. Get the text or image from the currentPlace
        // object and set this text or image on the corresponding View.
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getAddress());

        TextView openingHoursTextView = listItemView.findViewById(R.id.opening_hours_text_view);
        openingHoursTextView.setText(currentPlace.getOpeningHours());

        TextView websiteTextView = listItemView.findViewById(R.id.website_text_view);
        websiteTextView.setText(currentPlace.getWebsite());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.container);
        textContainer.setBackgroundResource(mColorResourceId);

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}