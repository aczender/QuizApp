package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizQuestions extends AppCompatActivity {

    double basePoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);
    }


    public void bridgeClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.chain_bridge:
                if (checked)
                    basePoint = basePoint + 0.5;
                break;
            case R.id.margaret_bridge:
                if (checked)
                    basePoint = basePoint + 0.5;
                break;
        }
    }


    public void capitalClick(View view) {
        EditText letter = (EditText) findViewById(R.id.capital);
        String answer = letter.getText().toString();
        if (answer.equals("Budapest ")) {
            basePoint += 1;
        }
    }

    public void questionTram(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.yes_button:
                if (checked)
                    basePoint = basePoint + 1;
                break;
            case R.id.no_button:
                if (checked)
                    basePoint = basePoint + 0;
                break;
        }

    }

    public void questionParliament(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.buda_button:
                if (checked)
                    basePoint = basePoint + 0;
                break;
            case R.id.pest_button:
                if (checked)
                    basePoint = basePoint + 1;
                break;
        }

    }

    public void questionDanube(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.no2_button:
                if (checked)
                    basePoint = basePoint + 1;
                break;
            case R.id.no4_button:
                if (checked)
                    basePoint = basePoint + 0;
                break;
        }

    }

    public void marketClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.lehel:
                if (checked)
                    basePoint = basePoint + 0.5;
                break;
            case R.id.vasar:
                if (checked)
                    basePoint = basePoint + 0.5;
                break;
            case R.id.hold:
                if (checked)
                    basePoint = basePoint + 0.5;
                break;
        }
    }

    public void submitAnswer(View view) {
        Toast.makeText(this, "Congratulations! Your total score is: " + basePoint, Toast.LENGTH_SHORT).show();
    }
}