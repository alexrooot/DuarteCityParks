package com.example.android.duartecityparks;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 3/1/2018.
 */

public class ParksDataListViewAdapter extends ArrayAdapter<ParksDataClass>{

    private static final  String LOG_TAG = ParksDataListViewAdapter.class.getSimpleName();

    public ParksDataListViewAdapter(@NonNull Activity context, ArrayList<ParksDataClass> parksResource) {
        super(context, 0,  parksResource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_design, parent,false);
        }
        ParksDataClass currentIndex = getItem(position);


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.parkImageView);
        imageView.setImageResource(currentIndex.getmImage());
        TextView titelTextView = (TextView) listItemView.findViewById(R.id.title_of_park);
        titelTextView.setText(currentIndex.getmNameOfPark());
        TextView benefitsTextView = (TextView) listItemView.findViewById(R.id.park_benefits);
        benefitsTextView.setText(currentIndex.getmBenefits());
        TextView addrress = (TextView) listItemView.findViewById(R.id.park_address);
        addrress.setText(currentIndex.getmAddress());
        return listItemView;
    }
}
