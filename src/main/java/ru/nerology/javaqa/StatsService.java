package ru.nerology.javaqa;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

    public int monthLessAboveAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

    public int minSalesMonth(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }
}

