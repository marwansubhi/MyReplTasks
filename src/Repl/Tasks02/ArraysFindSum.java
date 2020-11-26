package Repl.Tasks02;

import java.util.Scanner;

public class ArraysFindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers

        //TODO: Write your code below
        int sum = 0;

        for (int i = 0; i<nums.length; i++){
            sum+=nums[i];//1, 3, 6, 10, 15
        }
        System.out.println(sum);

    }
}
