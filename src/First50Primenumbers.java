package src;

public class First50Primenumbers {
    public static void main(String[] args) {
        int count = 0;
        int j = 1;
        while (count < 50) {
            int number = j;

            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                int remainder = (number % i);
                if (remainder == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                count++;
                System.out.println(number + " Prime number ");
            }
            j++;
        }


        }
    }





        // 24 % 12

        // 24 % 12 = 0
        // 24 % 2 = 0
        // 2 to 10 = 9 times
        // 3, 5, 7 , 9 = 4 times


