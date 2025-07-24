package src;

public class Variables {

    int instanceVariable = 6;

    static int staticVariable = 8;

    void info(){
        int localVariable = 24;

        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {

        System.out.println("Static Variable: " + Variables.staticVariable);
        Variables V = new Variables();
        System.out.println("Instance Variable: " + V.instanceVariable);
        V.info();


    }
}
