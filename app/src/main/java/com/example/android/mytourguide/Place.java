package com.example.android.mytourguide;

public class Place {
    /** Name of the place */
    private String mName;

    /** Address of the place */
    private String mAddress;

    /** Opening hours of the place */
    private String mOpeningHours;

    /** Website of the place */
    private String mWebsite;

    /** Drawable resource ID of the image of the place */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param name is the name of the place
     * @param address is the address of the place
     * @param openingHours is the opening hours of the place
     * @param website is the website of the place
     * @param imageResourceId is the drawable resource ID of the image of the place
     */
    public Place(String name, String address, String openingHours, String website, int imageResourceId) {
        mName = name;
        mAddress = address;
        mOpeningHours = openingHours;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the address of the place.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the opening hours of the place.
     */
    public String getOpeningHours() {
        return mOpeningHours;
    }

    /**
     * Get the website of the place.
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the drawable resource ID of the image of the place.
     */
    public int getImageResourceId() { return mImageResourceId; }

}
