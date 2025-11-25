package practice;

public class Factorial {
    public static int factorial(int x){
        if(x == 0 || x < 1){
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }


public static void main(String[] args){
    int fact = factorial(6);
    System.out.println("factorial " + fact);
}
}