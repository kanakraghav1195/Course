package src;

import java.util.Scanner;

public class InchesToMeter {
    public static void main(String[] args) {
        System.out.println("Enter Inches");
        Scanner a = new Scanner(System.in);
        float inches = a.nextFloat();
        float metres = (float) ((inches)*0.0254);
        System.out.printf("%.2f", metres);

    }
}
