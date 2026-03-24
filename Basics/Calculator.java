package Basics;

public class Calculator {

    public int add(int x, int y){
        System.out.println("in Add");
        return x+y;
    }

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        int result = calc.add(10,20);
        System.out.println(result);
    }
}
