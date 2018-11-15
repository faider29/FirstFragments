package com.example.faide.fragmentsstart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private TextView mInfoTextView;
    private ImageView mCatImageView;
    private String[] mCatDescriptionArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        mInfoTextView = rootView.findViewById(R.id.textView);
        mCatImageView = rootView.findViewById(R.id.imageView);

        //загружаем массив из ресурса
        mCatDescriptionArray = getResources().getStringArray(R.array.cats);
        return rootView;
    }

}
