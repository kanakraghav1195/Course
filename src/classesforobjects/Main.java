package src.classesforobjects;

public class Main {
    public static void main(String[] args) {

        Human person = new Human();
        Bottle bottle = new Bottle();
        College college = new College();
        Desktop desktop = new Desktop();
        Fan fan = new Fan();
        Flower phool = new Flower();
        MobilePhone phone = new MobilePhone();
        Shoes s1 = new Shoes();


//        This is for human class.
        person.name = "Rahul";
        person.speak("Hi I am learning JAVA");


        System.out.println();
        System.out.println();

//         This is for Bottle class.
        bottle.material = "Plastic";
        bottle.capacityInLitres = 3.50;
        bottle.color = "Green";
        bottle.isReusable = true;
        bottle.hasCap = true;
        bottle.length = 2.60;

        bottle.displayInfo();

        System.out.println();
        System.out.println();

//        This is for college class.
        college.collegeName = "NIET";
        college.location = "Greater Noida";
        college.establishedYear = 1997;
        college.numberOfStudents = 5460;
        college.numberOfDepartments = 6;

        college.informationRegardingCollege();


        System.out.println();

//        This is for Desktop class.
        desktop.brandName = "Lenovo";
        desktop.storageType = "Hard Disk Drive";
        desktop.processor = "intel i7";
        desktop.ram = 8;
        desktop.storage = 512;
        desktop.operatingSystem = "Ubuntu";
        desktop.price = 524367;
        desktop.isWifiSupported = true;

        desktop.upgradeRam(16);


        System.out.println();

//        This is for Fan Class.
        fan.turnOn();
        fan.turnOff();

        System.out.println();


//        This is for flower class.
        phool.name = "Sunflower";
        phool.bloom();

        System.out.println();

//        This is for Mobile Phone class.
        phone.modelName = "Oppo Find X7";
        phone.color = "Black";
        phone.batteryCapacity = 5000;
        phone.storage = 256;
        phone.ram = 12;
        phone.price = 15000;
        phone.screenSize = 6.78;

        phone.mobilePhoneInformation();

        System.out.println();

//        This is for shoes class.

        s1.updateStock(8);

        System.out.println();

//


    }
}
