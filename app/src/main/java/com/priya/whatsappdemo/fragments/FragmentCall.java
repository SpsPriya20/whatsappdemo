package com.priya.whatsappdemo.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.priya.whatsappdemo.R;
import com.priya.whatsappdemo.adapter.CallAdapter;

public class FragmentCall extends Fragment {
    public ListView call;
    public CallAdapter callAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_call,container,false);

         call=view.findViewById(R.id.callLv);
         String[] list= {"daisy","sweety","hayati","snigdha","suman","sampriti","priyasa","supriya","lovely","akriti","akansha"};
        callAdapter=new CallAdapter(list,getActivity());
        call.setAdapter(callAdapter);
        return view;
    }
}
