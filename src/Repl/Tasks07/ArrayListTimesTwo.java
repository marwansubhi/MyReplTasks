package Repl.Tasks07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTimesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,3));
        timesTwo(num1);

    }
    public static void timesTwo(ArrayList<Integer> nums){
        for (int i = 0; i< nums.size();i++){
           nums.set(i,nums.get(i)*2);
        }
        System.out.println(nums);
    }
}
