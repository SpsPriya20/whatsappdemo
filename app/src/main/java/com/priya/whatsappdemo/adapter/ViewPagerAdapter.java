package com.priya.whatsappdemo.adapter;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.priya.whatsappdemo.fragments.FragmentCall;
import com.priya.whatsappdemo.fragments.FragmentCamera;
import com.priya.whatsappdemo.fragments.FragmentChat;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public FragmentCall fragmentCall;
    public FragmentCamera fragmentCamera;
    public FragmentChat fragmentChat;

    public ViewPagerAdapter(FragmentManager fm) {

        super(fm);
        fragmentCall= new FragmentCall();
        fragmentCamera = new FragmentCamera();
        fragmentChat=new FragmentChat();
    }

    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
                return fragmentCamera;
           case 1:
               return fragmentChat;
           case 2:
               return fragmentCall;
       }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
