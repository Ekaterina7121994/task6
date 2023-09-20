package ru.netology.task6.stats;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StatsService {
    public long minSales(long[] sales) {  //минимальные продажи
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {  //максимальные продажи
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long saleAmount(long[] sales) { //сумма продажи
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {  //средний объем продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    public int monthsAboveAverage(long[] sales) {  //месяцев выше среднего
        long average = averageSales(sales);
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    public int monthLessThanAverage(long[] sales) { //месяц Меньше, чем в Среднем
        long average = averageSales(sales);
        int lessThanAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                lessThanAverage++;
            }
        }
        return lessThanAverage;
    }
}