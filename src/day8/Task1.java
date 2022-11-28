package day8;

import org.w3c.dom.ls.LSOutput;

public class Task1 {

    public static void main(String[] args) {

        String result = "";
        long startDefaultConcatenation = System.nanoTime();

        for(int i = 0; i <= 20000; i++){
            result+= String.format("%d ", i);
        }
        result.trim();
        System.out.println(result);
        long defaultConcatenation = System.nanoTime() - startDefaultConcatenation;

        long startConcatenationWithSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 20000; i++){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());

        long concatenationWithSB =  System.nanoTime() - startConcatenationWithSB;

        if (defaultConcatenation > concatenationWithSB)
            System.out.printf("SB is %fs faster", (defaultConcatenation - concatenationWithSB)/1E9);
        else if (concatenationWithSB > defaultConcatenation)
            System.out.printf("Default concatenation is  %fs faster", concatenationWithSB - defaultConcatenation/1E9);
        else{
            System.out.println("Default concatenation took same time as SB in action");
        }


    }

}
