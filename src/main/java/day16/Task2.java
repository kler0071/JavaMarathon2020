package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void printResult(File file) throws FileNotFoundException {
        List<Double> list = new ArrayList<>();
        Scanner scanner2 = new Scanner(file);
        while (scanner2.hasNextDouble()) {
            double number = scanner2.nextDouble();
            list.add(number);
        }
        scanner2.close();

        double sum = 0;
        for (Double number : list) {
            sum += number;
        }
        System.out.println((int)sum);
    }


    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            printWriter1.println(random.nextInt(100));
        }

        printWriter1.close();

        Scanner scanner1 = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter printWriter2 = new PrintWriter(file2);

        int sum = 0;
        int counter = 0;

        while (scanner1.hasNextInt()) {
            sum += scanner1.nextInt();
            counter++;

            if (counter == 20) {
                printWriter2.println(sum / (double) counter);
                sum = 0;
                counter = 0;
            }
        }
        printWriter2.close();

        printResult(file2);
    }
}
