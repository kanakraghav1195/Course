package src;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        System.out.println("Enter three number");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        if(b>c && b>d){
            System.out.println(b);
        }

        else if(c>b && c>d){
            System.out.println(c);
        }
        else{
            System.out.println(d);
        }

    }
}
