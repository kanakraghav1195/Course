public class Test {
    public static void main(String[] args) {
        int i = 10;
        int j = 7;
        int z = i; //z=7, i=7, j=10
        i = j; //z=7, i=10, j=10
        j = z; //z=7, i=7, j=10
        System.out.println("i = " + i + "," + ' ' +"j = " + j);
        

    }
}

// output:
// i = 7, j = 10
