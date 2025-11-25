package OOPSinJAVA;

public class time {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;
        int j = 0;
        startTime = System.nanoTime();
        for(int i = 0;i<10;i++){}
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("for  0 to 100: \t "+ elapsedTime + " Nanosecond");
        startTime = System.nanoTime();
     
        while(j < 10){j++;}
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("while loop time for counting 0 to 100: \t "+ elapsedTime + " Nanosecond");
        
    }
}
    

