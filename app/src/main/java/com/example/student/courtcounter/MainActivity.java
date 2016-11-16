package com.example.student.courtcounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textViewButton1;
    private TextView textViewButton2;
    AlertDialog gameOverAlert;
    public int score1;
    public int score2;
    private EditText team1view;
    private EditText team2view;
    private String team1name;
    private String team2name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewButton1 = (TextView)findViewById(R.id.player1Score);
        textViewButton1.setText( String.valueOf(score1) );
        textViewButton2 = (TextView)findViewById(R.id.player2Score);
        textViewButton2.setText( String.valueOf(score2) );
        score1 = 0;
        score2 = 0;

    }
    public void infinityClick1(View view){
        score1++;
        textViewButton1.setText("" + score1);
    }
    public void infinityClick2(View view){
        score2++;
        textViewButton2.setText("" + score2);
    }
    public void infinityClick3(View view){
        score1--;
        textViewButton1.setText("" + score1);
    }
    public void infinityClick4(View view){
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
        gameOverAlert.setTitle("Game Over");
        gameOverAlert.setMessage("Message Text");
        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        if (score1 > score2) {
            gameOverAlert.setTitle(team1name + " Wins!");
            gameOverAlert.setMessage("Team 1 wins");
        }
        if (score2 > score1) {
            gameOverAlert.setTitle(team2name + " Wins!");
            gameOverAlert.setMessage("Team 2 wins");
        }
        gameOverAlert.show();
        score1 = 0;
        textViewButton1.setText("" + score1);
        score2 = 0;
        textViewButton2.setText("" + score2);
        team1name = team1view.getText().toString();
        team2name = team2view.getText().toString();
    }
    public void infinityClick5(View view){
        score2--;
        textViewButton2.setText("" + score2);
    }
}