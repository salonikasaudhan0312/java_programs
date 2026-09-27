package methods;

public class countDigit {
    static int countDigit(int num){
        int count = 0;
        while(num !=0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    static void main() {
        int num = 53127;
        int ans = countDigit(num);
        System.out.println(ans);


    }
}
