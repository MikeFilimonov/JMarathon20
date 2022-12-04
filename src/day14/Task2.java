package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    private static final int fieldCount = 2;
    private static final int ageLowerBound  = 0;
    public static void main(String[] args) {

        String filename = "src/people.txt";
        parseFileToStringList(filename);
    }

    public static void parseFileToStringList(String filename){

        File file = new File(filename);
        List<String> output = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){

                String line = scanner.nextLine();
                String[] nameAndAge = line.split(" ");
                int age = 0;
                if (nameAndAge.length == fieldCount){

                    age = Integer.parseInt(nameAndAge[1]);
                    if(age < ageLowerBound){
                        System.out.printf("Faulty age provided for %s\r\n",
                                nameAndAge[0]);
                        throw new NumberFormatException();
                    }

                    output.add(line);
                }

            }

            scanner.close();
            System.out.println(output);

        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found.", filename);
        }
        catch (NumberFormatException e){
            System.out.println("Failed to get age from the input data");
        }

    }

}
