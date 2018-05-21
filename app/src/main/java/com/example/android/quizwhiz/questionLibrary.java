package com.example.android.quizwhiz;

/**
 * Created by santhoshima on 14/05/18.
 */

public class questionLibrary {

    private String mQuestions[] = {
            "Java is a ........... language.",
            "How many primitive data types are there in Java?",
            "In Java byte, short, int and long all of these are",
            "Size of int in Java is",
            "The smallest integer type is ......... and its size is ......... bits."

    };

    private String mChoices[][] = {
            {"Weakly Typed","Strongly Typed","Moderate Typed","None of these"},
            {"6","7","8","9"},
            {"Signed","Unsigned","Both of the above","None"},
            {"16 Bit","32 Bit","64 Bit","Depends on execution environment"},
            {"Short,8","Byte,8","Short,16","Byte,16"}
    };

    private String answers[] = {
            "Strongly Typed",
            "8",
            "Signed",
            "32 Bit",
            "Byte,8"

    };


    public String getQuestion(int offset){
        return mQuestions[offset];
    };

    public String getAnswer(int offset){
        return answers[offset];
    };

    public String[][] getChoices(){
        return mChoices;

    };

    public String getChoice1(int offset){
        return mChoices[offset][0];
    }

    public String getChoice2(int offset){
        return mChoices[offset][1];
    }

    public String getChoice3(int offset){
        return mChoices[offset][2];
    }

    public String getChoice4(int offset){
        return mChoices[offset][3];
    }

    public int getQuestionsCount(){
        return mQuestions.length;
    }





}
