package com.test;

import com.main.MoodAnalyzerProblem;
import org.junit.Assert;
import org.junit.Test;


public class TestMoodAnalyzerProblem {

    //TC-1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Happy Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }

    //TC-1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Sad Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad", result);
    }

    //TC -2.1 - Given Null Mood should Return Happy
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(null);
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }
}