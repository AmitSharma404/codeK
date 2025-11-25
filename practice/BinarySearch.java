package practice;

import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args) {
        
        int[] array = new int[10000000];
        int target = 55555;

    for(int i = 0;i < array.length;i++){
        array[i] = i;
    }

    int value = binarySearch(array,target);

    if(value == -1) {
        System.out.println(target + " Not found");
    } else {
        System.out.println("Target Found at " + value);
    }
    }

    private static int binarySearch(int[] array,int target){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = array[mid]; 
            System.out.println("Middle " + mid);

            if(value < target) {
                low = mid + 1;
            } else if(value > target){
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return 0;
    }
    
    
}
