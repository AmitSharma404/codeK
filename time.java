public class time {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;
        
        
        startTime = System.currentTimeMillis();
        long i = 0;
        while(i < 1000000000) {i++;}
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("while loop time: " + elapsedTime + "\tms");
        {
        startTime = System.currentTimeMillis();
        for(i = 0;i < 1000000000;i++) {}
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("for loop time: " + elapsedTime + "\tms");
        }

    }
}
