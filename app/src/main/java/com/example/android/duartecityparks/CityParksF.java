package com.example.android.duartecityparks;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Alex on 3/1/2018.
 */

public class CityParksF extends android.support.v4.app.Fragment{
    public static final String ARG_PAGE = "Duarte Parks";
    private int mPage;
    public CityParksF(){
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootList = inflater.inflate(R.layout.listview_xml, container, false);
        final ArrayList<ParksDataClass> parkInfo = new ArrayList<ParksDataClass>();
        parkInfo.add(new
                ParksDataClass(R.drawable.hacienda_park,
                getString(R.string.Hacienda_Park_Name),
                getString(R.string.Hacienda_Park_Benefits),
                getString(R.string.Hacienda_Park_Address)));
        return rootList;
    }
}
