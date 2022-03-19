package com.dataAnalysis.Statistics;

import com.dataAnalysis.Model.StatisticsModel;
import com.dataAnalysis.interfaces.Statistics;

public class NumDotsStatistics implements Statistics {

    private final String nameOfStat = "Number of dots ";


    @Override
    public StatisticsModel getStatistics(String fileContent) {
        long count = fileContent.replaceAll("[^\\.]", "").length();
        StatisticsModel statistics = new StatisticsModel(nameOfStat, String.valueOf(count));
        return statistics;
    }
}
