package com.example.android.duartecityparks;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alex on 3/1/2018.
 */

public class CityParksF extends Fragment{
    public static final String ARG_PAGE = "Duarte Parks";
    private int mPage = 0;
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
                getString(R.string.Name_Hacienda_Park),
                getString(R.string.Benefits_Hacienda_Park),
                getString(R.string.Address_Hacienda_Park)));

        parkInfo.add(new
                ParksDataClass(R.drawable.aloysia_moore_park,
                getString(R.string.Name_Aloysia_Moore_Park),
                getString(R.string.Benefits_Aloysia_Moore_Park),
                getString(R.string.Address_Aloysia_Moore_Park)));

        ParksDataListViewAdapter Adapter = new ParksDataListViewAdapter(getActivity(), parkInfo);
        ListView listView = (ListView) rootList.findViewById(R.id.parksList);
        listView.setAdapter(Adapter);
        return rootList;
    }
}
