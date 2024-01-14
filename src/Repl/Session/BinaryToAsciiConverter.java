package Repl.Session;

import java.util.Arrays;

public class BinaryToAsciiConverter {
    public static void main(String[] args) {
        String str1 = "01010100011010000110000101101110011010110010000001111001011011110111010100100000010011010110000101110010011101110110000101101110";
        str1 = str1.replace(" ","");

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