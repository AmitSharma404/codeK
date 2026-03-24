package Basics;

class Computer {
    String RAM;
    String Processor;
    Integer price;

    public void details(){
        System.out.println("The RAM is :" + this.RAM + " \n" + "the price is: Rs " + this.price);
    }

    
}

public class Calculator {

    public int add(int x, int y){
        System.out.println("in Add");
        return x+y;
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.Processor = "i3";
        computer.RAM = "16GB";
        computer.price = 32000;

        computer.details();
        
        Calculator calc = new Calculator();

        int result = calc.add(10,20);
        System.out.println(result);
    }
}
