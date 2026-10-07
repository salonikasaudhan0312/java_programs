package function;

public class findMaximumOfTwoNumber {
    static int maximumnumber(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    static void main() {
        System.out.println(maximumnumber(15, 20));


    }
}
