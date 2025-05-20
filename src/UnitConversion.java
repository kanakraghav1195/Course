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


//Enter your number
//525600
//Days = 365
//Years = 1

//Enter your number
//1254875
//Days = 871
//Years = 2



//
//Enter your number
//125.4875
//Exception in thread "main" java.util.InputMismatchException
//at java.base/java.util.Scanner.throwFor(Scanner.java:943)
//at java.base/java.util.Scanner.next(Scanner.java:1598)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
//at src.UnitConversion.main(UnitConversion.java:9)