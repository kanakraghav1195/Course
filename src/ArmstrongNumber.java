package src;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int number = i;
        int sum = 0;
        while(i>0){
            int lastdigit = i%10;
            i = i/10;
            sum = sum+lastdigit*lastdigit*lastdigit;

        }
        if(sum == number){
            System.out.println(number + " Number is a armstrong number");
        }else{
            System.out.println(number + " Number is not a armstrong number");
        }

    }
}
