package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int monthNumberMin(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;

            }
            month = month + 1;

        }
        return minMonth + 1;
    }

    public int monthNumberMax(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageAmount(sales);
        int belowMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                belowMonth++;
            }


        }
        return belowMonth;

    }

    public int abowAverageSales(int[] sales) {
        int average = averageAmount(sales);
        int abowMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                abowMonth++;
            }


        }
        return abowMonth;

    }

}
