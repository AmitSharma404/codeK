package DSA;

import java.util.ArrayList;

public class Array{
    public static void main(String[] args) {
        
        ArrayList<String> Food = new ArrayList<String>();

        Food.add("Pizza");
        Food.add("burger");
        Food.add("Paneer Tikka");

       for (int i = 0; i < Food.size(); i++) {
        System.out.println(Food.get(i));
       }
    }
}