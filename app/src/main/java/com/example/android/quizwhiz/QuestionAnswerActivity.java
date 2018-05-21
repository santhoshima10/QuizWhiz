package com.example.android.quizwhiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Map;

public class QuestionAnswerActivity extends AppCompatActivity {


    private questionLibrary mQuestionLibraryObj = new questionLibrary();

    private TextView mQuestionTextView;

    private Button mChoice1Button;
    private Button mChoice2Button;
    private Button mChoice3Button;
    private Button mChoice4Button;


    private TextView mNoOfQuestionsTextView;
   // private Button mNextButton;
  //  private Button mPreviousButton;
    private String mAnswer;

    private int mScore = 0;
    private int mQuestionNo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_answer_main);


        mNoOfQuestionsTextView = (TextView) findViewById(R.id.no_of_questions_id) ;
        mQuestionTextView = (TextView)findViewById(R.id.question_id);
        mChoice1Button = (Button)findViewById(R.id.choice_1_btn_id) ;
        mChoice2Button = (Button)findViewById(R.id.choice_2_btn_id);
        mChoice3Button = (Button) findViewById(R.id.choice_3_btn_id);
        mChoice4Button = (Button) findViewById(R.id.choice_4_btn_id);


       // mNextButton = (Button)findViewById(R.id.next_btn_id);

        updateQuestion();




        mChoice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice1Button.getText() == mAnswer){
                    mScore = mScore+1;

                }
                updateQuestion();

            }
        });

        mChoice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice2Button.getText() == mAnswer){
                    mScore = mScore+1;

                }
                updateQuestion();

            }
        });


        mChoice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice3Button.getText() == mAnswer){
                    mScore = mScore+1;

                }
                updateQuestion();

            }
        });

        mChoice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice4Button.getText() == mAnswer){
                    mScore = mScore+1;

                }
                updateQuestion();

            }
        });

    }






    public void updateQuestion(){


        if(mQuestionNo < mQuestionLibraryObj.getQuestionsCount()) {

            mQuestionTextView.setText(mQuestionLibraryObj.getQuestion(mQuestionNo));

            mChoice1Button.setText(mQuestionLibraryObj.getChoice1(mQuestionNo));
            mChoice2Button.setText(mQuestionLibraryObj.getChoice2(mQuestionNo));
            mChoice3Button.setText(mQuestionLibraryObj.getChoice3(mQuestionNo));
            mChoice4Button.setText(mQuestionLibraryObj.getChoice4(mQuestionNo));

            mAnswer = mQuestionLibraryObj.getAnswer(mQuestionNo);
            mQuestionNo = mQuestionNo + 1;
            mNoOfQuestionsTextView.setText("Question " + mQuestionNo + " of " + mQuestionLibraryObj.getQuestionsCount());

        }

        else{
            System.out.println("Quiz Score "+Integer.toString(mScore));
            Intent intent = new Intent(QuestionAnswerActivity.this,ScoreActivity.class);
            intent.putExtra("Score",Integer.toString(mScore));
            startActivity(intent);
        }


    }

}
