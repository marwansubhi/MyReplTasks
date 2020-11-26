package Repl.Tasks02;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for ( i = 1 ; i<=n; i++){
           for ( j = 1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}
