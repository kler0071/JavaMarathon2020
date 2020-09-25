package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[100];

        Random random = new Random(10000);

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt();
        }

        int maxSum = 0;
        int maxSumIdx=0;
        for (int i = 0; i < mass.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += mass[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx=i;
            }
        }
        System.out.println(maxSumIdx);
    }
}
