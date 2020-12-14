package Repl.Tasks09;

import java.util.Arrays;

public class AsciiToBinaryConverter {
    public static void main(String[] args) {

        String str1 = "ABCDEFGH";
        String str2 = "";
        int[] intArr = new int[8];


        for (int i = 0; i < str1.length(); i++) {
            int sum = str1.charAt(i);

            for (int j = 0, k = 256, n = k / 2; j < intArr.length; j++, k /= 2, n /= 2) {

                intArr[j] = sum % k / n;

            }
            for (int each : intArr) str2 += each;


        }
        System.out.println(str2);


    }
}
//  128  64  32  16  8  4   2   1

// 256  128  64   32  16   8   4  2

// A = 0 1 0 0 0 0 0 1
// A = 0 128 0 0 0 0 0 2

//        int a  = 65;
//        System.out.println((char) a);

//{ (num%256)/128, (num%128)/64,(num%64)/32,(num%32)/16,(num%16)/8,(num%8)/4,(num%4)/2,(num%2)/1 }
