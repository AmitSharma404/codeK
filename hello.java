
import java.util.*;

class hello{
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = myObj.nextInt();

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n-i+1;j++) {
                System.out.print("*   \n");
            }
            System.out.print("\n");
        }


    } 
}