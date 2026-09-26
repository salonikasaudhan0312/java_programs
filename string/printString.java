package string;
public class printString {
    static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static void main() {
        String str = "Love";

        printString(str);
    }
}
