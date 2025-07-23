package src;

public class NonParametrizedMethod {

//static method
    public static void printStars(){
        for(int i =0; i<5; i++){
            System.out.println("*");
        }
    }

//non-static method
    public void displayMenu(){
        System.out.println("We have below dinner menu for you");
        System.out.println("1. Fried Rice");
        System.out.println("2. Noodles");
        System.out.println("3. Maggie");
        System.out.println("4. Chicken puffs");
        System.out.println("5. Chilli chicken");
    }

//    now, main method

    public static void main(String[] args){
        printStars();

        NonParametrizedMethod nonStatic = new NonParametrizedMethod();
        nonStatic.displayMenu();
    }


}
