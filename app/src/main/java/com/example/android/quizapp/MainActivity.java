package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void answer1() {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio_group_1);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (checkedRadioButtonId == R.id.question_1_rb_3) {
            score += 1;
        }
    }

    private void answer2() {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio_group_2);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (checkedRadioButtonId == R.id.question_2_rb_2) {
            score += 1;
        }
    }

    private void answer3() {
        EditText edtx = (EditText)findViewById(R.id.question_3_answer);
        String inputText = edtx.getText().toString();
        String answer = "operating system";
        if (inputText.toLowerCase().contains(answer)) {
            score += 1;
        }
    }

    private void answer4() {
        CheckBox cb1 = (CheckBox) findViewById(R.id.question_4_checkBox_1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.question_4_checkBox_2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.question_4_checkBox_3);

        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked()) {
            score += 1;
        }
    }

    private void answer5() {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio_group_3);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (checkedRadioButtonId == R.id.question_5_rb_3) {
            score += 1;
        }
    }

    public void submit(View view) {
        answer1();
        answer2();
        answer3();
        answer4();
        answer5();

        Toast.makeText(this, "You scored: " + score, Toast.LENGTH_SHORT).show();

    }

    public void reset(View view) {
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radio_group_1);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radio_group_2);
        CheckBox cb1 = (CheckBox) findViewById(R.id.question_4_checkBox_1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.question_4_checkBox_2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.question_4_checkBox_3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.question_4_checkBox_4);
        EditText edtx = (EditText)findViewById(R.id.question_3_answer);
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radio_group_3);


        radioGroup1.clearCheck();
        radioGroup2.clearCheck();

        if (cb1.isChecked()) {
            cb1.setChecked(false);
        }

        if (cb2.isChecked()) {
            cb2.setChecked(false);
        }

        if (cb3.isChecked()) {
            cb3.setChecked(false);
        }

        if (cb4.isChecked()) {
            cb4.setChecked(false);
        }

        edtx.getText().clear();

        radioGroup3.clearCheck();

        score = 0;
    }
}
