package src;

import java.util.Scanner;

public class InfiniteWhileLoop {
    public static void main(String[] args) {
        int i =1;
        while (true){
            System.out.println(i);
            i++;
        }
    }
}


class InfiniteWhileLoop2 {
    public static void main(String[] args) {
//   this is for to check even numbers

        int i = 2;
        while(true){
            System.out.println(i);
            i+=2;
        }

    }
}

class addingNumbers{
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Sum = " + (a+b));

        }
    }
}