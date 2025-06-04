package src;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 100;
        long first = 0;
        long second =1;

        for(int i =0; i<n; i++){
            System.out.println(first);
            long sum = first+second;
            first = second;
            second = sum;

        }
    }
}
