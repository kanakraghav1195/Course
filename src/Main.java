package src;

public class Main {
    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        return 20;

    }
}

class Test{
    private static int x;

    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        return x;
    }
}

class Test1{
    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        static int y=0;
        return y;
    }
}
