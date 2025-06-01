package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner a = new Scanner(System.in);
        int month = a.nextInt(); //31 days

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Days = " + 31);
        }

        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Days = " + 30);
    }
        else{
            System.out.println("Days = " + 28);
        }
    }
}
