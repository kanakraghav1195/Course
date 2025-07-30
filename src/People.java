package src;

public class People {
    public static void main(String[] args) {

        People p1 = new People();
        p1.requiredInformationAboutPeople();

    }
    String peopleName;
    static int totalPeople;

    public void requiredInformationAboutPeople(){
        int peoplesAge;
        // above peoplesAge is local variable and no default value for this, if we want to run this then we have to initialized the value.

        System.out.println("People Name: " + peopleName);
        System.out.println("Total People: " + totalPeople);
    }
}

