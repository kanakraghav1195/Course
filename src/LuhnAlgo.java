package src;

import java.util.Arrays;
import java.util.Scanner;

public class LuhnAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number");

        long ccNumber = sc.nextLong();

        long[] numberArray = arrayFromNumber(ccNumber);
        System.out.println("Original Digits " + Arrays.toString(numberArray));


        numberArray = everyAlternateNumberDouble(numberArray);
        System.out.println("After doubling the digits " + Arrays.toString(numberArray));

        numberArray = sumOfDigitArray(numberArray);
        System.out.println("After spliting the double digit values " + Arrays.toString(numberArray));

        long sum = sumOfArrayNumbers(numberArray);
        System.out.println("Total sum " + sum);

        if(sum %10 == 0){
            System.out.println("Your card number is valid");
        }else{
            System.out.println("Your card number is invalid");
        }

    }



//Break the credit card number into an array of digits
    public static long[] arrayFromNumber(long ccNumber) {
        long[] cardArray = new long[16];
        int i = cardArray.length - 1;

        while (ccNumber != 0) {
            long lastDigit = ccNumber % 10;
            ccNumber = ccNumber / 10;
            cardArray[i] = lastDigit;
            i--;
        }
        return cardArray;
    }

//here, Double every second digit from the right side
    public static long[] everyAlternateNumberDouble(long[] numberArray){
        for(int i = numberArray.length-2; i>=0; i=i-2){
            long value = numberArray[i]*2;
            numberArray[i] = value;
        }
        return numberArray;
    }

//Convert double-digit numbers into the sum of their digits
    public static long [] sumOfDigitArray (long[]numberArray){
        for(int i = 0; i< numberArray.length; i++){
            numberArray[i] = sumOfDigit(numberArray[i]);
        }
        return numberArray;
    }

//    finding the sum of the digits of a number

    public static long sumOfDigit(long number) {
        long sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;

    }

//Add all the digits together
    public static long sumOfArrayNumbers(long[] numberArray){
        long sum = 0;
        for(int i = 0; i< numberArray.length; i++){
            sum = sum + numberArray[i];
        }
        return sum;
    }
}

