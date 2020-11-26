package Repl.Tasks04;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }
    public static void plus(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = n1+n2;
        System.out.println("result: "+n3);
    }
}
