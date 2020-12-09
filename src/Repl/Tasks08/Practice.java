package Repl.Tasks08;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));
    }
    public static int[] populate(int[] r){

        for (int i =0, j =1; i<r.length ; i++,  j++){

            r[i] = j;
        }
        return r;

    }
}
