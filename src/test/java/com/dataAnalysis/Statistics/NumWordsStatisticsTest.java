package com.dataAnalysis.Statistics;

import static org.junit.Assert.assertEquals;

import com.dataAnalysis.Model.StatisticsModel;
import org.junit.Test;

public class NumWordsStatisticsTest {
    @Test
    public void testGetStatistics() {
        StatisticsModel actualStatistics = (new NumWordsStatistics()).getStatistics("all for one and one for all at all times");
        assertEquals("10", actualStatistics.getValueOfStat());
        assertEquals("number of words ", actualStatistics.getNameOfStat());
    }

    @Test
    public void testGetStatistics2() {
        StatisticsModel actualStatistics = (new NumWordsStatistics()).getStatistics(" ");
        assertEquals("0", actualStatistics.getValueOfStat());
        assertEquals("number of words ", actualStatistics.getNameOfStat());
    }
}

