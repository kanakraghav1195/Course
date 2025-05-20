package src;

import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner consoleRead = new Scanner (System.in);

        int x = consoleRead.nextInt();
        int g = consoleRead.nextInt();
        System.out.println("sum = " + (x+g));
        System.out.println("difference = " + (x-g));
        System.out.println("product = " + (x*g));
        System.out.println("average = " + (x+g)/2);
        System.out.println("distance = " + (x-g));
        if (x > g){
            System.out.println("max = " + (x));
            System.out.println("minimum = " + (g));
        }
        else {
            System.out.println("max = " + (g));
            System.out.println("minimum = " + (x));
        }
    }
}

// output: 
// Enter your number
// 10 6
// sum = 16
// difference = 4
// product = 60
// average = 8
// distance = 4
// max = 10
// minimum = 6

     
// Enter your number
// -9 10
// sum = 1
// difference = -19
// product = -90
// average = 0
// distance = -19
// max = 10
// minimum = -9

// Enter your number
// 4 10
// sum = 14
// difference = -6
// product = 40
// average = 7
// distance = -6
// max = 10
// minimum = 4

class H {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner consoleRead = new Scanner (System.in);

        float x = consoleRead.nextFloat();
        float g = consoleRead.nextFloat();
        System.out.println("sum = " + (x+g));
        System.out.println("difference = " + (x-g));
        System.out.println("product = " + (x*g));
        System.out.println("average = " + (x+g)/2);
        System.out.println("distance = " + (x-g));
        if (x > g){
            System.out.println("max = " + (x));
            System.out.println("minimum = " + (g));
        }
        else {
            System.out.println("max = " + (g));
            System.out.println("minimum = " + (x));
        }
    }
}

// output:
// Enter your number
// 9.8 5.6
// sum = 15.4
// difference = 4.2000003
// product = 54.88
// average = 7.7
// distance = 4.2000003
// max = 9.8
// minimum = 5.6



class Fraction {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner consoleRead = new Scanner(System.in);

        int x = consoleRead.nextInt();
        int g = consoleRead.nextInt();
        int o = consoleRead.nextInt();
        int r = consoleRead.nextInt();
        float m = (float) x / g;
        float s = (float) o / r;

        System.out.println("sum = " + (m + s));
        System.out.println("difference = " + (m - s));
        System.out.println("product = " + (m * s));
        System.out.println("average = " + (m + s) / 2);
        System.out.println("distance = " + (m - s));
        if (m > s) {
            System.out.println("max = " + (m));
            System.out.println("minimum = " + (s));
        } else {
            System.out.println("max = " + (s));
            System.out.println("minimum = " + (m));
        }
    }
}

//Enter your number
//3 4 6 9
//sum = 1.4166667
//difference = 0.08333331
//product = 0.5
//average = 0.7083334
//distance = 0.08333331
//max = 0.75
//minimum = 0.6666667
