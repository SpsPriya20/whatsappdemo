package com.priya.whatsappdemo.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.priya.whatsappdemo.R;

import java.util.zip.Inflater;

public class FragmentCamera extends Fragment {

    public TextView name;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.fragment_camera,container,false);
       name=view.findViewById(R.id.NameTv);
        return view;
    }
}
