package com.example.android.duartecityparks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Alex on 3/1/2018.
 */

public class CategoryAdapterF extends FragmentPagerAdapter {
    private String tabTitels [] = new String [] {"Parks","Repeat Parks"};

    public CategoryAdapterF(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            if (position == 0){
                return new CityParksF();
            }else
                return new BlankFragment();
            }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitels[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}
