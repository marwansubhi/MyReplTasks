package Repl.Tasks13;

import java.math.BigInteger;

/**
 * Created by Marwan on 15 Jan, 2024 around 7:50 PM
 */
public class BigIntegerPractice {

    public static void main(String[] args) {
        BigInteger int1 = new BigInteger("7558745888888655455874558556658858");
        BigInteger multiply = int1.multiply(new BigInteger("555555555555548544584"));


        System.out.println(multiply.bitLength());
        System.out.println(multiply.intValue());
        System.out.println("****************************************************");

        BigInteger sumNum = new BigInteger("123456789");
        System.out.println(sumNum.bitCount());
        System.out.println(sumNum.bitLength());
        System.out.println(sumNum.intValue());
        System.out.println("*****************");


    }
}
