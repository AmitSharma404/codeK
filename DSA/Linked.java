package DSA;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {
        
        LinkedList<Character> linklist = new LinkedList<Character>();

        linklist.offer('A');
        linklist.offer('B');
        linklist.offer('C');
        linklist.offer('D');
        linklist.offer('E');

        linklist.poll();
        
        for (Character ch : linklist) {
            System.out.print(ch + " ");
        }
}
}