package Repl.Tasks02;

import java.util.Scanner;

public class Printntimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = 0;
        int n = in.nextInt();
        while(j<n){
            System.out.print("*");
            j++;
        }
    }
}
