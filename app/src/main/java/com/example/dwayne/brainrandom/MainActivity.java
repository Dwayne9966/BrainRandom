package com.example.dwayne.brainrandom;




import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;
    int counter = 0;
  MediaPlayer mp;
    Integer[] numbers;
/*
Die ewewige getalle eers dan die onewige getalle.
 */
    private static int GET_THIS_MANY_NUMBERS = 10;
    private static int GET_NUMBERS_BETWEEN_ZERO_AND_THIS_MANY = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.buttoneight);
        btn2 = (Button) findViewById(R.id.button_three);
        btn3 = (Button) findViewById(R.id.button_four);

        numbers = RandomNumberGenerator.getNumbers(GET_THIS_MANY_NUMBERS, GET_NUMBERS_BETWEEN_ZERO_AND_THIS_MANY);
    }

    public static void main(String args[]){
        /*
        Eweige getalle
         */
        int var1 = 1;
        int number_btn_one;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;
        int var5 = 5;
        /*
        Onewige getalle
         */
        int var6 = 6;
        int var7 = 7;
        int var8 = 8;
        int var9 = 9;
        int var10 = 10;


        switch (var1){
            case R.id.bnt_number_three_id:
                R.raw.one;

    }}
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
            case R.id.videoView:
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
            showCelebration();
        }
    }
    public void clicked(View v) {
        showNextNumber();
    }
    public void clicked_two(View v){
        showNextNumber();
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
    public void clicked_3(View v){
        showNextNumber();
    }
    public void VideoView_click(View v) {
        showCelebration();
    }
    public void showCelebration(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Frag_Celebration fragmentC = new Frag_Celebration();
        fragmentManager.beginTransaction()
                .replace(R.id.centerMain, fragmentC, "NUMBER")
                .addToBackStack(null)
                .commit();
    }
}
