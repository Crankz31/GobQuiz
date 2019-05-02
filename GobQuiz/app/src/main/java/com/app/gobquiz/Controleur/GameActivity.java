package com.app.gobquiz.Controleur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.app.gobquiz.R;

public class GameActivity extends AppCompatActivity {
    private TextView mQuestionTxt;
    private Button mQuestion1;
    private Button mQuestion2;
    private Button mQuestion3;
    private Button mQuestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionTxt =  findViewById(R.id.activity_game_question_txt);
        mQuestion1 =  findViewById(R.id.activity_game_answer1_btn);
        mQuestion2 =  findViewById(R.id.activity_game_answer2_btn);
        mQuestion3 =  findViewById(R.id.activity_game_answer3_btn);
        mQuestion4 =  findViewById(R.id.activity_game_answer4_btn);
    }
}
