package DAA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        
        PriorityQueue<Double> queue = new LinkedList<Double>();
        queue.offer(10);
        queue.offer(3);
        queue.offer(5);
        System.out.println(queue);
    }
}
