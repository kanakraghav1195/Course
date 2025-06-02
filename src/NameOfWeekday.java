package src;

import java.util.Scanner;

public class NameOfWeekday {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        if(a==1){
            System.out.println(a + " - Sunday");
        }
        else if(a==2){
            System.out.println(a + " - Monday");
        }
        else if(a==3){
            System.out.println(a + " - Tuesday");
        }
        else if(a==4){
            System.out.println(a + " - Wednesday");
        }
        else if(a==5){
            System.out.println(a + " - Thursday");
        }
        else if(a==6){
            System.out.println(a + " - Friday");
        }
        else if(a==7){
            System.out.println(a + " - Saturday");
        }
        else{
            System.out.println("invalid input");
        }


    }
}
