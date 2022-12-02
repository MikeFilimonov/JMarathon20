package day16.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static final String filenameOfInts = "src/day16/Task2/randomNums.txt";
    public static final String filenameOfDoubles = "src/day16/Task2/meanDoubles.txt";

    private static final int blockCount = 20;

    private static final int numberOfInputElements = 1000;
    public static void main(String[] args) {

        fileWithRandomNums();
        fileWithMeans();

    }

    private static void fileWithRandomNums(){

        Random generator = new Random();

        File fileContainingRandomNums = new File(filenameOfInts);
        if (fileContainingRandomNums.exists()){
            fileContainingRandomNums.delete();
        }
        try {

            fileContainingRandomNums.createNewFile();
            PrintWriter writer = new PrintWriter(fileContainingRandomNums);
            int counter = 0;
            while (counter < numberOfInputElements) {
                writer.println(generator.nextInt(0, 100));
                counter++;
            }
            writer.close();

        } catch (IOException e) {
            System.out.printf("File %s not found.", filenameOfInts);
        }

    }

    private static void fileWithMeans(){

        File input = new File(filenameOfInts);
        File output = new File(filenameOfDoubles);
        try {

            Scanner reader = new Scanner(input);

            if (output.exists()){
                output.delete();
            }
            output.createNewFile();

            PrintWriter writer = new PrintWriter(output);

            int subsum = 0;
            int counter = 0;
            double result = 0;

            while (reader.hasNextInt()){

                subsum+= reader.nextInt();

                if (counter % blockCount == 0){

                    double arithmeticMean = (double) subsum / blockCount;
                    writer.println(arithmeticMean);
                    result+=arithmeticMean;
                    subsum = 0;

                }

                counter++;
            }

            System.out.println((int) result);
            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", filenameOfInts);
        } catch (IOException e) {
            System.out.printf("Failed to create %s file", filenameOfDoubles);
        }

    }

}
