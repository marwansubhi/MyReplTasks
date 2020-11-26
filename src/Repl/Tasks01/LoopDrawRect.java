package Repl.Tasks01;
/*+
you get a number, write a code that draws a filled rectangle the size of that number.
each rectangle row is 3 x: xxx

 */
import java.util.Scanner;

public class LoopDrawRect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i =1; i<=n; i++){
            System.out.println("xxx");
        }

    }
}
