package src;

public class NumberDivisibleBy3and5 {
    public static void main(String[] args) {

        for(int i=1; i<100; i++){
            if(i%3==0){
                System.out.print( i + " " );
            }
        }
    }
}

class NumberDivisibleBy5 {
    public static void main(String[] args) {
        for(int i = 1; i<100; i++){
            if(i%5==0){
                System.out.print( i + " ");
            }

        }
    }
}

class NumberDivisibleByBoth {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}