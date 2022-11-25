package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (counter < 5){

            System.out.println("Please, input the dividend and the divisor");
            double dividend = sc.nextDouble();
            double divisor = sc.nextDouble();

              int key = (int) divisor;

            switch (key){
                case 0:
                    System.out.println("Деление на 0");
                    break;
                default:
                    System.out.println(dividend / divisor);
            }

            counter++;
        }

    }

}
