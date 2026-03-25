package Basics;

class Pen {
    Trial name;
    int price;

    public void playMusic(){
        System.out.println("Music is Playing");
    }

    public Trial getPen(int cost){
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }   

}

public class Demo {
    public static void main(Trial[] args) {
        
        Pen pen = new Pen();
        Trial newPen = pen.getPen(20);
        System.out.println(newPen);
        pen.playMusic();

    }
}
