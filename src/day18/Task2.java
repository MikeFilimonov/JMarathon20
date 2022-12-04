package day18;

public class Task2 {

    public static int divider = 10;
    public static int figure = 7;

    public static void main(String[] args) {
        System.out.println(figureCount(475275779));
    }

    public static int figureCount(int number){

        if (number / divider <= 1)
            return (number == figure)? 1:0;

        int value  = ((number % divider) == figure)? 1: 0;

        return value + figureCount(number/divider);

    }

}
