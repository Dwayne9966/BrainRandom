package com.example.dwayne.brainrandom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Number_2 extends Fragment {
    private Button button_three;
    private int mNumbered;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number_2, container, false);
        button_three = (Button)view.findViewById(R.id.button_three);
        button_three.setText(mNumbered + "");
        return view;
    }
    public void setNumber(int number) {
        mNumbered = number;
    }
    }



