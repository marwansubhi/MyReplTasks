package Repl.Tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysVeryOptional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.
        //int num = 25;
       // int[] binary = {(num%256)/128 , (num%128)/64 ,(num%64)/32 , (num%32)/16, (num%16)/8, (num%8)/4, (num%4)/2, (num%2)};

        for (int i =0,j=256, k = j/2 ; i<binary.length;i++,j/=2, k/=2){
            binary[i] = (decimal%j)/k;
        }
        System.out.println(Arrays.toString(binary));


    }
}
