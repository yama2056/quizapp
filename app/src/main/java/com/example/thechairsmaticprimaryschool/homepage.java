package com.example.thechairsmaticprimaryschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    private CardView quiz,calculator, backgroundColor, dice, add_note,note_list;
    private TextView username,name, student_id,background;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        quiz = findViewById(R.id.quiz);
        calculator = findViewById(R.id.calculator);
        backgroundColor = findViewById(R.id.backgroundColor);
        dice = findViewById(R.id.dice);
        add_note = findViewById(R.id.add_note);
        note_list = findViewById(R.id.note_list);
        name = findViewById(R.id.name);
        background = findViewById(R.id.color);
        student_id = findViewById(R.id.student_id);
        layout = findViewById(R.id.home_layout);

        Intent intent1 = getIntent();
        String name1 = intent1.getStringExtra("name");
        int id = intent1.getIntExtra("id", 1);

        name.setText("welcome " + name);
        student_id.setText("Student Id: "+ id);

        quiz.setOnClickListener(view -> {
            Intent intent = new Intent(homepage.this, quizActivity.class);
            startActivity(intent);
        });

        calculator.setOnClickListener(view -> {
            Intent intent = new Intent(homepage.this,Calculator.class);
            startActivity(intent);
            Log.d("calculator", "onCreate: " + "calculator is clicked");

        });
        layout.setOnClickListener(view -> {
            layout.setBackgroundResource(R.color.white);
        });

        backgroundColor.setOnClickListener(view -> {
            layout.setBackgroundResource(R.color.purple_500);

        });
        background.setOnClickListener(view -> {
            layout.setBackgroundResource(R.color.white);
        });

        dice.setOnClickListener(view -> {
            Intent intent = new Intent(homepage.this, DiceActivity.class);
            startActivity(intent);
            Log.d("dice", "onCreate: " + "dice is clicked");
        });

        note_list.setOnClickListener(view -> {
            Intent intent = new Intent(homepage.this,notelistActivity.class);
            startActivity(intent);
            Log.d("note_list", "onCreate: " + "note_list is clicked");
        });

        add_note.setOnClickListener(view -> {
            Intent intent = new Intent(homepage.this, noteActivity.class);
            startActivity(intent);
            Log.d("add_note", "onCreate: " + "add_note is clicked");
        });


    }
}
