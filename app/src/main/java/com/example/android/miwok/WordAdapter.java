package com.example.android.miwok;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WordAdapter extends ArrayAdapter<Word> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check to see if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        return super.getView(position, convertView, parent);
    }
}
