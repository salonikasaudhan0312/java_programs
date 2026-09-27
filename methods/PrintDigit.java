package methods;

public class PrintDigit {
    static void printDigit(int num){
        while(num !=0){
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    static void main() {
        int num = 53127;
        printDigit(num);

    }
}
