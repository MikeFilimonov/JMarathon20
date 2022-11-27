package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        int [] nums =  new int [100];

        Random generator = new Random();
        for(int i = 0; i < 100; i++){
            nums[i] = generator.nextInt(10000);
        }

        int min = nums[0];
        int max = nums[0];
        int numberOfDenaries = 0;
        int sumOfDenaries = 0;

        for ( int element: nums
             ) {
            if (element > max)
                max = element;
            if(element < min)
                min = element;

            if (element % 10 == 0) {
                sumOfDenaries += element;
                numberOfDenaries++;
            }
        }

        System.out.printf("Data: %s \r\n", Arrays.toString(nums));
        System.out.printf(" max value: %d\r\n min value: %d\r\n number of denaries: %d\r\n denaries sum: %d\r\n",
                max, min, numberOfDenaries, sumOfDenaries);

    }

}
