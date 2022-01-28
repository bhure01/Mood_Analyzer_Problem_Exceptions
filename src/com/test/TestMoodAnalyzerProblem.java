package com.test;

import com.main.MoodAnalyzerProblem;
import org.junit.Assert;
import org.junit.Test;


public class TestMoodAnalyserProblem {

    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Happy Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("happy", result);
    }

    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Sad Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("sad", result);
    }
}