package src;

import java.util.Scanner;

public class MoneyReturnCoinChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Bought Items for");
        int boughtItemsFor = scan.nextInt();
        System.out.println("Enter Given Rupee");
        int givenRupee = scan.nextInt();

        int totalAmountReturn = givenRupee - boughtItemsFor;
        System.out.println("Total return = " + totalAmountReturn);


        while(totalAmountReturn>= 20){
            System.out.println("Note: " + 20);
            totalAmountReturn = totalAmountReturn-20;
        }
        while(totalAmountReturn>= 10){
            System.out.println("Note: " + 10);
            totalAmountReturn = totalAmountReturn-10;
        }
        while(totalAmountReturn>= 50){
            System.out.println("Note: " + 50);
            totalAmountReturn = totalAmountReturn-50;
        }
        while(totalAmountReturn>= 100){
            System.out.println("Note: " + 100);
            totalAmountReturn = totalAmountReturn-100;
        }
        while(totalAmountReturn>= 2){
            System.out.println("Coin: " + 2);
            totalAmountReturn = totalAmountReturn-2;
        }
        while(totalAmountReturn>=1){
            System.out.println("Coin: " + 1);
            totalAmountReturn = totalAmountReturn-1;
        }
        while(totalAmountReturn>=5){
            System.out.println("Coin: " + 5);
            totalAmountReturn = totalAmountReturn-5;
        }

    }
}
