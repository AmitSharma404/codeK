package practice;

public class trycatchtest{
    public static void main(String[] args) {
        try{
            int data = 10/0;
            // may throw an exception
        } catch (Exception e) 
        {
            System.out.println(e);
        } 
        System.out.println("Can't divided by 10 / 0");
    }
}
