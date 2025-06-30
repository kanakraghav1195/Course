package src;

import java.util.Scanner;

class Maths {
    public static void main(String[] args) {
        Scanner consoleRead = new Scanner(System.in);
        System.out.println("Enter your number");

        int h= consoleRead.nextInt();
        System.out.println("Square = " + h*h);
        System.out.println("Cube = " + h*h*h);
        System.out.println("Fourth power = " + h*h*h*h);
    }
}

// output for 2:
// Enter your number
// 2
// Square = 4
// Cube = 8
// Fourth power = 16

// output for 10:
// Enter your number
// 10
// Square = 100
// Cube = 1000
// Fourth power = 10000

// output for 89:
// Enter your number
// 89
// Square = 7921
// Cube = 704969
// Fourth power = 62742241

// output for 134:
// Enter your number
// 134
// Square = 17956
// Cube = 2406104
// Fourth power = 322417936

class Square {
    public static void main(String[] args) {
        Scanner consoleRead = new Scanner(System.in);
        System.out.println("Enter your number");

        float h= consoleRead.nextFloat();
        System.out.println("Square = " + h*h);
        System.out.println("Cube = " + h*h*h);
        System.out.println("Fourth power = " + h*h*h*h);
    }
}





// output for 34.5:
// Enter your number
// 34.5
// Square = 1190.25
// Cube = 41063.625
// Fourth power = 1416695.0



// output for -45:
// Enter your number
// -45
// Square = 2025
// Cube = -91125
// Fourth power = 4100625
