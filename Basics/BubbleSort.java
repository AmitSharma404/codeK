import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

   public static void bubble(int [] arr){
    for(int i = 0;i<arr.length-1;i++){
        for(int j = i+1;j<arr.length;j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("Sorted array " + Arrays.toString(arr));
   }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int [] n = new int[size];

        for(int i = 0;i < size;i++){
           n[i] = sc.nextInt();
        }
        sc.close();
   }
}
