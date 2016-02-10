package com.codaline.lakhmaniuk.lesson2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codaline.lakhmaniuk.lesson2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    TextView textView;


    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        return view;
    }

}
