package com.example.dwayne.brainrandom;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;


public class Number_1 extends Fragment {
    private Button button_set;
    private int mNumbered;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number_1, container, false);
        button_set = (Button) view.findViewById(R.id.button_set);
        button_set.setText(mNumbered + "4");
        return view;
    }
    public void setNumber(int number) {
        mNumbered = number;
    }
}