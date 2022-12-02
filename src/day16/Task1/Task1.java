package day16.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String fileName = "src/day16/Task1/sample.txt";
        File inputData = new File(fileName);
        arithmeticMean(inputData);

    }

    public static void arithmeticMean(File input){

        try {
            Scanner reader = new Scanner(input);

            int sum = 0;
            int numCount = 0;
            double result = 0;

            while (reader.hasNextInt()){

                sum += reader.nextInt();
                numCount++;

            }

            if (numCount > 0)
                result = (double) sum / numCount;

            StringBuilder stringBuilder = new StringBuilder();
            String output = stringBuilder.append("Raw result:")
                    .append(result)
                    .append(" ----> Trimmed result:")
                    .append(String.format("%.3f", result))
                    .toString();
            System.out.println(output);
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found.", input.getName());
        }

    }

}
