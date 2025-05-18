class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner consoleRead = new Scanner (System.in);

        int x = consoleRead.nextInt();
        int g = consoleRead.nextInt();
        System.out.println("sum = " + (x+g));
        System.out.println("difference = " + (x-g));
        System.out.println("product = " + (x*g));
        System.out.println("average = " + (x+g)/2);
        System.out.println("distance = " + (x-g));
        if (x > g){
            System.out.println("max = " + (x));
            System.out.println("minimum = " + (g));
        }
        else {
            System.out.println("max = " + (g));
            System.out.println("minimum = " + (x));
        }
    }
}

// output: 
// Enter your number
// 10 6
// sum = 16
// difference = 4
// product = 60
// average = 8
// distance = 4
// max = 10
// minimum = 6

     
