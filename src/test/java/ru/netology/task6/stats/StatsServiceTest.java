package ru.netology.task6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void minSales() { // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 9;
        long actualDay = stats.minSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxSales() { // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 8;
        long actualDay = stats.maxSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void saleAmount() { // сумму всех продаж
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = stats.saleAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() { //среднюю сумму продаж в месяц
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = stats.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void monthsAboveAverage() { //количество месяцев, в которых продажи были выше среднего
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAverage = 5;
        long actualAboveAverage = stats.monthsAboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

    @Test
    public void monthLessThanAverage() { //количество месяцев, в которых продажи были ниже среднего
        StatsService stats = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAverage = 5;
        long actualBelowAverage = stats.monthLessThanAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

}