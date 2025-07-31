package src;

import java.sql.SQLOutput;

public class SandwichString {
    public static void main(String[] args) {
        SandwichString s = new SandwichString();

        System.out.println(s.inBetween("[[]]", "Hibye"));
        System.out.println(s.inBetween("abyz", "YAY"));
        System.out.println(s.inBetween("<<>>", "wow"));


    }
    public String inBetween(String bracket, String word){
        String o = bracket.substring(0, 2);
        String c = bracket.substring(2, 4);
        return o+word+c;
    }
}
