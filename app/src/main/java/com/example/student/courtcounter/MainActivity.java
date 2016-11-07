package com.example.student.courtcounter;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textViewVariable;
    public int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewVariable = (TextView)findViewById(R.id.textViewName);
        textViewVariable.setText("0");
        score = 0;
        textViewVariable.setText( String.valueOf(score) );
    }
    public void clickFunction1(View view){
        score++;
    }
}
