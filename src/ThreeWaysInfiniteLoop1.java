package src;

import java.util.Scanner;

public class ThreeWaysInfiniteLoop1 {
    public static void main(String[] args) {
        for(int i = 0; ; i--){
            System.out.println(i);
        }
    }
}

class ThreeWaysInfiniteLoop2 {
    public static void main(String[] args) {
        for(; true; ){
            System.out.println("This will run forever");
        }
    }
}

class ThreeWaysInfiniteLoop3 {
    public static void main(String[] args) {
        while(true){
            System.out.println("My name is Kanak");
        }
    }
}