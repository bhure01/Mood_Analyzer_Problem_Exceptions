package com.main;

public class MoodAnalyzerProblem {
    //Declaring Variables
    String message;
    String mood;

    //Default Constructor
    public MoodAnalyzerProblem() {
        message = "";
    }

    //Parameterized Constructor to pass message as parameter
    public MoodAnalyzerProblem(String message) {
        this.message = message;
    }

    //method to throw custom exceptions
    public String analyzeMood(Object o)throws MoodAnalysisException
    {
        try {
            if(message.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.EMPTY,"Please Enter Proper Mood");
            }
            if (message.contains("happy")) {
                return  "happy";
            } else {
                return  "sad";
            }
        }
        catch (NullPointerException e) {
            //return "happy";
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL,"pPlease Enter Proper Mood");
        }
    }
    //MAIN METHOD AND THROW CUSTOM EXCEPTION
    public static void main (String args[])throws MoodAnalysisException{
        System.out.println("Welcome to Mood Analyzer Problem");
    }
}