package com.example.android.quizwhiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView mQuizScore;
    private String mValue;
    private ImageButton mHomeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            mValue = extras.getString("Score");
        }
        setContentView(R.layout.activity_score);
        mQuizScore = (TextView)findViewById(R.id.quiz_score_text_vw_id);
        mQuizScore.setText(mValue);

        mHomeBtn = (ImageButton)findViewById(R.id.imageButton);
        mHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent);
            }


        });


    }
}
