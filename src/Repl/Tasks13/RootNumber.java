package Repl.Tasks13;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marwan on 14 Jan, 2024 around 3:54 PM
 */
public class RootNumber {

    public static void main(String[] args) {
        Long n = 6666666666666556666l;




        System.out.println(digitSum(999999999999999999l));


    }

    public static Long sumDigit(Long num) {

        Long sum = 0L;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static Long getTheRoot(Long n) {
        List<Long> longList = new ArrayList<>();
        Long n1 = sumDigit(n);
        Long n2 = sumDigit(n1);
        longList.addAll(Arrays.asList(n, n1, n2));
        longList.removeIf(i -> i > 9);
        return longList.get(0);

    }

    public static Long digitSum(Long input) {

        Long sum = 0l;
        while (input > 0 || sum > 9) {
            if (input == 0) {
                input = sum;
                sum = 0l;
            }
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}


 /*
        int muNum = 264785685;
        System.out.println(Long.MAX_VALUE);
        System.out.println(getTheRoot(sumDigit(n)));

        BigInteger bi1 = new BigInteger("10552547855665455555556548555555554525555555555555555550");
        BigInteger bi2 = new BigInteger("9653658873652484444444444444444444444445874444444444444444");

        BigInteger bigSum = bi1.add(bi2);
        BigInteger bigSubtract = bi2.subtract(bi1);
        BigInteger bigProduct = bi1.multiply(bi2).multiply(bigSubtract);



        System.out.println("Sum : " + bigSum);
        System.out.println("Product : " + bigProduct);
        System.out.println("Subtract: "+bigSubtract);
        String[] strings =  String.valueOf(bigProduct).split("");

        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);

        System.out.println("*************************************************************************");

        System.out.println();

         */



/*

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


        for (int i = 0, j = 0; i <= longList.size(); i++, j++) {
            if (longList.get(i) == longList.get(j)) {
                longList.remove(longList.get(i));
            }

        }

        System.out.println(num%10000);
        System.out.println(num%1000);
        System.out.println(num%100);
        System.out.println(num%10);


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