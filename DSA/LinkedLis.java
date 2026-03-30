package DSA;

import java.util.LinkedList;

public class LinkedLis {
    

    public static void main(String[] args) {
        LinkedList<String> Song =  new LinkedList<String>();

        Song.offer("Naman");
        for(String ch:Song){
            System.out.println("Char: "+ ch);
        }
    }   

}
