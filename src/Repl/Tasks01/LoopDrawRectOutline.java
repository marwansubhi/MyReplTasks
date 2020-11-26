package Repl.Tasks01;

import java.util.Scanner;

/*
you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rect row is "x  x"
 */
public class LoopDrawRectOutline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("xxx");
        for (int i =1; i<=n; i++){
            System.out.println("x x");
        }
        System.out.println("xxx");


    }
}
