package com.test;

import com.main.MoodAnalysisException;
import com.main.MoodAnalyzerProblem;
import org.junit.Assert;
import org.junit.Test;


public class TestMoodAnalyzerProblem {

    //TC-1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Happy mood");
        String result = moodAnalyser.analyzeMood(null);
        Assert.assertEquals("Happy", result);
    }

    //TC-1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("I am in Sad Mood");
        String result = moodAnalyser.analyzeMood(null);
        Assert.assertEquals("Sad", result);
    }

    //TC -2.1 - Given Null Mood should Return Happy
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() throws MoodAnalysisException {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(null);
        String result = moodAnalyser.analyzeMood(null);
        Assert.assertEquals("Happy", result);
    }

    //TC-3.1 Given Null Mood should throw MoodAnalysisException
    @Test
    public void givenNull_MoodShould_ThrowException() throws MoodAnalysisException {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem(null);
        try
        {
            moodAnalyser.analyzeMood(null);
        }catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisException.NULL,e.type);
        }
    }

    //TC-3.2 Given Empty Mood should throw MoodAnalysisException
    @Test
    public void givenEmpty_MoodShould_ThrowException() throws MoodAnalysisException {
        MoodAnalyzerProblem moodAnalyser = new MoodAnalyzerProblem("");

        try
        {
            moodAnalyser.analyzeMood("");
        }catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.EMPTY,e.type);
        }
    }
}



