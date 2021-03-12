package com.example.lab3;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class QuestionFragment extends Fragment {
    private int id;

    public QuestionFragment(int id) {
        this.id = id;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        TextView title = view.findViewById(R.id.title);
        ImageView imageView = (ImageView)view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.text);
        TextView answersCountView = (TextView) view.findViewById(R.id.answers_count);
        TextView fulltextView = (TextView) view.findViewById(R.id.text_full);
        String strId = String.valueOf(id);

        title.setText(getResByName("label" + strId));
        imageView.setImageResource(getResources().getIdentifier("pic" + strId, "drawable", getContext().getPackageName()));
        textView.setText(getResByName("text" + strId));
        answersCountView.setText(getResByName("ac" + strId));
        fulltextView.setText(getResByName("fulltext" + strId));
        return view;
    }

    private int getResByName(String name) {
        return getResources().getIdentifier(name, "string", getContext().getPackageName());
    }

}