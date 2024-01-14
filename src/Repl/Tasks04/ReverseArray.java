package Repl.Tasks04;



import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

            int[] nums = {10,20,30,40,50,60,70};
        for (int i =0; i<=nums.length/2;i++){// i =0, j= 1,
            int j = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i]=j;
        }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
