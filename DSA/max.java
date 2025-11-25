package DSA;

public class max {
    public static void main(String[] args) {
        
        int [] arr = {10,6,9,4,5};
        int max = arr[0];

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max number is " + max);
    }
}
