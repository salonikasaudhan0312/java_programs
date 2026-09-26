package string;

public class ReverseString {
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;

    }

    static void main() {
        String str = "LOVE";
        System.out.println(reverseString(str));
    }
}
