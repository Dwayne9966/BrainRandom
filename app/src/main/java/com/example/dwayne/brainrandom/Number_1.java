package com.example.dwayne.brainrandom;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;


public class Number_1 extends Fragment {
    private Button button;
    private int mNumber;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers2, container, false);
        button = (Button)view.findViewById(R.id.buttoneight);
        button.setText(mNumber + "5");
        return view;
    }
    public void setNumber(int number) {
        mNumber = number;
    }
}
