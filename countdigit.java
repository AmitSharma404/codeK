import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            count = 1;
        } else {
            n = Math.abs(n);
            while (n > 0) {
                n /= 10;
                count++;
            }
            System.out.println(count);
            return;
        }
    }
}
