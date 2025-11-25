package practice;

import java.util.Random;

public class roll {
    Random random;
    int number;
    roll() {
        random = new Random();
        rollDice(random,number);
    }

    void rollDice(Random random,int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

    public static void main(String[] args) {
        roll Roll = new roll();
    }
}
