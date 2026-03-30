package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int Num [] = new int[100000];
        for(int i = 0;i<Num.length;i++){
            Num[i] = i;
        }
        int target = 90021;
        int element = Binary(Num, target);
        System.out.println("Target Found at: "+ element);

    }

    private static int Binary(int arr[],int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            System.out.println(mid + "\t mid");
            int value = arr[mid];
            if(value < target){
                low = mid + 1;
            } else if(value > target){
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
