package Repl.Tasks06;

import java.util.Scanner;

public class PrintUniqueNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int [] nums){
        //WRITE YOUR CODE HERE
        for (int each1: nums){
            int count = 0;
            for (int each2 : nums){
                if (each1==each2)count++;
            }
            if (count==1)
            System.out.println(each1);
        }
    }
}
