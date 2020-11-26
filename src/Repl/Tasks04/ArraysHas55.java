package Repl.Tasks04;

import java.util.Scanner;

public class ArraysHas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:

        int count = 0;

        for (int i =0; i<=nums.length-2;i++){

            if (nums[i]==5){
                if (nums[i+1]==5)
                count++;
            }
        }if (count==1) System.out.println(true);
        else System.out.println(false);

    }
}
