package com.example.thechairsmaticprimaryschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import  java.util.ArrayList;
import  java.util.Arrays;
import  java.util.List;
import android.widget.TextView;
import android.widget.Toast;

public class quizActivity extends AppCompatActivity {
    private TextView question_group;
    private RadioGroup radiogrp;

    private Button btnDashboard;
    private List<Question> questions;
    private  int currentQuestionIndex;
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question_group=findViewById(R.id.question_group);
        radiogrp=findViewById(R.id.radiogrp);
        Button submitButton = findViewById(R.id.submit_Button);
        btnDashboard=findViewById(R.id.btnDashboard);
//questions lists
        questions=new ArrayList<>();
        questions.add(new Question("what is the color of mirror",Arrays.asList("white", "red", "Blue", "None"),3));
        questions.add(new Question("where is highest mountain located",Arrays.asList("nepal", "india", "china", "None"),0));
        questions.add(new Question("where was buddha born",Arrays.asList("india", "burma", "pakistan", "nepal"),3));
        questions.add(new Question("who is the light of asia",Arrays.asList("jesus", "allha", "shiva", "Buddha"),3));
        questions.add(new Question("what is the national animal of nepal",Arrays.asList("dog", "cow", "pig", "rhino"),1));



        // Display the first question
        displayQuestion();

        btnDashboard.setOnClickListener(view -> {
            Intent intent = new Intent(quizActivity.this, homepage.class);
            startActivity(intent);
        });
        // Set up the submit button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check the answer
                int selectedAnswerIndex = radiogrp.getCheckedRadioButtonId();
                if (selectedAnswerIndex == -1) {
                    // No answer selected, do nothing
                    return;
                }
                selectedAnswerIndex = getSelectedAnswerIndex(selectedAnswerIndex);
                if (selectedAnswerIndex == questions.get(currentQuestionIndex).getCorrectAnswerIndex()) {
                    // Answer is correct, increment the score
                    score++;
                }else {
                    Toast.makeText(quizActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }

                // Move to the next question
                currentQuestionIndex++;
                if (currentQuestionIndex < questions.size()) {
                    // Display the next question
                    displayQuestion();
                } else {
                    // Display the final score
                    String scoreMessage = "Your score is " + score + "/" + questions.size();
                    Toast.makeText(quizActivity.this, scoreMessage, Toast.LENGTH_LONG).show();

                    // Save the score to a file
                    saveScoreToFile();


                }
            }
        });
    }

    private void saveScoreToFile() {
    }

    private void displayQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        question_group.setText(currentQuestion.getQuestionText());
        List<String> answerOptions = currentQuestion.getAnswerOption();
        for (int i = 0; i < answerOptions.size(); i++) {
            RadioButton radioButton = (RadioButton) radiogrp.getChildAt(i);
            radioButton.setText(answerOptions.get(i));
        }
        radiogrp.clearCheck();
    }
    private int getSelectedAnswerIndex(int selectedAnswerId) {
        View selectedAnswer = radiogrp.findViewById(selectedAnswerId);
        int selectedAnswerIndex = radiogrp.indexOfChild(selectedAnswer);
        return selectedAnswerIndex;
    }
}
