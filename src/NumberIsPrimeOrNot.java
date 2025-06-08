package src;

import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<number; i++){
            int remainder = number%i;
            if(remainder==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println(number + " is Prime Number");
        } else{
            System.out.println(number + " is not a Prime Number");
        }
    }
}
