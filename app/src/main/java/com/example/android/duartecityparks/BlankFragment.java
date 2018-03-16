package com.example.android.duartecityparks;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    public static final String ARG_PAGE = "Repeat Parks";

    public BlankFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootList = inflater.inflate(R.layout.listview_xml, container, false);
        final ArrayList<ParksDataClass> parkInfo = new ArrayList<ParksDataClass>();
        parkInfo.add(new
                ParksDataClass(R.mipmap.encanto_nature_walk_park,
                getString(R.string.Name_Hacienda_Park),
                getString(R.string.Benefits_Hacienda_Park),
                getString(R.string.Address_Hacienda_Park)));
        return rootList;
    }
}

