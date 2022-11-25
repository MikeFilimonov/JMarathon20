package day2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Input the range, please:");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt() + 1;
        int max = sc.nextInt();

        int counter = min;
        while (counter < max){

            if (counter %5 == 0 && counter % 10 != 0){
                System.out.printf("%d ", counter);
            }

            counter++;

        }

    }

}
