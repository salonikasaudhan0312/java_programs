public class selection {
  public static void main(String[] args){
        int[] arr = {2,67,45,89,-34};
        int n = arr.length;
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]= temp;

        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
  
}
