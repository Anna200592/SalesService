package ru.netology.stats;

public class StatsService {
    public int getSum(int[] sales) {
        int sum = 0;

        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int getAverage(int[] sales) {
        if (sales.length > 0) {
            return getSum(sales) / sales.length;
        }
        return 0;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underAverage(int[] sales) {
        int unAverage = 0;
        int avg = getAverage(sales);
        for (int sale : sales) {
            if (sale < avg) {
                unAverage++;
            }
        }
        return unAverage;
    }

    public int overAverage(int[] sales) {
        int overAverage = 0;
        int avg = getAverage(sales);
        for (int sale : sales) {
            if (sale > avg) {
                overAverage++;
            }
        }
        return overAverage;
    }

}

