package src;

import java.util.Scanner;

public class ATMjourney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Balance = 4683903;
        int WithdrawMoney;
        int DepositMoney;
        String Statement = " ";
        int PIN = 1234;


        while (true) {
            System.out.println("1- CheckBalance");
            System.out.println("2- WithdrawMoney");
            System.out.println("3- DepositMoney");
            System.out.println("4- CheckStatement");
            System.out.println("5- ChangeATMPin");
            System.out.println("6- Exit");


            System.out.println("Enter your choice");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Your current Balance " + Balance);
            } else if (choice == 2) {
                System.out.println("Enter amount to be Withdraw " + Balance);
                int AmountWithdrawl = scan.nextInt();
                if (Balance >= AmountWithdrawl) {
                    Balance = Balance - AmountWithdrawl;
                    System.out.println("Your Transaction is successful & updated balance = " + Balance);
                } else {
                    System.out.println("Insufficient Balance ");
                }
            }

            else if(choice == 3) {
                System.out.println("Amount to be Deposit ");
                DepositMoney = scan.nextInt();
                Balance = Balance + DepositMoney;
                System.out.println("Your updated balance is " + Balance);
            }

            else if(choice == 4) {
                System.out.println("Your Transaction Statement");
                if (Statement.isEmpty()) {
                    System.out.println("No Transaction yet");
                } else {
                    System.out.println(Statement);
                }
            }

            else if (choice == 5) {
                System.out.println("Enter current PIN");
                int currentPin = scan.nextInt();
                if (currentPin == PIN) {
                    System.out.println("Enter new PIN");
                    int newPin = scan.nextInt();
                    System.out.println("Confirm new PIN");
                    int confirmPIN = scan.nextInt();
                    if (newPin == confirmPIN) {
                        System.out.println("PIN changed successfully");
                    } else {
                        System.out.println("Incorrect current PIN");
                    }
                }
            }
                else if( choice == 6){
                System.out.println("Thank-you for using SBI Bank ATM. Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid choice. Please try again later");
            }
        }
    }

}