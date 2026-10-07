package function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    static void checkEvenOdd(int n){
        if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no:");
    int n = sc.nextInt();
    checkEvenOdd(n);


}
}
