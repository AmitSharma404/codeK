package practice;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queve {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        queue.offer('A');
        queue.offer('B');        
        queue.offer('D');
        queue.offer('E');
        queue.offer('C');

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
