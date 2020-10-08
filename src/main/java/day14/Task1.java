package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);

            int sum = 0;
            int counter = 0;

            while (sc.hasNextInt()) {
                sum += sc.nextInt();
                counter++;
            }

            sc.close();

            if (counter < 10 || counter > 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else {
                System.out.println(sum);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void main(String[] args) {
        File file = new File("src/main/java/day14/test");
        printSumDigits(file);
    }
}
