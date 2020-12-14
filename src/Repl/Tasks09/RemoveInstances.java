package Repl.Tasks09;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {   // write your codes here :

        for (int i = 0; i < r.size(); i++) {

             r.removeIf(p-> p.equals(n));
        }
        return r;


    }// end of your code


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }//end main
}
