package Repl.Tasks09;

public class IsSorted {

    public static void main(String[] args) {

        int[] arr = {9,8,7,6};
        System.out.println(isSort(arr));


    }


    public static boolean isSort(int[] nums) {

        boolean result = true;

        for (int i = 0, j = 1; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] > nums[j]) result = false;
            else result = true;


        }
        return result;


    }

}
