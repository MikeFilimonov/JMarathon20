package day7;

import java.util.Random;

public class Player {

    public final static int MIN_STAMINA = 0;
    public final static int MAX_STAMINA = 100;

    public static int playerCount = 0;

    private int stamina;
    Random generator = new Random();

    public Player(){

        stamina = 90 + generator.nextInt(11);
        if (playerCount <= 5)
            playerCount++;

    }

    public void run(){

        while( stamina > MIN_STAMINA && stamina <= MAX_STAMINA){
            stamina --;
        }

        if (stamina == MIN_STAMINA)
            playerCount--;

    }

    public static void info(){

        if (playerCount < 6){
            System.out.printf("Команды неполные, ещё есть %d свободных мест.", (6 - playerCount));
        } else{
            System.out.println("Мест в командах больше нет.");
        }

    }
}
