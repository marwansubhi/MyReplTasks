package Repl.Tasks05;

import java.util.Scanner;

public class MethodPlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);

    }
    public static void plus_minus(int[] arr){

        int i = 0;
        int j = 0;
        int k = 0;
        for (int each: arr){
            if (each==0)i++;
            if (each>0)j++;
            if (each<0)k++;
        }
        System.out.println("positive:"+j+", negatives:"+k+", zeros:"+i);

    }
}
