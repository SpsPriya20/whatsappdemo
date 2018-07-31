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
import com.priya.whatsappdemo.adapter.ChatAdapter;

public class FragmentChat extends Fragment {
    public ListView chat;
    public ChatAdapter chatAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_chat,container,false);
       chat=view.findViewById(R.id.listLv);

       String[] list={"sita","gita","Ram","Sweta","hema","google","yahoo","orkut","facebook","messenger"
       };


       chatAdapter=new ChatAdapter(list,getActivity());
       chat.setAdapter(chatAdapter);


        return view;
    }
}
