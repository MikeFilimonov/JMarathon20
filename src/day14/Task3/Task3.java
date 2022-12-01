package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String filename = "people.txt";
        List<Person> result = parseFileToObjList(filename);
        System.out.println(result);
    }

    public static List<Person> parseFileToObjList(String filename){

        List<Person> result = new ArrayList<>();

        File input = new File(filename);
        try {
            Scanner inputReader = new Scanner(input);
             while (inputReader.hasNextLine()){

                String line = inputReader.nextLine();
                String[] inputData = line.split(" ");
                if (inputData.length == 2) {

                    int age = Integer.parseInt(inputData[1]);
                    if (age < -1) {
                        System.out.printf("Odd age set for %s", inputData[0]);
                        throw new NumberFormatException();
                    }

                    result.add(new Person(inputData[0], age));

                }

            }

        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", filename);
        }
        catch (NumberFormatException e){
            System.out.println("Faulty input data");
        }



        return result;
    }

}