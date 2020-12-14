package Repl.Tasks09;

import java.util.Arrays;

public class sheet {
    public static void main(String[] args) {

        int[] intArr = new int[8];
        int sum = 89;



        for (int j = 0, k = 256, n = k / 2; j < intArr.length; j++, k /= 2, n /= 2) {

            intArr[j] = sum % k / n;

        }
        System.out.println(Arrays.toString(intArr));
    }
}
