package DAA;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        int target = 900101;
        for(int i = 0;i < arr.length;i++) {
            arr[i] = i; 
      }

        int element = Binarysearch(arr,target);

        System.out.println("Target found at: " + element);
    }


    private static int Binarysearch(int[] arr,int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr[mid];
            System.out.println("mid \t" + mid);
            if(value < target) {
                low = mid + 1;
            } else if(value > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}


