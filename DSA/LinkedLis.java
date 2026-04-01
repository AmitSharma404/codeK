package DSA;

import java.util.LinkedList;

public class LinkedLis {
    

    public static void main(String[] args) {
        LinkedList<String> Song =  new LinkedList<String>();

        Song.offer("Naman");
        Song.offer("Teri Chunariya");
        Song.offer("Chahun mai aana");
        for(String ch:Song){
            System.out.println("Char: "+ ch);
        }
    }   

}
