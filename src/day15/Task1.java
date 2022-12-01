package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        String currentFilename = "";
        String sourceFilename = "src/day15_shoes.csv";
        currentFilename = sourceFilename;
        File source = new File(sourceFilename);

        String outputFilename = "src/day15/resources/missing_shoes.txt";
        currentFilename = outputFilename;
        File output = new File(outputFilename);

        int currentLineIndex = 0;

        try {

            PrintWriter wiper = new PrintWriter(output);
            wiper.print("");
            wiper.close();

            PrintWriter writer = new PrintWriter(output);

                Scanner scanner = new Scanner(source);

                while(scanner.hasNextLine()) {

                    String line = scanner.nextLine();
                    String[] inputData = line.split(";");

                    if (inputData.length != 3) {
                        throw new InvalidFileStructureException();
                    }

                    int quantity = Integer.parseInt(inputData[2]);

                    if (quantity == 0) {
                        writer.printf(" %s, %s, %d\r\n", inputData[0], inputData[1], quantity);
                    }

                        currentLineIndex++;
                    }

                writer.close();
                scanner.close();

            } catch (FileNotFoundException e) {
                System.out.printf("File %s not found.", currentFilename);
            } catch (InvalidFileStructureException e) {
                System.out.printf("File %s doesn't meet the specified requirements.", currentFilename);
            }
            catch (NumberFormatException e){
                System.out.printf("Line %d contains a non-number quantity value", currentLineIndex);
            }
    }
}
