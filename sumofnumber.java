import java.util.Scanner;

public class  sumofnumber {
    public static void main(String[] args) {
        int sum = 0;
        int m;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0) {
            m = n % 10;
            sum += m;
            n /= 10;
        }
        System.out.println("Sum of given number: is: "+ sum);
        return;

    }
    
}
