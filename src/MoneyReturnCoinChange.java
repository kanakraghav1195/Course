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

        int[] rupee = {100, 50, 20, 10, 5, 2, 1};

        for(int i =0; i<rupee.length; i++){
        while(totalAmountReturn>=rupee[i]){
            if(rupee[i]>=10){
                System.out.println("Note: " + rupee[i]);
            }else{
                System.out.println("Coins: " + rupee[i]);
            }
            totalAmountReturn= totalAmountReturn - rupee[i];
        }
        }
    }

}
