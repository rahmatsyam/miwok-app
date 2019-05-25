package com.example.android.miwok.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView tvDefault = listItemView.findViewById(R.id.default_text_view);
        assert currentWord != null;
        tvDefault.setText(currentWord.getDefaultTranslation());

        TextView tvMiwok = listItemView.findViewById(R.id.miwok_text_view);
        tvMiwok.setText(currentWord.getMiwokTranslation());

        return listItemView;

        //return super.getView(position, convertView, parent);
    }


}
