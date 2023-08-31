package ru.netology.task6.stats;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; //
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int saleAmount(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageValue = sum / sales.length;
        return averageValue;
    }

    public int monthsAboveAverage(long[] sales) {
        int aboveAverage = 0;
        int a = averageSales(sales);
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > a) {
                aboveAverage = aboveAverage + 1;
            }
        return aboveAverage;
    }

    public int monthLessThanAverage(long[] sales) {
        int lessThanAverage = 0;
        int a = averageSales(sales);
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > a) {
                lessThanAverage = lessThanAverage + 1;
            }
        return lessThanAverage;
    }
}