package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Введите граничные значения диапазоне в формате a b (через пробел)");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] input = s.split(" ");
        if (input.length == 2) {
            int[] range = new int[2];
            for (int i = 0; i < input.length; i++){
                range[i] = Integer.parseInt(input[i]);
            }
            filteredNums(range);

        } else {
            System.out.println("Wrong input");
        }

    }

    public static void filteredNums(int[] unfilteredNums){

        int minValue = unfilteredNums[0] + 1;
        int maxValue = unfilteredNums[1];

        List<Integer> result = new ArrayList<>();

        for(int i = minValue; i < maxValue; i++){

            if(i % 5 == 0  && i %10 != 0){
                result.add(i);
            }

        }

        for (Integer el: result
             ) {
            System.out.printf("%s ", el.toString());
        }

    }
}
