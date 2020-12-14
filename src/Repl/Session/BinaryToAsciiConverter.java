package Repl.Session;

import java.util.Arrays;

public class BinaryToAsciiConverter {
    public static void main(String[] args) {
        String str1 = "010001110110111101101111011001000010000001101101011011110111001001101110011010010110111001100111001000000100001101111001011000100110010101110010011101000110010101101011";

        if (str1.contains("0") && str1.contains("1") && str1.length() % 8 == 0) {

            String str2 = "";

            for (int x = 0, y = 8; x < str1.length(); x += 8, y += 8) {
                str2 = str1.substring(x, y);

                int sum = 0;

                String[] strArr = str2.split("");

                int[] intArr = new int[strArr.length];

                for (int i = 0; i < strArr.length; i++) {

                    intArr[i] = Integer.parseInt(strArr[i]);
                }

                for (int i = 0, j = 128; i < intArr.length; i++, j /= 2) {
                    sum += j * intArr[i];
                }
                System.out.print((char) sum);

            }

        }else System.err.println("Please input a binary value as multiples of 8s");
        System.out.println();


    }
}
//Thank you Marwan for this great presentation!