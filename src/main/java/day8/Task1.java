package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 20000; i++)
            sb.append(i + " ");

        long finish = System.currentTimeMillis();

        System.out.println("Время string builder: " + (finish - start));
        //System.out.println(sb.toString());

        start = System.currentTimeMillis();

        String numbers = "";
        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }

        finish = System.currentTimeMillis();

        System.out.println("Время string: " + (finish - start));
        //System.out.println(numbers);
    }
}
