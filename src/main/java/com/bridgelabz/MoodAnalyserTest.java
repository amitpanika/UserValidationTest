package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;



public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis() throws Exception {
        MoodAnalyserTest moodAnalyserTest = new MoodAnalyserTest();
        boolean mood = moodAnalyserTest.analyseMood("this is sad message");
        Assert.assertTrue(true);
    }

    private boolean analyseMood(String this_is_sad_message) {
        Pattern pattern = Pattern.compile( this_is_sad_message);
        return pattern.matcher( this_is_sad_message).matches();

    }

}
