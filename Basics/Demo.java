package Basics;

class Pen {
    String name;
    int price;

    public void playMusic(){
        System.out.println("Music is Playing");
    }

    public String getPen(int cost){
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }   

}

public class Demo {
    public static void main(String[] args) {
        
        Pen pen = new Pen();
        String newPen = pen.getPen(20);
        System.out.println(newPen);
        pen.playMusic();

    }
}
