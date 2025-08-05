package src;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = scan.nextInt();
//        now, have to convert no to string

        String number = String.valueOf(no);
        String rev = "";
//        now, reverse that string
        for(int i = number.length()-1; i>=0; i--){
            rev = rev+number.charAt(i);
        }
//        comparison here need to do
        if(number.equals(rev)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
