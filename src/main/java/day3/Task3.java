package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 5) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double c = a / b;
            System.out.println(c);
            i++;
        }
    }
}
