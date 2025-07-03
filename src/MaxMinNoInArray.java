package src;

public class MaxMinNoInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 17, 45, 12};

        int max = maximumNumber(arr);
        System.out.println("Maximum Number " + max);
        int min = minimumNumber(arr);
        System.out.println("Minimum Number " + min);


    }


    public static int maximumNumber(int [] arr){
        int maximumNumber = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maximumNumber){
                maximumNumber = arr[i];
            }
        }
        return maximumNumber;
    }


    public static int minimumNumber(int [] arr){
        int minimumNumber = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < minimumNumber){
                minimumNumber = arr[i];
            }
        }
        return minimumNumber;
    }

}
