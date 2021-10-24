package com.Bridglab.MoodAnalyzer;

public class MoodAnalyzer {
    public String MoodAnalyzerr(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}