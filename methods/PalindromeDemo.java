package methods;

public class PalindromeDemo {

    static boolean palindrome(int n) {

        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {

        int n = 121;

        if (palindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
