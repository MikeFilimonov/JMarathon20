package day3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Please, input the dividend and the divisor");
        Scanner sc = new Scanner(System.in);
        double divisor = 0;

        do {

        double dividend = sc.nextInt();
        divisor = sc.nextInt();

        if (divisor == 0)
            break;

        System.out.println(dividend / divisor);

    } while (divisor != 0);


    }
    }
