import java.util.Scanner;

public class startriaangleulta {
  public static void main(String[] arge){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of row and column:");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i+1; j++){
        System.out.print("*");

      }
      System.out.println(" ");
    }
  }
  
}
