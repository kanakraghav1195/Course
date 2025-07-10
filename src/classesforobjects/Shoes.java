package src.classesforobjects;

public class Shoes {
    String brandName;
    String color;
    int size;
    String material;
    boolean isCasualShoes;
    int stock;

    public void updateStock(int quantity){
        stock = stock + quantity;
        System.out.println("Updated Stock Quantity: " + stock);
    }
}
