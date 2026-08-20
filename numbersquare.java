import java.util.Scanner;

public class numbersquare {
  public static void main(String[] arge){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of rows");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        // System.out.print(i + " ");
        System.out.print((char)(j+64)+" ");
      }
      System.out.println();
    }
  }
  
}
