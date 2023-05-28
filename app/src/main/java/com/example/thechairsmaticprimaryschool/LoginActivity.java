package com.example.thechairsmaticprimaryschool;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;

    Button btnLogin;

    User[] users =new User[]{
            new User(1,"Rupak Dahal", "rupak", "password"),
            new User(2,"daniel decruz", "daniel", "daniel"),
            new User(3,"shankar", "dev", "kumar"),
            new User(4,"ganaga maya", "ganaga", "maya"),
            new User(5,"Rohit karma", "rohit", "rohit"),
            new User(6,"sujan manandhar", "sujan", "sujan"),
            new User(7,"bikash dahal", "bikash", "rajjj"),
            new User(8,"sagar Dahal", "sagar", "sagar"),
            new User(9,"sameer Dahal", "sameer", "sameer"),
            new User(10,"Rupesh Dahal", "rupesh", "rupesh"),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login);


        btnLogin.setOnClickListener(view -> {
            String inputUsername = username.getText().toString();
            String inputPassword = password.getText().toString();

            if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
                Snackbar.make(btnLogin, "Please enter username and password", Snackbar.LENGTH_LONG).show();
                return;
            }

            boolean foundMatch = false;
            for (User user : users) {


                if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                    Intent intent = new Intent(LoginActivity.this, homepage.class);
                    intent.putExtra("name", user.getName());
                    intent.putExtra("id", user.getId());
                    startActivity(intent);
                    foundMatch = true;
                    break;

                }
            }
            if (!foundMatch) {
                Toast.makeText(this, "Invalid username and password", Toast.LENGTH_SHORT).show();
            }
        });


    }
}