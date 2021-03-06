package com.example.android.mytourguide;


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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.parks_name_1),
                getString(R.string.parks_address_1),
                getString(R.string.parks_opening_hours_1),
                getString(R.string.parks_website_1), R.drawable.gardens_by_the_bay));
        places.add(new Place(getString(R.string.parks_name_2),
                getString(R.string.parks_address_2),
                getString(R.string.parks_opening_hours_2),
                getString(R.string.parks_website_2), R.drawable.singapore_botanic_gardens));
        places.add(new Place(getString(R.string.parks_name_3),
                getString(R.string.parks_address_3),
                getString(R.string.parks_opening_hours_3),
                getString(R.string.parks_website_3), R.drawable.bukit_timah));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
