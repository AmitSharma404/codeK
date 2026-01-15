import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queew {
    public static void main(String[] args) {
        
        PriorityQueue<Character> queue = new PriorityQueue<Character>();

        queue.offer('A');
        queue.offer('B');
        queue.offer('E');
        queue.offer('D');
        queue.offer('C');
        System.out.println(queue);

    }
}