package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<Person> parseFileToObjList() {
        File file = new File("src/main/java/day14/people");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String human = scanner.nextLine();
                String[] mass = human.split(" ");

                if (Integer.parseInt(mass[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person person = new Person(mass[0], Integer.parseInt(mass[1]));

                people.add(person);
            }

            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }
}
