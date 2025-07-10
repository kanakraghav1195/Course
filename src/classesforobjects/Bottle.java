package src.classesforobjects;

public class Bottle {
    String material;
    double capacityInLitres;
    String color;
    boolean isReusable;
    boolean hasCap;
    double length;

    public void displayInfo(){
        System.out.println("Material: " + material);
        System.out.println("Capacity in Litres: " + capacityInLitres);
        System.out.println("Bottle Color: " + color);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Bottle has Cap: " + hasCap);
        System.out.println("Bottle length: " + length);
    }
}

