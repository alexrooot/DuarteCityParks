package com.example.android.duartecityparks;

import android.location.Address;

/**
 * Created by Alex on 3/1/2018.
 */

public class ParksDataClass {
    private int mImage;
    private String mNameOfPark;
    private String mBenefits;
    private String mAddress;

    public ParksDataClass(int Image, String NameOfPark, String Benefits, String Address){
        mImage = Image;
        mNameOfPark = NameOfPark;
        mBenefits = Benefits;
        mAddress = Address;
    }
    public int getmImage(){
        return mImage;
    }
    public String getmNameOfPark(){
        return mNameOfPark;
    }
    public String getmBenefits(){
        return mBenefits;
    }
    public String getmAddress(){
        return mAddress;
    }
}
