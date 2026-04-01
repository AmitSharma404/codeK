package DSA;

public class Static {
    static String brand;
    int price;
    String RAM;

    
    public Static(){
        brand = "Samsung";
        price = 200000;
        System.out.println("In constructor");
    }

    public void details(){
        System.out.println(this.price + " " + this.brand);
    }   

    static {
        brand = "Apple";
        System.out.println("In static method");
    }


    public static void main(String[] args) {
        Static static1 = new Static();
        static1.details();
    }
}
