package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] mass = new int[number];

        int sum = 0;
        int even = 0;
        int odd = 0;
        int more8 = 0;
        int eq1 = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(number);
            sum += mass[i];
            if (mass[i] % 2 == 0) {
                even += 1;
            }
            if (mass[i] % 2 != 0) {
                odd += 1;
            }
            if (mass[i] == 1) {
                eq1 += 1;
            }
            if (mass[i] > 8) {
                more8 += 1;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Длина массива: " + mass.length);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + eq1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
