package day2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Input your number:");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        double result;

        if (value >= 5){
            result = ( Math.pow(value, 2) -10 )/(value + 7);
        } else if (value > -3 && value < 5){
            result = (value - 3) * (Math.pow(value, 2) -2);
        } else{
            result = 420;
        }

        System.out.println(result);

    }
}
