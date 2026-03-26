package OOPSinJAVA;

class Human{
    private String name;
    private int age;
    private double balance;

    public void setName(String name){
        this.name = name;
    }

    public void getdetails(){
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
    public void setAge(int a){
        this.age = a;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            this.balance -= amount;
        }
    }
}

public class Student {
    public static void main(String[] args){
        Human human = new Human();
        human.setAge(20);
        human.setName("Amit Sharma");
        human.getdetails();
        human.BankAccount(20000);
        human.withdraw(10000);
        System.out.println(human.getBalance());
        human.deposit(3000);
        System.out.println(human.getBalance());
    }
}
