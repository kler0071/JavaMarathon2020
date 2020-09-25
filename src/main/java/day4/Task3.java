package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mass = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(50);
            }
        }

        int maxSumIdx = 0;
        int maxSum = 0;
        for (int i = 0; i < mass.length; i++) {
            int sum = 0;
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println("maxSumIdx: " + maxSumIdx);
    }
}
