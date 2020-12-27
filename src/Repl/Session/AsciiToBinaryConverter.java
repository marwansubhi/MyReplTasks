package Repl.Session;

import java.util.Arrays;

public class AsciiToBinaryConverter {

    public static void main(String[] args) {
        String str1 = "Thank you Muhtar";
       AsciiToBinConverter(str1);




    }
    public static void AsciiToBinConverter(String str1){
        String str2 = "";
        int[] binary = new int[8];
        for (int n = 0; n < str1.length(); n++) {
            int num = str1.charAt(n);

            for (int i = 0, j = 256, k = j / 2; i < binary.length; i++, j /= 2, k /= 2) {

                binary[i] = num % j / k;

            }
            for (int each : binary) str2 += each;


        }
        System.out.println(str2);

    }
}




//binary ={ (num%256/128),(84%128/64),(84%64/32),(84%32/16),(84%16/8),(84%8/4),(84%4/2),(84%2/1)}



//        System.out.println(84 % 256 / 128);
//        System.out.println(84 % 128 / 64);
//        System.out.println(84 % 64 / 32);
//        System.out.println(84 % 32 / 16);
//        System.out.println(84 % 16 / 8);
//        System.out.println(84 % 8 / 4);
//        System.out.println(84 % 4 / 2);
//        System.out.println(84 % 2 / 1);


//           0  1   0 1  0  1  0  0
        //  128  64  32  16  8  4  2 1




// T binary is = 0 1 0 1 0 1 0 0  ==64+16+4
// T Decimal is = 84