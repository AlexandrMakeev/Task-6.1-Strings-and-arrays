package ru.netology.stats;

public class StatsService {
    public int sum(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result = result + input[i];
        }
        return result;
    }

    public float avarage(int[] input) {
        return (float) sum(input) / input.length;
    }

    public int maxSales(int[] input) {
        int maxMonth = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > input[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] input) {
        int minMonth = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] input) {
        int amountMonth = 0;
        float avarage = avarage(input);
        for (int i = 0; i < input.length; i++) {
            if (input[i] < avarage(input)) {
                amountMonth++;

            }
        }
        return amountMonth;
    }

    public int aboveAverageSales(int[] input) {
        int amountMonth = 0;
        float avarage = avarage(input);
        for (int i = 0; i < input.length; i++) {
            if (input[i] > avarage) {
                amountMonth++;

            }
        }
        return amountMonth;
    }

}
