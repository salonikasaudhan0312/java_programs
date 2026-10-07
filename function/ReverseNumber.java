package function;

public class ReverseNumber {

    static int ReverseNumber(int n){
        int rev = 0;
        while(n>0){
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return rev;

    }
    static void main() {
        int n = 12345;
        int result = ReverseNumber(n);
        System.out.println("ReverseNumber:=" +result);
    }
}
