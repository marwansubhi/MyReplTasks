package Repl.Tasks06;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int [] b ={4,5,6,7,8};
        System.out.println(Arrays.toString(mergR(a,b)));

    }
    public static int[] mergR(int[] a,int[] b){
        int j =0;
        int[] mergeArray = new int[a.length+b.length];
        for (int each : a){
            mergeArray[j++]=each;
        }for (int each : b){
            mergeArray[j++]=each;
        }
        return mergeArray;
    }
}
