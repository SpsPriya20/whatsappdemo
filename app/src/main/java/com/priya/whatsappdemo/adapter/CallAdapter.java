package com.priya.whatsappdemo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.priya.whatsappdemo.R;

import java.util.zip.Inflater;

public class CallAdapter extends BaseAdapter {

    private String calls[];
    private Activity activity;

    public CallAdapter (String calls[],Activity activity){
        this.calls=calls;
        this.activity=activity;
    }

    @Override
    public int getCount() {

        return calls.length;
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
        View view= LayoutInflater.from(activity).inflate(R.layout.list_item_call,parent,false);
        TextView textView=view.findViewById(R.id.callTv);
        textView.setText(calls[position]);
        return view;
    }
}
