package DAA;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[100000000];
        int target = 32869134;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        long starttime = System.currentTimeMillis();

        int element = Binarysearch(arr, target);
        long endtime = System.currentTimeMillis();
        long elapsedTime = endtime - starttime;
        System.out.println("total time in ms: "+ elapsedTime + " ms");
        System.out.println("Target found at: " + element);
    }

    private static int Binarysearch(int[] arr, int target) {
        long elapsedTime;
        long starttime;
        long endtime;
        int low = 0;
        int high = arr.length - 1;
        
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr[mid];
            System.out.println("mid \t" + mid);
            if (value < target) {
                low = mid + 1;
            } else if (value > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
    
        return 0;

    }

}
