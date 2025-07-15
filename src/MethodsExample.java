package src;

public class MethodsExample {
    public static void main(String[] args) {

        int result = Calculator.add(19, 78);
        System.out.println("Sum: " + result);


        Student s1 = new Student("Kanak");
        s1.wishes();
    }
}

class Calculator{
    public static int add (int a, int b){
        return a+b;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void wishes() {
        System.out.println("Hello, " + name + " ! ");
    }
}