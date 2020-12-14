package Repl.Tasks09;

import java.util.Arrays;

public class BinaryToAsciiConverter {

    public static void main(String[] args) {

        String str1 = "0100000101000010010000110100010001000101010001100100011101001000";
        String str2 = "";

        if (str1.contains("0")&&str1.contains("1")&str1.length()%8==0){
            for (int x = 0, y = 8; x < str1.length(); x += 8, y += 8) {
                str2 = str1.substring(x,y);

                int sum = 0;

                String[] strArr = str2.split("");

                int[] intArr = new int[strArr.length];

                for (int i = 0; i < strArr.length; i++) {

                    intArr[i] = Integer.parseInt(strArr[i]);
                }

                for (int i = 128, j = 0; j < intArr.length; i /= 2, j++) {
                    sum += i * intArr[j];
                }

                System.out.print( (char) sum);

            }
        }else System.err.println("please input multiples of 8s");



        System.out.println();






    }
}


//        int a = 72;
//        System.out.println((char) a);

//        System.out.println(Arrays.toString(strArr));
//        128  64  32  16  8  4  2  1
//        0    1   0   1   0   0   1   0