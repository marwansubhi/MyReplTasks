package Repl.Tasks08;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] r1 = {1,2,3,4,5};
        int[] r2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(addElements(r1,r2)));


    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] newArr = new int[5];

        for (int i = 0; i < 5; i++) {
            newArr[i] = ints1[i] + ints2[i];
        }

        return newArr;

    }
}
