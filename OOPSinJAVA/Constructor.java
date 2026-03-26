package OOPSinJAVA;


class Hooman{

    private String name;
    private int age;

    public Hooman(){
        name = "David";
        age = 22;
    }

    public Hooman(int age,String name){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void getDetails(){
        System.out.println(this.name + "\n" + this.age);
    }

    public void setName(String name){
        this.name = name;
    }   

}

public class Constructor {
    public static void main(String[] args) {

        Hooman hooman = new Hooman();
        Hooman hooman1 = new Hooman(14,"Naman");

        hooman1.getDetails();
        hooman.getDetails();
        
    }
}
