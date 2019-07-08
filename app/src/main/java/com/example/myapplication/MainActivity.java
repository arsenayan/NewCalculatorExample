package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{
    private int[] numericButtons = {R.id.buttonOfNumOne, R.id.buttonOfNumTwo, R.id.buttonOfNumthree,
            R.id.buttonOfNumFour, R.id.buttonOfNumFive, R.id.buttonOfNumSix, R.id.buttonOfSeven, R.id.buttonOfNumEight,
            R.id.buttonOfNumNine, R.id.buttonOfNumZero};
    private int[] operatorButtons = {R.id.buttonOfNumMultiple,R.id.buttonOfNumPlus,R.id.buttonOfNumMinus,R.id.buttonOfNumEqual,
            R.id.buttonOfNumClear,R.id.buttonOfNumDot,R.id.buttonOfNumPercent,R.id.buttonOfNumSquare,R.id.buttonOfRoot,R.id.buttonOfNumDivided};

    private TextView textScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // hide the title bar

         this.textScreen = (TextView) findViewById(R.id.TextScreen);
        //hello


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonOfNumOne:
                textScreen.setText("1");
        }

    }
}
