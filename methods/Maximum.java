public class Maximum {

    static int maximum(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 15};

        int result = maximum(arr);

        System.out.println("Maximum number = " + result);
    }
}