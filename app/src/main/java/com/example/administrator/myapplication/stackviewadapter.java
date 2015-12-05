package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Administrator on 2015/11/19.
 */


public class stackviewadapter extends BaseAdapter {

    private static final Integer[] images = { R.drawable.p1, R.drawable.p2,
            R.drawable.p3, R.drawable.p4,  R.drawable.p5};
    LayoutInflater inflater;
    ImageView profileimage = null;


    public stackviewadapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public Integer getItem(int pos) {
        // TODO Auto-generated method stub
        return images[pos];
    }

    @Override
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        if (view == null) {
            view = inflater.inflate(R.layout.profile, parent, false);
            profileimage  = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(profileimage);
        } else {
            profileimage = (ImageView) view.getTag();
        }
        profileimage.setBackgroundResource(images[pos]);
        return view;
    }

}
