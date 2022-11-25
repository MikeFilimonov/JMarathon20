package day2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        while (true){

            System.out.println("Введите количество этажей в здании");
            Scanner sc = new Scanner(System.in);
            int floorCount = sc.nextInt();

            if (floorCount > 0 && floorCount <= 4){
                System.out.println("Малоэтажный дом");
            } else if (floorCount >=5 && floorCount <=8) {
                System.out.println("Среднеэтажный дом");
            }else if (floorCount >= 9){
                System.out.println("Многоэтажный дом");
            }
            else {
                System.out.println("Введите актуальные данные");
                break;
            }

        }



    }
}
