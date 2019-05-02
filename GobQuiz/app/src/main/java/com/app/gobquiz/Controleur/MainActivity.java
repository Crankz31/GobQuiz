package com.app.gobquiz.Controleur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.gobquiz.Modele.User;
import com.app.gobquiz.R;

public class MainActivity extends AppCompatActivity {
    private TextView mBienvenueTxt;
    private EditText mNameInput;
    private Button mStartButton;
    private User mUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUser = new User();
        mBienvenueTxt =  findViewById(R.id.activity_main_bienvenue_txt);
        mNameInput =  findViewById(R.id.activity_main_name_input);
        mStartButton =  findViewById(R.id.activity_main_start_btn);
        mStartButton.setEnabled(false);
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This is where we'll check the user input
                mStartButton.setEnabled(s.toString().length() !=0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = mNameInput.getText().toString();
                mUser.setFirstName(firstname);
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);
            }
        });
    }

}
