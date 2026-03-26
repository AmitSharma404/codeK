package OOPSinJAVA;

class Human{
    private String name = "Amit";
    private int age = 20;
    private double balance;

    public void details(){
        System.out.println(this.name + " \n age:  " + this.age);
    }

    public void BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            this.balance -= amount;
        }
    }
}

public class Student {
    public static void main(String[] args){
        Human human = new Human();
        human.details();
        human.BankAccount(2000000);
        double balance = human.getBalance();
        System.out.println(balance);
    }
}
