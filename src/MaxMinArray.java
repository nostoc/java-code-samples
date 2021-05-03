

public class MaxMinArray {

    static int arr[] = {1,2,3,56,4,5,6,-99,};

    public static void main(String[] args) {
        System.out.println(largest());
        System.out.println(smallest());
    }

    public static int largest(){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallest(){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}