package arrays;

public class SecondLargestElement {
    static void main() {
        int[] arr = {10, 5, 20, 8, 15};

        int max = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}
