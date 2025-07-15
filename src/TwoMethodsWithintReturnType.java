package src;

import java.sql.SQLOutput;

public class TwoMethodsWithintReturnType {

    //    non-static
    public int add(int i, int j) {
        int k = i + j;
        return k;
    }

    //    static
    public static int add(int i, int j, int l) {
        int k = i + j + l;
        return k;
    }

    public static void main(String[] args) {
        TwoMethodsWithintReturnType tw= new TwoMethodsWithintReturnType();

        int sum1 = tw.add(78, 42);
        System.out.println("Non- static addition: " + sum1);

        int sum2 = TwoMethodsWithintReturnType.add(20,30,40);
        System.out.println("Static addition: " + sum2);
    }
}



