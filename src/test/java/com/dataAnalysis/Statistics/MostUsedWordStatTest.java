package com.dataAnalysis.Statistics;

import static org.junit.Assert.assertEquals;

import com.dataAnalysis.Model.StatisticsModel;
import org.junit.Test;

public class MostUsedWordStatTest {
    @Test
    public void testGetStatistics() {
        StatisticsModel actualStatistics = (new MostUsedWordStat()).getStatistics("one for one and one for all at all times");
        assertEquals("one", actualStatistics.getValueOfStat());
        assertEquals("Most used word ", actualStatistics.getNameOfStat());
    }

    @Test
    public void testGetStatistics2() {
        StatisticsModel actualStatistics = (new MostUsedWordStat())
                .getStatistics("for one, one for all");
        assertEquals("for", actualStatistics.getValueOfStat());
        assertEquals("Most used word ", actualStatistics.getNameOfStat());
    }
}

