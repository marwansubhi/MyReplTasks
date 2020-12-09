package Repl.Tasks08;

import java.util.Arrays;

public class SwitchElements {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(do_switch(arr)));


    }

    public static int[] do_switch(int[] i) {

        for (int j = 0 ; j<i.length ; j++){
            int temp = i[0];
          i[0]=  i[i.length-1] ;
            i[i.length-1] = temp;
        }
        return i;
    }
}
