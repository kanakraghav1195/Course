package src;

public class VoidMethodATM {

//    static void method
    public static void bankName(){
        System.out.println("Welcome to ICICI Bank ATM");
    }

//    Non-static void method
    public void withDrawCash(){
        System.out.println("Please collect your cash");
    }

    public static void main(String[] args) {
//        call static method
        VoidMethodATM.bankName();

//        call non-static method
        VoidMethodATM user = new VoidMethodATM();
        user.withDrawCash();


    }

}


