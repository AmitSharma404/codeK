import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0;i< 1000;i++){
            linkedList.add(i);
            arrayList.add(i);
            
        }

        long startTime;
        long endTime;
        long elapsedTime;
        // do something 
        {
            startTime = System.nanoTime();
            linkedList.get(0);
            endTime = System.nanoTime();

        elapsedTime = endTime-startTime;

        System.out.println("linkedList:\t "+ elapsedTime + "\t" + "nanosecond");
        }
     {
         startTime = System.nanoTime();
         arrayList.get(0);
         endTime = System.nanoTime();

        elapsedTime = endTime-startTime;

        System.out.println("arraylist: \t "+ elapsedTime+ "\t" + "nansecond");
     }
}

}
