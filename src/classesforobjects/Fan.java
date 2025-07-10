package src.classesforobjects;

public class Fan {
    String brandName;
    int numberOfBlades;
    String color;
    int speedLevel;
    boolean isCeilingFan;
    boolean isOn = false;

    public void turnOn(){
        isOn = true;
        System.out.println("Fan is On");
    }

    public void turnOff(){
        isOn = false;
        speedLevel = 0;
        System.out.println("Fan is Off");
    }
}
