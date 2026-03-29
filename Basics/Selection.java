package Basics;
import java.util.*;
class Selection{
    public static void main(String[] args) {
        

        int [] arr = {4,5,1,2,7,9,6,10,31,14,42,54,35,42,41,35,37};
        long startTime = System.currentTimeMillis();
        for(int i= 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int a = 0;a<arr.length;a++){
            System.out.print(arr[a] + " ");
        }

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("totalTime: " + elapsedTime + "\tms");
    }
}