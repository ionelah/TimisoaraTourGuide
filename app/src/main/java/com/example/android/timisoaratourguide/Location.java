package com.example.android.timisoaratourguide;

public class Location {

    //the image resource id for the location to visit
    private int mImageResourceID = NO_IMAGE_PROVIDED;

     /* Constant value when we have no image is -1 because.
      * We give to mImageResourceID this value because when it is a different value
      * means it has a image so should be VISIBLE.
      */
     private static final int NO_IMAGE_PROVIDED = -1;

     //the name of location to visit
    private String mName;

    //short description for that location
    private String mDescription;

    //the address for that location
    private String mAddress;

    //the opening and closing hours for that location
    private String mTimetable;

    //the phone number to contact
    private String mPhone;

    //the website for that location
    private String mWebsite;

    //creating a constructor with 4 inputs - 1 integer and 3 strings
    public Location(int imageResourceID, String name, String description, String address){
        mImageResourceID = imageResourceID;
        mName = name;
        mDescription = description;
        mAddress = address;
    }

    //creating a constructor with 6 inputs - 6 strings
    public Location(String name, String description, String address, String timetable, String phone, String website){
        mName = name;
        mDescription = description;
        mAddress = address;
        mTimetable = timetable;
        mPhone = phone;
        mWebsite = website;
    }

    // get the image ID for the location to visit
    public int getImageResourceID(){
        return mImageResourceID;
    }

    // Returns whether or not there is an image for this location
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    //get location name
    public String getName() {
        return mName;
    }

    //get location description
    public String getDescription() {
        return mDescription;
    }

    //get location address
    public String getAddress() {
        return mAddress;
    }

    //get location timetable
    public String getTimetable() {
        return mTimetable;
    }

    //get phone number for location
    public String getPhone() {
        return mPhone;
    }

    //get location website
    public String getWebsite() {
        return mWebsite;
    }
}
