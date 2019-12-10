package com.example.githubtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int testApp(){
        return 10 + 35;

    }
    
    private void addChangeToMain(){
        String test = "test";

        boolean isValid = true;
    }

    private void doSomeWork(){
        int i = 50;
        int ii = 50;

        String isString = Integer.toString(i);

        if( i <= 100){
            isString = Integer.toString(ii - 9);
        }
    }
}
