package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[100];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10000);
        }

        int max = 0;
        for (int number : mass) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("max: " + max);

        int min = 0;
        for (int number : mass) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min: " + min);
    }
}
