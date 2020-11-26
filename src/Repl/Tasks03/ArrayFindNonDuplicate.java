package Repl.Tasks03;

import java.util.Scanner;

public class ArrayFindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        //int[] nums = {1, 1, 2, 3, 4, 3, 4};

        for (int ch1:nums){
            int count = 0;
            for (int ch2:nums){
                if (ch1==ch2)count++;
            }if (count==1)System.out.println(ch1);
        }


    }
}
