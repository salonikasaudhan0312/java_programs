package arrays;

public class multiply {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 67};
        int ans = 1;
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int value = arr[i];
            ans = ans * value;

        }
        System.out.println(ans);
    }
}
