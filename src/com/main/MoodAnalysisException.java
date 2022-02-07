package com.main;

public class MoodAnalysisException extends Exception {

    enum MoodAnalysisCustomException{
        NULL,EMPTY;    //Values entered
    }
    public MoodAnalysisCustomException type;

    //Parametrized Constructor to pass message and handle exception
    public MoodAnalysisException(MoodAnalysisCustomException type,String message) {
        super(message);
        this.type = type;
    }
}
