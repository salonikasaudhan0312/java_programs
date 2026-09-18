package arrays;

public class Countposandneg {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -8, 15, -2};

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}
