package Repl.Tasks00;

import java.util.Scanner;

public class IfStatementBlackJackKeepHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int player = s.nextInt();
        int house = s.nextInt();
        //your code here
        if ((house+player)>21) System.out.println("bust");
        else if (house>player) System.out.println("player loss");
        else if (house==player) System.out.println("its a tie");
        else System.out.println("player wins");
    }
}