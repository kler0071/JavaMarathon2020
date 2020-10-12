package day18;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(547732));
    }

    public static int count7(int digit) {
        if (digit == 0) {
            return 0;
        }

        if (digit % 10 == 7) {
            return 1 + count7(digit / 10);
        } else {
            return count7(digit / 10);
        }
    }
}
