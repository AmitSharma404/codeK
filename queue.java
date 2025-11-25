import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        
        Queue<Double> queue = new LinkedList<Double>();

        queue.offer(1.3);
        queue.offer(4.2);
        queue.offer(6.4);
        queue.offer(4.3);
        // queue.poll();
        queue.offer(5.4);
        queue.poll();
        System.out.println(queue.size());
        
        System.out.println(queue);
    }
}
