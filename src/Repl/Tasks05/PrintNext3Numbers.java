package Repl.Tasks05;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int n){
        String result = (n+1) + " "+(n+2)+" "+(n+3);
        System.out.println(result);
    }
}
