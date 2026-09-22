import java.util.Scanner;

class Stringinput {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide the string content:");
        String str1 = sc.nextLine();

        System.out.println("value is nextline: " + str1);

        System.out.println("provide the string content:");
        String str2 = sc.next();

        System.out.println("value is next: " + str2);
    }
}
