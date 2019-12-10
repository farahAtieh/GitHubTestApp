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
    }
}
