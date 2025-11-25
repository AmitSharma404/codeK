package advancejava;

public class BinarySearch {

    private static int BinarySearch(int[] arr,int x) {
        int low = 0;
        int high = arr.length-1;

        int mid = (high - low) / 2;
        
        if(arr[mid] < x){
            low = mid + 1;
        } else if(arr[mid] > x) {
            high = mid - 1;
        } else {
        return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000]; 

        int x = 10201;
        for(int i = 0;i<arr.length;i++) {
            arr[i] = i;
        }

        int element = BinarySearch(arr, x);
        System.out.println("target value fount at ",element);
    }
}


