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
                ParksDataClass(R.mipmap.aloysia_moore_park,
                getString(R.string.Name_Aloysia_Moore_Park),
                getString(R.string.Benefits_Aloysia_Moore_Park),
                getString(R.string.Address_Aloysia_Moore_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.beardslee_park,
                getString(R.string.Name_Beardslee_park),
                getString(R.string.Benefits_Beardslee_park),
                getString(R.string.Address_Beardslee_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.duarte_park,
                getString(R.string.Name_Duarte_park),
                getString(R.string.Benefits_Duarte_park),
                getString(R.string.Address_Duarte_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.duarte_sports_park,
                getString(R.string.Name_duarte_sports_park),
                getString(R.string.Benefits_duarte_sports_park_park),
                getString(R.string.Address_duarte_sport_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.duarte_skate_park,
                getString(R.string.Name_Duarte_Skate_park),
                getString(R.string.Benefits_Duarte_Skate_park),
                getString(R.string.Address_Duarte_Skate_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.encanto_park,
                getString(R.string.Name_Encanto_park),
                getString(R.string.Benefits_Encanto_park),
                getString(R.string.Address_Encanto_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.encanto_nature_walk_park,
                getString(R.string.Name_Encanto_Park_Nature_Walk_park),
                getString(R.string.Benefits_Encanto_Park_Nature_Walk_park),
                getString(R.string.Address_Encanto_Park_Nature_Walk_park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.hacienda_park,
                getString(R.string.Name_Hacienda_Park),
                getString(R.string.Benefits_Hacienda_Park),
                getString(R.string.Address_Hacienda_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.lena_valenzuela_park,
                getString(R.string.Name_Lena_Valenzuela_Park_park),
                getString(R.string.Benefits_Lena_Valenzuela_Park_park),
                getString(R.string.Address_Lena_Valenzuela_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.northview_park,
                getString(R.string.Name_Northview_Park_Park),
                getString(R.string.Benefits_Northview_Park_Park),
                getString(R.string.Address_Northview_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.otis_gordon_sport_park,
                getString(R.string.Name_Otis_Gordon_Sports_Park_Park),
                getString(R.string.Benefits_Otis_Gordon_Sports_Park_Park),
                getString(R.string.Address_Otis_Gordon_Sports_Park_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.royal_oaks_parks,
                getString(R.string.Name_Royal_Oaks_Park_Park),
                getString(R.string.Benefits_Royal_Oaks_Park_Park),
                getString(R.string.Address_Royal_Oaks_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.royal_oaks_park_extension,
                getString(R.string.Name_Royal_Oaks_Park_Extension_Park),
                getString(R.string.Benefits_Royal_Oaks_Park_Extension_Park),
                getString(R.string.Address_Royal_Oaks_Extenstion_Park)));
        parkInfo.add(new
                ParksDataClass(R.mipmap.orange_blossom_park,
                getString(R.string.Name_Orange_Blossom_Park_Park),
                getString(R.string.Benefits_Orange_Blossom_Park_Park),
                getString(R.string.Address_Orange_Blossom_Park)));


        ParksDataListViewAdapter Adapter = new ParksDataListViewAdapter(getActivity(), parkInfo);
        ListView listView = (ListView) rootList.findViewById(R.id.parksList);
        listView.setAdapter(Adapter);
        return rootList;
    }
}
