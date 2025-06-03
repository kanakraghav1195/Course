package src;

public class SumAllDigitValue {
    public static void main(String[] args) {
        int a = 234;
        int sum = 0;
        while(a!=0) {
            int lastdigit = a % 10;
            sum = sum + lastdigit;
            a = a/10;
        }
        System.out.println("sum = " + sum);
    }
}
