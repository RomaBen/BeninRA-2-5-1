package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void shouldBeTwelveIfTwelveIsMaximum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBeElevenIfElevenIsMaximum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 10, 5, 6, 11, 7, 9, 4};
        long expected = 11;

        long actual =  service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBeOneIfOneIsMaximum() {
        StatisticsService service = new StatisticsService();

        long[] testArray = {0, 1, 0, 0, 1, 0};
        long expected = 1;

        long actual = service.findMax(testArray);

        assertEquals(expected, actual);
    }
}