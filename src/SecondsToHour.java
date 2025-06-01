package src;

import java.util.Scanner;

public class SecondsToHour {
    public static void main(String[] args) {
        System.out.println("Enter Seconds");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int hours = b/(60*60);
        int minutes = (b%3600)/60;
        int seconds = (b%3600)%60;
        System.out.print(hours + "hours ");
        System.out.print( minutes + "minutes ");
        System.out.print( seconds + "seconds");

    }
}

