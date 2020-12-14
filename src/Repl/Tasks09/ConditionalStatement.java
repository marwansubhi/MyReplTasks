package Repl.Tasks09;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        String str = "";

        if (word.toLowerCase().endsWith("ey")) str += "eys";
        else if ((word.toLowerCase().endsWith("y"))) str += "ies";
        else if (word.toLowerCase().endsWith("ife")) str += "ives";
        else str += "s";

        System.out.println(str);
    }
}
