package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{
    private int[] numericButtons = {R.id.b1, R.id.b2, R.id.b3, R.id.b5, R.id.b6, R.id.b7, R.id.b9, R.id.b10, R.id.b11, R.id.b14};
    private int[] operatorButtons = {R.id.b4bazm,R.id.b8gum,R.id.b15amb,R.id.b16hav,R.id.b13C,R.id.b12hanac};

    private TextView textScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // hide the title bar

         this.textScreen = (TextView) findViewById(R.id.TextScreen1);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                textScreen.setText("1");
        }

    }
}
