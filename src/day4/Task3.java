package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

      int height = 12;
      int width = 8;

      int[][] matrice = new int[height][width];
      Random generator = new Random();

      int lineOfGreatestValue = 0;

      for (int i = 0; i < height; i++){

          for(int j = 0; j < width; j++){
              matrice[i][j] = generator.nextInt(50);
          }
      }


      int greatestValueLineIndex = 0;
        int greatestWeight = 0;

        for (int i = 0; i < height; i++){

            int lineWeight = 0;

            for (int j = 0; j < width; j++){
                lineWeight+=matrice[i][j];
            }

            if (lineWeight >= greatestWeight){
                greatestWeight = lineWeight;
                greatestValueLineIndex = i;
            }

        }


        for ( int[] line: matrice
             ) {
            System.out.println(Arrays.toString(line));
        }

        System.out.printf("The line index of the greatest weight is: %d", greatestValueLineIndex);

    }

}
