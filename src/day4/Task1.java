package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Input the length of the array, that would contain random ints");
        Scanner sc  = new Scanner(System.in);

        int[] data = new int[sc.nextInt()];
        Random generator = new Random();

        int aboveEight = 0;
        int equalOne = 0;
        int evens = 0;
        int sum = 0;

        for (int i = 0; i < data.length; i++){

            data[i] = generator.nextInt(10);

            if (data[i] == 1)
                equalOne++;

            if (data[i] > 8)
                aboveEight++;

            if(data[i] % 2 == 0)
                evens++;

            sum += data[i];

        }


        System.out.println("Data: " + Arrays.toString(data) + "\r\nMetrics:\r\n length: " + data.length + ",\r\n above eight: " + aboveEight
            + ",\r\n equal one: " + equalOne + ",\r\n evens: " + evens + ",\r\n odds: " + (data.length - evens)
            + "\r\n sum: " +  sum);

    }

}
