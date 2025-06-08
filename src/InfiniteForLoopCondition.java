package src;

public class InfiniteForLoopCondition {
    public static void main(String[] args) {
        for( ; ; )
            System.out.println("My system is not working");
    }
}


class SecondWay {
    public static void main(String[] args) {
        for (int i = 100; ; i++){
            System.out.println("value of i " + i);
        }
    }
}



