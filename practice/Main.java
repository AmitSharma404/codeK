package practice;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car car2 = new Car("XUV700");
        Garage garage = new Garage();

        garage.park(car);
        garage.park(car2);

        
    }
}
