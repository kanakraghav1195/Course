package src;

import java.util.Arrays;

public class KaprekarConstant {
    public static void main(String[] args) {
        int number = 1459;
        int count = 0;

        while(number!= 6174){
            int numberArray[] = numberToArray(number);
            int maxNum = maximumNumber(numberArray);
            int minNum = minimumNumber(numberArray);
            number = maxNum-minNum;
            System.out.println(maxNum + minNum + " = " + number);

            count++;
        }
        if(number == 6174){
            System.out.println("Total number of repetitions to reach 6174 " + " = " + count );
        }
    }

    public static int maximumNumber(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[i] > numberArray[j]) {
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        int maximumNumber = 1000 * numberArray[0] + 100 * numberArray[1] + 10 * numberArray[2] + numberArray[3];
        return maximumNumber;
    }

    public static int minimumNumber(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[i] < numberArray[j]) {
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        int minimumNumber = 1000 * numberArray[0] + 100 * numberArray[1] + 10 * numberArray[2] + numberArray[3];
        return minimumNumber;

    }

    public static int[] numberToArray(int num) {
        int[] numberArray = new int[4];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = num % 10;
            num = num / 10;
        }
        return numberArray;
    }

}






