package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the Button that starts the quiz
        Button start_quiz = (Button) findViewById(R.id.start_quiz);

        //Set a click listener on the button
        start_quiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the quiz
                Intent start_quiz = new Intent(MainActivity.this, QuizQuestions.class);

                // Start the new activity
                startActivity(start_quiz);
            }
        });
    }
}