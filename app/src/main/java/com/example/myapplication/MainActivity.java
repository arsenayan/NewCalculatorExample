package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "lifecycle";       // it is a tag for seeing lifecycle
    private TextView textScreen;          //where you can see yor written code
    private TextView textForResult;       //where you can see yor result
    private String firstTextValue = "0";
    private String secondTextValue = "0";
    private String displayValue = "";
     private double forallresultDiv;

    private double firstValue;
    private double secondValue;
    private double result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getActionBar() != null) {
            getSupportActionBar().hide(); // hide the title bar

        }

        Log.d(TAG, "THE onCreate METHOD IS CRATED <<onCreate>>");


        textScreen = findViewById(R.id.TextScreen);
        textForResult = findViewById(R.id.TextResult);

        findViewById(R.id.buttonOfNumOne).setOnClickListener(this);
        findViewById(R.id.buttonOfNumTwo).setOnClickListener(this);
        findViewById(R.id.buttonOfNumthree).setOnClickListener(this);
        findViewById(R.id.buttonOfNumFour).setOnClickListener(this);
        findViewById(R.id.buttonOfNumFive).setOnClickListener(this);
        findViewById(R.id.buttonOfNumSix).setOnClickListener(this);
        findViewById(R.id.buttonOfSeven).setOnClickListener(this);
        findViewById(R.id.buttonOfNumEight).setOnClickListener(this);
        findViewById(R.id.buttonOfNumNine).setOnClickListener(this);
        findViewById(R.id.buttonOfNumZero).setOnClickListener(this);
        findViewById(R.id.buttonOfNumPlus).setOnClickListener(this);
        findViewById(R.id.buttonOfNumMinus).setOnClickListener(this);
        findViewById(R.id.buttonOfNumPercent).setOnClickListener(this);
        findViewById(R.id.buttonOfNumSquare).setOnClickListener(this);
        findViewById(R.id.buttonOfRoot).setOnClickListener(this);
        findViewById(R.id.buttonOfNumEqual).setOnClickListener(this);
        findViewById(R.id.buttonOfNumClear).setOnClickListener(this);
        findViewById(R.id.buttonOfNumDivided).setOnClickListener(this);
        findViewById(R.id.buttonOfNumMultiple).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        findViewById(R.id.buttonOfNumPlus).setClickable(true);
        findViewById(R.id.buttonOfNumMinus).setClickable(true);
        findViewById(R.id.buttonOfNumMultiple).setClickable(true);
        findViewById(R.id.buttonOfNumDivided).setClickable(true);

        if (firstTextValue.equals("0") && secondTextValue.equals("0")) {
            firstTextValue = "";
            secondTextValue = "";
        }
        switch (v.getId()) {
            case R.id.buttonOfNumOne:

                if (ifEndWithOperation()) {

                    secondTextValue += "1";
                    secondValue += 1;

                } else

                    firstTextValue += "1";
                displayValue += "1";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumTwo:
                if (ifEndWithOperation()) {
                    secondTextValue += "2";
                    secondValue += 2;

                } else
                    firstTextValue += "2";
                displayValue += "2";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumthree:
                if (ifEndWithOperation()) {
                    secondTextValue += "3";
                    secondValue += 3;

                } else
                    firstTextValue += "3";
                displayValue += "3";
                textScreen.setText(displayValue);

                break;
            case R.id.buttonOfNumFour:
                if (ifEndWithOperation()) {
                    secondTextValue += "4";
                    secondValue += 4;

                } else
                    firstTextValue += "4";
                displayValue += "4";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumFive:
                if (ifEndWithOperation()) {
                    secondTextValue += "5";

                    secondValue += 5;

                } else
                    firstTextValue += "5";
                displayValue += "5";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumSix:
                if (ifEndWithOperation()) {
                    secondTextValue += "6";
                    secondValue += 6;
                } else
                    firstTextValue += "6";
                displayValue += "6";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfSeven:
                if (ifEndWithOperation()) {
                    secondTextValue += "7";
                    secondValue += 7;
                } else
                    firstTextValue += "7";
                displayValue += "7";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumEight:
                if (ifEndWithOperation()) {
                    secondTextValue += "8";
                    secondValue += 8;
                } else
                    firstTextValue += "8";
                displayValue += "8";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumNine:
                if (ifEndWithOperation()) {
                    secondTextValue += "9";
                    secondValue += 9;
                } else
                    firstTextValue += "9";
                displayValue += "9";
                textScreen.setText(displayValue);
                break;
            case R.id.buttonOfNumZero:
                if (ifEndWithOperation()) {
                    secondTextValue += "0";
                    secondValue += 0;
                } else
                    firstTextValue += "0";
                displayValue += "0";
                textScreen.setText(displayValue);
                break;

            case R.id.buttonOfNumPlus:
                findViewById(R.id.buttonOfNumPlus).setClickable(false);
                findViewById(R.id.buttonOfNumMinus).setClickable(false);
                findViewById(R.id.buttonOfNumMultiple).setClickable(false);
                findViewById(R.id.buttonOfNumDivided).setClickable(false);
                if (!TextUtils.isEmpty(firstTextValue)
                        && TextUtils.isEmpty(secondTextValue)) {

                    firstValue = Integer.valueOf(displayValue);

                    displayValue += "+";
                } else if (!TextUtils.isEmpty(secondTextValue)) {
                    secondValue = Integer.valueOf(secondTextValue);
                    firstValue = firstValue + secondValue;
                    displayValue = firstValue + "+";

                    secondValue = 0;
                    secondTextValue = "";
                }

                break;

            case R.id.buttonOfNumMinus:
                findViewById(R.id.buttonOfNumPlus).setClickable(false);
                findViewById(R.id.buttonOfNumMinus).setClickable(false);
                findViewById(R.id.buttonOfNumMultiple).setClickable(false);
                findViewById(R.id.buttonOfNumDivided).setClickable(false);

                if (!TextUtils.isEmpty(firstTextValue)
                        && TextUtils.isEmpty(secondTextValue)) {

                    firstValue = Integer.valueOf(displayValue);
                    displayValue += "-";
                } else if (!TextUtils.isEmpty(secondTextValue)) {


                    secondValue = Integer.valueOf(secondTextValue);


                    firstValue = firstValue - secondValue;

                    displayValue = firstValue + "-";

                    secondValue = 0;
                    secondTextValue = "";
                }


                break;
            case R.id.buttonOfNumMultiple:
                findViewById(R.id.buttonOfNumPlus).setClickable(false);
                findViewById(R.id.buttonOfNumMinus).setClickable(false);
                findViewById(R.id.buttonOfNumMultiple).setClickable(false);
                findViewById(R.id.buttonOfNumDivided).setClickable(false);
                if (!TextUtils.isEmpty(firstTextValue)
                        && TextUtils.isEmpty(secondTextValue)) {

                    firstValue = Integer.valueOf(displayValue);
                    displayValue += "✖";
                } else if (!TextUtils.isEmpty(secondTextValue)) {
                    secondValue = Integer.valueOf(secondTextValue);
                    firstValue = firstValue * secondValue;
                    displayValue = firstValue + "✖";

                    secondTextValue = "";
                }
                break;

            case R.id.buttonOfNumDivided:
               /* findViewById(R.id.buttonOfNumPlus).setClickable(false);
                findViewById(R.id.buttonOfNumMinus).setClickable(false);
                findViewById(R.id.buttonOfNumMultiple).setClickable(false);
                findViewById(R.id.buttonOfNumDivided).setClickable(false);*/
                if (!TextUtils.isEmpty(firstTextValue)
                        && TextUtils.isEmpty(secondTextValue)) {

                    firstValue = Double.valueOf(displayValue);

                    displayValue += "÷";
                } else if (!TextUtils.isEmpty(secondTextValue)) {
                    secondValue = Double.valueOf(secondTextValue);
                    firstValue = (firstValue) / secondValue;
                        displayValue = firstValue + "÷";

                    secondValue = 0;
                    secondTextValue = "";
                }

                break;

            case R.id.buttonOfRoot:
                firstValue = Integer.valueOf(displayValue);
                displayValue = String.valueOf(Math.sqrt(firstValue));
                textForResult.setText(displayValue);


                break;
            case R.id.buttonOfNumPercent:

                if (!TextUtils.isEmpty(firstTextValue)
                        && TextUtils.isEmpty(secondTextValue)) {

                    firstValue = Integer.valueOf(displayValue);
                    displayValue += "％";
                } else if (!TextUtils.isEmpty(secondTextValue)) {
                    secondValue = Integer.valueOf(secondTextValue);
                    firstValue = (firstValue * secondValue)/100;
                    displayValue = firstValue + "％";

                    secondTextValue = "";
                }
                /*firstValue = Integer.valueOf(displayValue);
                displayValue = String.valueOf(firstValue/100);
                textForResult.setText(displayValue);
*/

                break;
            case R.id.buttonOfNumSquare:
                firstValue = Integer.valueOf(displayValue);
                displayValue = String.valueOf(Math.pow(firstValue,2));
                textForResult.setText(displayValue);


                break;
            case R.id.buttonOfNumClear:
                firstTextValue = "";
                secondTextValue = "";
                firstValue = 0;
                secondValue = 0;
                displayValue = "";
                textScreen.setText("0");

                textForResult.setText("0");
                break;
            case R.id.buttonOfNumEqual:

                if (displayValue.indexOf("+") >= 0) {
                    result = firstValue + secondValue;
                }
                if (displayValue.indexOf("✖") >= 0) {
                    result = firstValue * secondValue;
                }  if (displayValue.indexOf("％") >= 0) {
                    result = firstValue * (secondValue/10);
                } else if (displayValue.indexOf("-") >= 0) {
                    result = firstValue - secondValue;
                } else if (displayValue.indexOf("÷") >= 0) {
                    result = (firstValue) / secondValue;
                }

                textForResult.setText(String.valueOf(result));


                firstTextValue = "";
                secondTextValue = "";
                firstValue = 0;
                secondValue = 0;
                displayValue = "";


                break;

        }

    }


    private boolean ifEndWithOperation() {
        return displayValue.endsWith("+") ||
                displayValue.endsWith("-") ||
                displayValue.endsWith("+") ||
                displayValue.endsWith("=") ||
                displayValue.endsWith("√") ||
                displayValue.endsWith("x^") ||
                displayValue.endsWith("％") ||
                displayValue.endsWith("✖");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "the onStart method (you can see activity)  <<OnStart>>");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "the activity gets th focus (and stayed condition of <<onResume>>");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "the activity   stayed condition of <<onPause>>");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "the activity   is stopped << onStop >>");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "the activity   is Destroyed   << OnDestroy >> ");

    }


}
