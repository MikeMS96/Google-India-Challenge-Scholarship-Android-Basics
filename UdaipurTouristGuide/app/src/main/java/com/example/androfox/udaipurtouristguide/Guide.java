package com.example.androfox.udaipurtouristguide;

/**
 * Created by Mike on 1/15/2018.
 */

public class Guide {

    private int mImageResourceId;
    private String mName;
    private String mAddress;
    private String mLatLong;
    private String mContact = No_Contact_Provided;
    private String mEmail = No_Email_Provided;
    private static final String No_Email_Provided =null;
    private static final String No_Contact_Provided =null;

    public  Guide(int imageResourceId,String name,String address, String contact, String email, String latLong){
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mContact = contact;
        mEmail = email;
        mLatLong = latLong;

    }
    public  Guide(int imageResourceId,String name,String address, String contact, String latLong){
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mContact = contact;
        mLatLong = latLong;

    }
    public  Guide(int imageResourceId,String name,String address, String latLong){
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mLatLong = latLong;

    }
    public int getImageResourceId(){return mImageResourceId;}
    public String getName(){return  mName;}
    public String getAddress(){return  mAddress;}
    public String getContact(){return  mContact;}
    public String getEmail(){return  mEmail;}
    public String getLatLong(){return mLatLong;}
    public boolean hasEmail(){return  mEmail != No_Email_Provided;}
    public boolean hasContact(){return mContact != No_Contact_Provided;}
}
