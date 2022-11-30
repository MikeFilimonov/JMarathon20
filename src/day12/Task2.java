package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        int i = 0;
        while (i < 31 || (i >= 300 && i < 351)){
            if (i % 2 == 0)
                nums.add(i);
            i++;
            if (i == 31){
                i = 300;
            }
        }
        System.out.println(nums);

    }

}