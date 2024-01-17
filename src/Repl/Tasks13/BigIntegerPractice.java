package Repl.Tasks13;

import java.math.BigInteger;

/**
 * Created by Marwan on 15 Jan, 2024 around 7:50 PM
 */
public class BigIntegerPractice {

    public static void main(String[] args) {


        System.out.println("-----------------------------");

        BigInteger myBigNum = new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");

        System.out.println(digitSumWithBigInteger(myBigNum));


    }

    public static BigInteger digitNumSum(BigInteger inNum) {

        BigInteger sum = new BigInteger("0");


        while (inNum.compareTo(BigInteger.valueOf(0)) > 0 || sum.compareTo(BigInteger.valueOf(9)) > 0) {
            if (inNum.equals(BigInteger.valueOf(0))) {
                inNum = sum;
                sum = BigInteger.ZERO;
            }
            sum = sum.add(inNum.mod(BigInteger.TEN));
            inNum = inNum.divide(BigInteger.TEN);
        }
        return sum;
    }

    public static BigInteger digitSumWithBigInteger(BigInteger number) {

        BigInteger sum = BigInteger.ZERO;

        while (number.compareTo(BigInteger.ZERO) > 0 || sum.compareTo(BigInteger.valueOf(9)) > 0) {
            if (number.equals(BigInteger.ZERO)){
                number = sum;
                sum = BigInteger.ZERO;
            }
            sum = sum.add(number.mod(BigInteger.TEN));
            number = number.divide(BigInteger.TEN);
        }
        return sum;
    }
}






 /*
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

        BigInteger modInt = new BigInteger("555");
        System.out.println(modInt.divide(new BigInteger("100")));
        System.out.println(modInt.mod(new BigInteger("1000")));
        System.out.println("=======================");
        System.out.println(digitNumSum(modInt));
        System.out.println("=============================");
        for (int i = 0; i < 10; i++) {
            if (modInt.compareTo(BigInteger.valueOf(100)) > 2) {
                System.out.println(modInt);
            }
        }

         */















