package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);

            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                list.add(number);
            }

            scanner.close();

            double sum = 0;
            for (Integer digit : list) {
                sum += digit;
            }

            double result = sum / (double) list.size();
            System.out.printf(result + " --> %.3f", result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("src/main/java/day16/test");
        printResult(file);
    }
}
