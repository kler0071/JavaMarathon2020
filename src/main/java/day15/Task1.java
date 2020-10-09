package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File output = new File("src/main/resources/shoes.csv");
        Scanner scanner = new Scanner(output);

        File input = new File("src/main/resources/missing_shoes.txt");
        PrintWriter printWriter = new PrintWriter(input);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] mass = line.split(";");
            if (Integer.parseInt(mass[2]) == 0) {
                printWriter.println(mass[0] + ", " + mass[1] + ", " + mass[2]);
            }
        }
        printWriter.close();
        scanner.close();
    }
}
