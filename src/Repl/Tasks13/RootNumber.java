package Repl.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marwan on 14 Jan, 2024 around 3:54 PM
 */
public class RootNumber {

    public static void main(String[] args) {
        Long n = 5987432548563234459l;
        System.out.println(Long.MAX_VALUE);
        System.out.println(n);

        Long num1 = sumDigit(5985468l);
        Long num2 = sumDigit(num1);
        Long num3 = sumDigit(num2);
        System.out.println("********************");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("******************");
        List<Long> longs = new ArrayList<>(Arrays.asList(num1,num2,num3));
        System.out.println(longs);
        longs.removeIf(i-> i>8);
        System.out.println(longs);



    }

    public static Long sumDigit(Long num) {

        Long sum = 0L;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}


//        System.out.println(num%10000);
//        System.out.println(num%1000);
//        System.out.println(num%100);
//        System.out.println(num%10);

 /*
        int myNum = 0;
        String str = String.valueOf(num);
        String[] strArr = str.split("");
        for (String s : strArr) {
            myNum+=Integer.parseInt(s);
        }
        System.out.println(str);
        System.out.println("************");

        System.out.println(myNum);
        System.out.println(myNum>9);

         */