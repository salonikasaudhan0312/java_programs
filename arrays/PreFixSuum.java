package arrays;

public class PreFixSuum {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
