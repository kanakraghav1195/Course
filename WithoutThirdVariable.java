public class WithoutThirdVariable {
    public static void main(String[] args) {
        int i = 10;
        int j = 7;
        i=(i+j); //i=17, j=7
        j=(i-j); //j=10, i=17
        i=(i-j); //i=7, j=10
        System.out.println("i = " + i + "," + ' ' +"j = " + j);
        
    }
}

// output:
// i = 7, j = 10
