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

    //Method to Analyze the mood
    public String analyzeMood() {
        {
            try {
                if (message.contains("happy")) {
                    return "happy";
                } else {
                    return "sad";
                }
            } catch (NullPointerException e) {
                return "happy";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Problem");
    }
}