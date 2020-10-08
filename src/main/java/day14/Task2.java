package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<String> parseFileToStringList() {
        File file1 = new File("src/main/java/day14/people");
        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String person = scanner.nextLine();
                String[] mass = person.split(" ");

                if (Integer.parseInt(mass[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                list.add(person);
            }
            return list;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }


    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }
}
