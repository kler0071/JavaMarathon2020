package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Toyota");
        list.add("Lexus");

        System.out.println(list);

        list.add(2, "Tesla");

        list.remove(0);

        System.out.println(list);
    }
}
