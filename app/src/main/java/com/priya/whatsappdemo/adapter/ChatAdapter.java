package com.priya.whatsappdemo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.priya.whatsappdemo.R;

public class ChatAdapter extends BaseAdapter {
    private String chats[];
    private Activity activity;

     public ChatAdapter(String chats[], Activity activity){
        this.chats=chats;
        this.activity=activity;


    }
    @Override
    public int getCount() {
        return chats.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(activity).inflate(R.layout.list_item_chat,parent,false);
        TextView textView=view.findViewById(R.id.nameTv);
        textView.setText(chats[position]);
        return view;
    }
}
