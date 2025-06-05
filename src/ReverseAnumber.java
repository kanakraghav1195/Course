package src;

import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverse = 0;
        while(number>0){
            int lastdigit = number%10;
            reverse = reverse*10+lastdigit;
            number = number/10;

        }
        System.out.println("Reverse output " + reverse);

    }
}
