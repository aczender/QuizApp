package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizQuestions extends AppCompatActivity {

    double score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);
    }
    public void submitAnswer(View view) {

        //bridge question
        CheckBox chainCheck = (CheckBox) findViewById(R.id.chain_bridge);
        boolean hasChain = chainCheck.isChecked();

        CheckBox nowhereCheck = (CheckBox) findViewById(R.id.nowhere_bridge);
        boolean hasNowhere = nowhereCheck.isChecked();

        CheckBox margaretCheck = (CheckBox) findViewById(R.id.margaret_bridge);
        boolean hasMargaret = margaretCheck.isChecked();

        CheckBox neverendingCheck = (CheckBox) findViewById(R.id.neverending_bridge);
        boolean hasNeverending = neverendingCheck.isChecked();

        // capital question
        String answer = ((EditText)findViewById(R.id.capital)).getText().toString();
        String capitalAnswer = "Budapest ";

        // tram question
        RadioButton yesCheck = (RadioButton) findViewById(R.id.yes_button);
        boolean hasYes = yesCheck.isChecked();

        RadioButton noCheck = (RadioButton) findViewById(R.id.no_button);
        boolean hasNo = noCheck.isChecked();

        // parliament question
        RadioButton budaCheck = (RadioButton) findViewById(R.id.buda_button);
        boolean hasBuda = budaCheck.isChecked();

        RadioButton pestCheck = (RadioButton) findViewById(R.id.pest_button);
        boolean hasPest = pestCheck.isChecked();

        // tramline question
        RadioButton no2Check = (RadioButton) findViewById(R.id.no2_button);
        boolean hasNo2 = no2Check.isChecked();

        RadioButton no4Check = (RadioButton) findViewById(R.id.no4_button);
        boolean hasNo4 = no4Check.isChecked();

        //market question
        CheckBox lehelCheck = (CheckBox) findViewById(R.id.lehel);
        boolean hasLehel = lehelCheck.isChecked();

        CheckBox vasarCheck = (CheckBox) findViewById(R.id.vasar);
        boolean hasVasar = vasarCheck.isChecked();

        CheckBox holdCheck = (CheckBox) findViewById(R.id.hold);
        boolean hasHold = holdCheck.isChecked();

        CheckBox fishCheck = (CheckBox) findViewById(R.id.fish);
        boolean hasFish = fishCheck.isChecked();

        double score = calculatePoints(hasChain, hasNowhere, hasMargaret, hasNeverending, answer, hasYes, hasNo,hasBuda, hasPest, hasNo2, hasNo4, hasLehel, hasVasar, hasHold, hasFish);

        Toast.makeText(this, "Congratulations! Your total score is: " + score, Toast.LENGTH_SHORT).show();
    }

    private double calculatePoints(boolean addChain, boolean addNowhere, boolean addMargaret, boolean addNeverending, String capitalAnswer, boolean addYes, boolean addNo,boolean addBuda, boolean addPest, boolean addNo2, boolean addNo4, boolean addLehel, boolean addVasar, boolean addHold, boolean addFish) {
        double basePoint = 0;

        // calculation for bridges
        if (addChain) {
            basePoint += 0.5;
        }
        if (addNowhere) {
            basePoint -= 0.5;
        }
        if (addMargaret) {
            basePoint += 0.5;
        }
        if (addNeverending) {
            basePoint -= 0.5;
        }

        // calculation for capital
        if (capitalAnswer.equals("Budapest ")){
            basePoint +=1;
        }
        else {
            basePoint -=1;
        }

        // calculation for trams
        if (addYes) {
            basePoint += 1;
        }
        if (addNo) {
            basePoint -= 1;
        }

        // calculation for parliament
        if (addBuda) {
            basePoint -= 1;
        }
        if (addPest) {
            basePoint += 1;
        }

        // calculation for tramline
        if (addNo2) {
            basePoint += 1;
        }
        if (addNo4) {
            basePoint -= 1;
        }

        // calculation for markets
        if (addLehel) {
            basePoint += 0.5;
        }
        if (addVasar) {
            basePoint += 0.5;
        }
        if (addHold) {
            basePoint += 0.5;
        }
        if (addFish) {
            basePoint -= 0.5;
        }

        return basePoint * 1;
    }
}