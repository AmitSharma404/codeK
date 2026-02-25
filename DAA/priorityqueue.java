package DAA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        queue.offer(10.2);
        queue.offer(3.1);
        queue.offer(5.2);
        queue.offer(12.3);
        queue.offer(13.1);
        System.out.println(queue);
    }
}
