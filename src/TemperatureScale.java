package src;

import java.util.Scanner;

public class TemperatureScale {
    public static void main(String[] args) {
        System.out.println("Enter temperature in celsius");
        Scanner a = new Scanner(System.in);
        float cel = a.nextFloat();
        float fahrenheit = (float) (cel*(1.8) + 32.0);
        float kelvin = (cel+273);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("kelvin = " + kelvin);
    }
}
