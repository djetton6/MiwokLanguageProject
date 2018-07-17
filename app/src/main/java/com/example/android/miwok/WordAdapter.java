package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> androidFlavors)

    @NonNull
    @Override
    public Context getContext() {
        return super.getContext();
    }super()

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check to see if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
// Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

//Find the TextView in the list_item.xml layout with id version_name,
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
//Get the Miwok translation from the currentWord object and set this text on
// the Miwok TextView.
        miwokTextView.setText(currentWord.getmMiwokTranslation());

//Find the Textiew in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
//Get the default translation fromm the currentWord object and set this text on
// the default TextView.

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        //Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        //the ListView.


    }
}
