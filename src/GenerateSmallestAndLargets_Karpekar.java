package src;

import java.util.Scanner;

import static src.KaprekarConstant.numberToArray;

public class GenerateSmallestAndLargets_Karpekar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four digit number");

        int num = scan.nextInt();
        int number[] =  numberToArray(num);

        int maxnum = maximumNumber(number);
        int mininum = minimumNumber(number);

        System.out.println(maxnum);
        System.out.println(mininum);
    }

    public static int maximumNumber(int[] numberArray){
        for(int i = 0; i < numberArray.length; i++ ){
            for(int j = 0; j < numberArray.length; j++){
                if(numberArray[i] > numberArray[j]){
                        int temp = numberArray[i];
                        numberArray[i] = numberArray[j];
                        numberArray[j] = temp;

                }


            }
        }
        int maximumNumber  = 1000 * numberArray[0] + 100 * numberArray[1] + 10 * numberArray[2] + numberArray[3];
        return maximumNumber;
    }

    public static int minimumNumber(int[] numberArray){
        for(int i = 0; i < numberArray.length; i++ ){
            for(int j = 0; j < numberArray.length; j++){
                if(numberArray[i] < numberArray[j]){
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
