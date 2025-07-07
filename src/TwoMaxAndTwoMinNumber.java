package src;

public class TwoMaxAndTwoMinNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 17, 45, 12};

        twoMaximumNumbers(arr);
        twoMinimumNumbers(arr);

    }

    public static void twoMaximumNumbers(int [] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Last 2 maximum numbers " + arr[0] + ", " + arr[1]);
    }

    public static void twoMinimumNumbers(int [] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Last 2 minimum numbers " + arr[0] +", " +  arr[1]);
    }

}
