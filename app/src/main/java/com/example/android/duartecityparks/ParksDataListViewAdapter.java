package com.example.android.duartecityparks;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 3/1/2018.
 */

public class ParksDataListViewAdapter extends ArrayAdapter{

    private static final  String LOG_TAG = ParksDataListViewAdapter.class.getSimpleName();

    public ParksDataListViewAdapter(@NonNull Activity context, ArrayList<ParksDataClass> parksResource) {
        super(context, 0,  parksResource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
