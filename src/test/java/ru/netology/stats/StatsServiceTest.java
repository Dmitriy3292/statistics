package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAverageAmount() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        int actual = service.averageAmount(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthNumberMin() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        int actual = service.monthNumberMin(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthNumberMax() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = service.monthNumberMax(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAbowAverageSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.abowAverageSales(managerSales);

        assertEquals(expected, actual);
    }
}