package com.example.thechairsmaticprimaryschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {
    ImageView diceImage;
    Button btnRoll;
    TextView result, winningMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        diceImage = findViewById(R.id.dice_image);
        btnRoll = findViewById(R.id.btnRoll);
        result = findViewById(R.id.message);

        Random random = new Random();

        btnRoll.setOnClickListener(view -> {
            int diceNumber = random.nextInt(6) + 1;

            if(diceNumber == 1){
                diceImage.setImageResource(R.drawable.dice1);
            }else if(diceNumber == 2){
                diceImage.setImageResource(R.drawable.dice2);
            }else if(diceNumber == 3){
                diceImage.setImageResource(R.drawable.dice3);
            }else if(diceNumber == 4){
                diceImage.setImageResource(R.drawable.dice_4);
            }else if(diceNumber == 5){
                diceImage.setImageResource(R.drawable.dice5);
            }else if(diceNumber == 6){
                diceImage.setImageResource(R.drawable.dice_6);
            }else {
                diceImage.setImageResource(R.drawable.dice1);
            }

            result.setText("You are rolled "+ diceNumber);

        });
    }
}