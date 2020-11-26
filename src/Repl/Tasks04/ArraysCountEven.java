package Repl.Tasks04;

import java.util.Scanner;

public class ArraysCountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

       // int[] nums = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for (int each:nums){

            if (each%2==0)count++;
        }
        System.out.println(count);
    }
}
