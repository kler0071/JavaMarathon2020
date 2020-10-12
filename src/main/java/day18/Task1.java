package day18;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int[] digits = {15, 170, -345, 200, 5};

        System.out.println(recursionSum(digits, 0));

    }


    public static int recursionSum(int[] digits, int i) {

        if (i == digits.length)
            return 0;

        return digits[i] + recursionSum(digits, i + 1);

    }
}
