package day18;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int result = recursiveSum(numbers.length-1,  numbers);
        System.out.println(result);

    }

    public static int recursiveSum(int index, int[] input){

            if (index < 0)
                return 0;
            return input[index] + recursiveSum(index -1, input);

      }

}
