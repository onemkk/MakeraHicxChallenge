package com.dataAnalysis.Statistics;

import com.dataAnalysis.Model.StatisticsModel;
import com.dataAnalysis.interfaces.Statistics;

import java.util.Arrays;

public class NumWordsStatistics implements Statistics{

    private final String nameOfStat = "Number of words ";

    @Override
    public StatisticsModel getStatistics(String fileContent) {
        //I am inferring that special characters on their own constitute a word.
        String [] words = fileContent.split(" ");
        long count = Arrays.stream(words).filter(word-> word.matches(" ") == false).count();
        StatisticsModel statistics = new StatisticsModel( nameOfStat, String.valueOf(count));
        return statistics;
    }

}
