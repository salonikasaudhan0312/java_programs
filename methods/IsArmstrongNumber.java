package methods;

public class IsArmstrongNumber {
    static boolean IsArmstrongNumber(int num){
        int sum = 0;
        int originalNum = num;

        while(num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if(sum == originalNum) {
            return true;
        }
        else {
            return false;
            }

        }
        public static void main(String[] args) {

            int n = 153;

            System.out.println("IsArmstrongNumber= " +IsArmstrongNumber(n) );
        }
    }


