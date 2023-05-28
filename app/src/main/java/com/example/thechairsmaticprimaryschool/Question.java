package com.example.thechairsmaticprimaryschool;

import java.util.List;

public class Question {
    private String questionText;

    private List<String> answerOption;

    private  int correctAnswerIndex;


    public Question(String questionText, List<String> answerOption, int correctAnswerIndex){
        this.questionText=questionText;
        this.answerOption=answerOption;
        this.correctAnswerIndex=correctAnswerIndex;
    }
    public  String getQuestionText(){return questionText;}

    public List<String>getAnswerOption(){return  getAnswerOption();}

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
