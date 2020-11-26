package Repl.Tasks05;

import java.util.Scanner;

public class MethodSignum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
    public static void sign(int n){
        int result = 0;
        if (n>0)result=n/n;
        else if (n<0)result = (n/n)* -1;
        else result=0;
        System.out.println(result);
    }

}
