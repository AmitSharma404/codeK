


class Shape{
    int a = 10, b = 20;
}

class Square extends Shape{
    public void AreaSqu(){
        System.out.println("Area of Square: "+(a*a));
    }
}
class Rectangle extends Shape{
    public void Area(){
        System.out.println("Rectangle of Area: " + (a*b));
    }
}


public class single {
    public static void main(String[] args) {
        Rectangle Obj = new Rectangle();
        Square Sq = new Square();
        Sq.AreaSqu();
        Obj.Area();
    }
}
