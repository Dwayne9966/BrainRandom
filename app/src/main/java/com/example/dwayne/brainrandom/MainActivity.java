package com.example.dwayne.brainrandom;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;
    int counter = 0;
    Integer[] numbers = {5, 6, 2, 8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.buttoneight);
        btn2 = (Button) findViewById(R.id.button_three);
        numbers = RandomNumberGenerator.getNumbers();
    }
    @Override
    public void onClick(View v) {
        showNextNumber();
        switch (v.getId()) {
            case R.id.buttoneight:
                counter++;
            case R.id.button_three:
                counter++;
            case R.id.button_four:
                counter++;
                break;
        }
    }
    public void showNextNumber() {
        counter ++;
        if (counter < numbers.length) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            Number_1 fragmentNM = new Number_1();
            fragmentNM.setNumber(numbers[counter]);
            fragmentManager.beginTransaction()
                    .replace(R.id.centerMain, fragmentNM, "NUMBER")
                    .addToBackStack(null)
                    .commit();
        }
        else {
            //Do something else, numbers is up
        }
    }
    public void clicked(View v) {
        showNextNumber();
    }
    public void clicked_two(View v){
        showNextNumber_two();
    }
    public void showNextNumber_two(){
        counter++;
        FragmentManager fragmentManager = getSupportFragmentManager();
        Number_2 fragmentM = new Number_2();
        fragmentM.setNumber(numbers[counter]);
        fragmentManager.beginTransaction()
                .replace(R.id.centerMain,fragmentM,"NUMBER")
                .addToBackStack(null)
                .commit();
    }
    public void showNextNumber_three(){
        counter++;
        FragmentManager fragmentManager = getSupportFragmentManager();
        Number_3 fragmentN = new Number_3();
        fragmentN.setNumber(numbers[counter]);
        fragmentManager.beginTransaction()
                .replace(R.id.centerMain,fragmentN,"NUMBER")
                .addToBackStack(null)
                .commit();
    }
    public void clicked_4(View v){
        showNextNumber_three();

    }
}
