package src.classesforobjects;

import org.w3c.dom.ls.LSOutput;

public class Desktop {
    String brandName;
    String storageType;
    String processor;
    int ram;
    int storage;
    String operatingSystem;
    double price;
    boolean isWifiSupported;




    public void upgradeRam(int additionalRam){
        System.out.println("Desktop Brand: " + brandName);
        System.out.println("Type of Storage in Desktop: " + storageType);
        System.out.println("Processor in Desktop: " + processor);
        System.out.println("Original RAM: " + ram + "GB");
        System.out.println("Storage in Desktop: " + storage);
        System.out.println("O.S in Desktop: " + operatingSystem);
        System.out.println("Price of Desktop: " + price);
        System.out.println("WI-FI Supporting: " + isWifiSupported);

        if(additionalRam>0){
            ram = ram+additionalRam;
        }
        System.out.println("Updated Ram: " + ram + "GB");

    }

}
