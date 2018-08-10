package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә\n" +
                "\n"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?\n" +
                "\n"));
        words.add(new Word("I’m feeling good.\n" +
                "\n", "kuchi achit\n" +
                "\n"));
        words.add(new Word("Are you coming?\n" +
                "\n", "әәnәs'aa?\n" +
                "\n"));
        words.add(new Word("Yes, I’m coming.\n" +
                "\n", "hәә’ әәnәm\n" +
                "\n"));
        words.add(new Word("I’m coming.\n" +
                "\n", "әәnәm"));
        words.add(new Word("Let’s go.\n" +
                "\n", "yoowutis"));
        words.add(new Word("Come here.\n" +
                "\n", "әnni'nem\n" +
                "\n"));


        //Created an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list. for adding vocabulary words to NumbersActivity.
        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
