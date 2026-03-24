package Basics;


class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b ,int c){
        return a+b+c;
    }

    public double add(double a,int b){
        return a+b;
    }
}

public class Table {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = calculator.add(10, 10);
        double b = calculator.add(20, 30);
        int c = calculator.add(20, 30, 40);

        System.out.println(a +" "+ b + " " + c);
    }
}
