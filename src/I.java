package src;

class I {
    I method1(){
        return this;
    }
    I method2(){
        return this;
    }

}

class Demo{
    public static void main(String[] args) {
        I a1 = new I();
        a1.method1().method2();
    }
}
