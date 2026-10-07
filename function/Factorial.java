package function;

public class Factorial {
    private static boolean fact;

    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
            
        }
        return fact;
    }

    static void main() {
        int n = 5;
        int result = factorial(n);
        System.out.println("factrial=" +factorial(n));
        
        
    }
}
