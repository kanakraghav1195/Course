package src;

public class First20PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        int j = 1;
     while(counter < 20){
            int number = j;
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                int remainder = (number % i);
                if (remainder == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == true) {
                counter++;
                System.out.println(number + " Primenumber");
            }
            j++;
        }
    }
}
