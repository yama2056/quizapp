package com.example.thechairsmaticprimaryschool;

import static com.example.thechairsmaticprimaryschool.R.id.btnMultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText edtvalueOne,edtValueTwo;

    Button btnADD,btnSubtract,btnMultiplication,btnDivison;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText edtValueOne =findViewById(R.id.edtvalueOne);
        EditText edtValueTwo= findViewById(R.id.edtvalueTwo);
        Button btnADD = findViewById(R.id.btnADD);
        Button btnSubtract= findViewById(R.id.btnSubtract);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnMultiplication= findViewById(R.id.btnMultiplication);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnDivison= findViewById(R.id.btnDivison);
        TextView txtResult= findViewById(R.id.txtResult);

        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strValueOne =edtValueOne.getText().toString();
                String strValueTwo= edtValueTwo.getText().toString();


                int intValueOne= Integer.parseInt(strValueOne);
                int intValueTwo= Integer.parseInt(strValueTwo);
                int result =-intValueOne + intValueTwo;

                txtResult.setText(String.valueOf(result));

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strValueOne= edtValueOne.getText().toString();
                String strValueTwo= edtValueTwo.getText().toString();

                int intValueOne= Integer.parseInt(strValueOne);
                int intValueTwo= Integer.parseInt(strValueTwo);
                int result =-intValueOne - intValueTwo;

                txtResult.setText(String.valueOf(result));


            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strValueOne = edtValueOne.getText().toString();
                String strValueTwo = edtValueTwo.getText().toString();

                int intValueOne = Integer.parseInt(strValueOne);
                int intValueTwo = Integer.parseInt(strValueTwo);
                int result = -intValueOne * intValueTwo;

                txtResult.setText(String.valueOf(result));

            }

        });
        btnDivison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strValueOne = edtValueOne.getText().toString();
                String strValueTwo = edtValueTwo.getText().toString();

                if (strValueTwo.equals("0")) {
                    txtResult.setText("Infinity");
                } else {

                    int intValueOne = Integer.parseInt(strValueOne);
                    int intValueTwo = Integer.parseInt(strValueTwo);
                    int result = -intValueOne / intValueTwo;

                    txtResult.setText(String.valueOf(result));

                }
            }
        });

                }
    }
