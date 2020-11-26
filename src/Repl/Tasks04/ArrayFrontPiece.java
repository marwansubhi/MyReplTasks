package Repl.Tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] arr = new int[2];
        if (size>2){
            for (int i =0;i<=2;i++){
                if (i>=0&&i<=1) arr[i]=num[i];
            }
            System.out.println(Arrays.toString(arr));
        }else System.out.println(Arrays.toString(num));
    }
}
