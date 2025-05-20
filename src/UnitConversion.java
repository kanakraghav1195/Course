package src;

import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner a = new Scanner (System.in);
        int minutes = a.nextInt();
        int days = (minutes/(24*60));
        int years = (minutes/(365*24*60));
        System.out.println("Days = " + days);
        System.out.println("Years = " + years);
    }
}
