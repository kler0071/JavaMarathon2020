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

        int min = 10000;
        for (int number : mass) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min: " + min);

        int counter = 0;
        for (int element : mass) {
            if (element % 10 == 0) {
                counter++;
            }
        }
        System.out.println("0: " + counter);

        int sum = 0;
        for (int element : mass) {
            if (element % 10 == 0) {
                sum += element;
            }
        }
        System.out.println("sum: " + sum);
    }
}
