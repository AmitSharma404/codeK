package OOPSinJAVA;


// // class Hooman{

//     private String name;
//     private int age;

//     public Hooman(){
//         name = "David";
//         age = 22;
//     }

//     public Hooman(int age,String name){
//         this.name = name;
//         this.age = age;
//     }

//     public void setAge(int age){
//         this.age = age;
//     }

//     public void getDetails(){
//         System.out.println(this.name + "\n" + this.age);
//     }

//     public void setName(String name){
//         this.name = name;
//     }   

// }

class Mobile{
    static String brandName;
    int price;
    String network;

    public Mobile(){
        brandName = "Lava Agni 5";
        price = 16000;
        network = "5g";
    }

    public Mobile(String brandName,int price,String network){
        this.brandName = brandName;
        this.price = price;
        this.network = network;
    }

    public static void show(Mobile mobile){
        System.out.println(mobile.brandName);
    }

    public void getDetails(){
        System.out.println(brandName + " " + this.price + " " + this.network);
    }
}
public class Constructor {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        Mobile mobile2 = new Mobile("Xiaomi 15",99000,"5g");
        mobile2.show(mobile);
        // Mobile.show();
        Mobile.brandName = "Moto g88 power";
        // mobile.getDetails();
        
    }
}
