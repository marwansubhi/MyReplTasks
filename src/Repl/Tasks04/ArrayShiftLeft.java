package Repl.Tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

       // System.out.println(Arrays.toString(nums));
        int [] arr = new int[nums.length];
        int j = 0;
        for (int i =1; i<=nums.length-1;i++){
            arr[j++]=nums[i];
        }arr[arr.length-1]=nums[0];
        System.out.println(Arrays.toString(arr));
    }
}
