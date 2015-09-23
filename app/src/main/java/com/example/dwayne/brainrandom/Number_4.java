package com.example.dwayne.brainrandom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Number_4 extends Fragment {
private Button buttoned;
    private int mNumbered;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers2, container, false);
        buttoned = (Button)view.findViewById(R.id.buttoneight);
        buttoned.setText(mNumbered + "5");
        return view;
    }
    public void setNumbered(int number) {
        mNumbered = number;
    }

}
