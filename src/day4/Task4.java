package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] data = new int[100];
        Random generator = new Random();

        for (int i = 0; i < data.length; i++){
            data[i] = generator.nextInt(10000);
        }

        int maxTriadValue = 0;
        int firstMemberOfTriadIndex = 0;

        for (int i = 0; i < data.length -2; i++){

            int preResult = data[i] + data[i + 1] + data[i + 2];
            if (preResult > maxTriadValue){
                maxTriadValue = preResult;
                firstMemberOfTriadIndex = i;
            }

        }

        System.out.println("Data: " + Arrays.toString(data));
        System.out.printf("Max triad value: %d, first index of a max triad: %d", maxTriadValue, firstMemberOfTriadIndex);

    }
}
