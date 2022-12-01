package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        checkTheFileUp("src/sample.txt");

        checkTheFileUp("src/faulty.txt");
        checkTheFileUp("smaple.txt");

    }


    public static void checkTheFileUp(String filename){

        File textFile = new File(filename);

        int numberCount = 0;
        int sum = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(textFile);

            while(scanner.hasNextInt()){

                sum+= scanner.nextInt();
                numberCount++;
            }

            scanner.close();

            if (numberCount != 10){
                throw new IllegalArgumentException();
            }
            else{
                System.out.println("The total is: " + sum);
            }


        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found.", filename);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Missing input data(number of elements %d, expected count - 10).\r\n",
                    numberCount);
        }
    }
}
