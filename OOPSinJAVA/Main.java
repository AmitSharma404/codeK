package OOPSinJAVA;

public class Main {
    
}

public class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

}

public class OOPS {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue"; 
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";
        pen2.write(); 
    }
}
