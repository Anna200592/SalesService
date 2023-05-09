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
        int average = getSum(sales)/sales.length;
        return average;
    }

    public int underAverage(int[] sales) {
        int unAverage = 0;
        for (int sale : sales) {
            if (sale < getAverage(sales)) {
                unAverage+=1;
            }
        }
        return unAverage;
    }

    public int overAverage(int[] sales) {
        int overAverage = 0;
        for (int sale : sales) {
            if (sale > getAverage(sales)) {
                overAverage+=1;
            }
        }
        return overAverage;
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

}

