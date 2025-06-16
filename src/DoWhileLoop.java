package src;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        do {
            System.out.println("Enter your age");
            age = scan.nextInt();
            if (age > 18) {
                System.out.println("You are " + age + " years old, which is above 18");
            } else {
                System.out.println("You are " + age + "years old, which is not above 18");
            }
            }
        while(age<=18);
        scan.close();

        }

    }




class DoWhileLoop2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("choose options 1-5");
            option = scan.nextInt();
            if(option<=5){
                System.out.println("You choose correct option");
            }else{
                System.out.println("Kindly choose correct option");
            }


        }while(option>=5);
        scan.close();
        }
    }



 class DoWhileLoop3{
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int iceCreamTemperature;

         do{
             System.out.println("Enter the temperature");
             iceCreamTemperature = scan.nextInt();
             if(iceCreamTemperature>=20){
                 System.out.println("I can eat this iceCream");
             }else{
                 System.out.println("I cannot eat this as this is in melting condition");
             }
         }while(iceCreamTemperature<=20);


     }
 }

