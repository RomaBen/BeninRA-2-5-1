package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void testMaximumAtTheStartOfArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumAtTheEndOfArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {9, 11, 10, 8, 12};
        long expected = 12;

        long actual =  service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumAtTheMiddleOfArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 9, 7, 12, 10, 11, 2, 3};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumIfAllAreNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesImBillions = {-5, -6, -8, -7, -12, -2, -3, -10};
        long expected = -2;

        long actual = service.findMax(incomesImBillions);

        assertEquals(expected, actual);
    }
}