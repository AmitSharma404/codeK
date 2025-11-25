class Pen{
    String color;
    int price;
    String type;
    Boolean canWrite;

    public void PenIsWriting(Pen p1) {
        System.out.println(p1.color+ " Pen is writing is a "+ p1.type +" pen");
    }


    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.color = "blue";
        p1.price = 5;
        p1.canWrite = true;
        p1.type = "Ball";
        p2.PenIsWriting(p1);

        // System.out.println(p1.color+" Pen is writing");
    }
}