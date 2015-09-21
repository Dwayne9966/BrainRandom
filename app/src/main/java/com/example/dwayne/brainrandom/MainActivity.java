package com.example.dwayne.brainrandom;


import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    int counter = 10;
    Integer[] numbers = {5, 6, 2, 8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.buttoneight);
        numbers = RandomNumberGenerator.getNumbers();
    }

    @Override
    public void onClick(View v) {
        showNextNumber();
        switch (v.getId()) {
            case R.id.buttoneight:
                counter++;
        }
    }
    public void showNextNumber() {
        counter ++;
        FragmentManager fragmentManager = getSupportFragmentManager();
        Numbers fragmentNM = new Numbers();
        fragmentNM .setNumber(numbers[counter]);
        fragmentManager.beginTransaction()
                .replace(R.id.centerMain, fragmentNM, "NUMBER")
                .addToBackStack(null)
                .commit();
    }
    public void clicked(View v) {
        showNextNumber();
    }
}


