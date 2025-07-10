package src.classesforobjects;

import java.sql.SQLOutput;

public class MobilePhone {
    String modelName;
    String color;
    int batteryCapacity;
    int storage;
    int ram;
    double price;
    double screenSize;

    public void mobilePhoneInformation(){
        System.out.println("Mobile model: " + modelName);
        System.out.println("Available color: " + color);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Storage of Phone: " + storage + "GB");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Price: Rs. " + price);
        System.out.println("Size of Screen: " + screenSize);
    }

}
