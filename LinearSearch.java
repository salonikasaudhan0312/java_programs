import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] arr = {10,20,30,40,50};
  System.out.println("enter number to search:");
  int key = sc.nextInt();
  
  for(int i=0; i < arr.length; i++){
    if(arr[i] == key){
      System.out.println("enter found at index"+i);
      sc.close();
      return;
    }
  }
  
  System.out.println("enter not found");
  
  sc.close();

  }
  
}
