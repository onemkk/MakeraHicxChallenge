package com.dataAnalysis.Statistics;

import static org.junit.Assert.assertEquals;

import com.dataAnalysis.Model.StatisticsModel;
import org.junit.Test;

public class NumDotsStatisticsTest {
    @Test
    public void testGetStatistics() {
        StatisticsModel actualStatistics = (new NumDotsStatistics()).getStatistics("Not all who wander are lost. Some may be. We don't know for sure...");
        assertEquals("5", actualStatistics.getValueOfStat());
        assertEquals("Number of dots ", actualStatistics.getNameOfStat());
    }

    @Test
    public void testGetStatistics2() {
        StatisticsModel actualStatistics = (new NumDotsStatistics()).getStatistics("U");
        assertEquals("0", actualStatistics.getValueOfStat());
        assertEquals("Number of dots ", actualStatistics.getNameOfStat());
    }

}

