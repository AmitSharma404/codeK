package practice;

public class Shell {
    
    public static void shellsort(int arr[], int n) {
        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (arr[i + gap] > arr[j]) {
                        break;
                    } else {
                        // Swap arr[i + gap] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[i + gap];
                        arr[i + gap] = temp;
                        j = i + gap; // Update j to the new position
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 12, 14, 19};
        int n = arr.length; // Use length without parentheses
        shellsort(arr, n); // Corrected method name
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}