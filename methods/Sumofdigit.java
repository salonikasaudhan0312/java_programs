public class Sumofdigit {

    static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 1234;

        System.out.println("Sum = " + sumOfDigits(n));
    }
}