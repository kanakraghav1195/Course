package src;

import java.util.Scanner;

public class InputIsPositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        if(number>=0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }

    }
}
