package com.Bridglab.MoodAnalyzer;


public class MoodAnalyzer {
       public String analyzerMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}