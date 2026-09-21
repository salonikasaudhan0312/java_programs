package arrays;

public class MaxValue {
    static void main() {
        int arr[] = {3,5,-2,8,9};
        int n = arr.length;
        int maxValue = arr[0];
        for(int i = 0; i<=n-1; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];

            }
        }
        System.out.println(maxValue);
    }
}
