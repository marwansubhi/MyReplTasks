package Repl.Tasks01;
/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint.
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to endpoint - display: "start/end(start or end variable!) found"
 */
import java.util.Scanner;

public class BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        if (start.toUpperCase().equals("A")&&end.toUpperCase().equals("B")){
            System.out.println("right: "+end+" found");
        }else if (start.toUpperCase().equals("A")&&end.toUpperCase().equals("C")){
            System.out.println("right > down: "+end+" found");
        }else if (start.toUpperCase().equals("A")&&end.toUpperCase().equals("D")){
            System.out.println("right > down > left: "+end+" found");
        }else if (start.toUpperCase().equals("A")&&end.toUpperCase().equals("A")){
            System.out.println(start+" found");
        }else if (start.toUpperCase().equals("B")&&end.toUpperCase().equals("C")){
            System.out.println("down: "+end+" found");
        }else if (start.toUpperCase().equals("B")&&end.toUpperCase().equals("D")){
            System.out.println("down > left: "+end+" found");
        }else if (start.toUpperCase().equals("B")&&end.toUpperCase().equals("A")){
            System.out.println("down > left > up: "+end+" found");
        }else if (start.toUpperCase().equals("B")&&end.toUpperCase().equals("B")){
            System.out.println(start+" found");
        }else if (start.toUpperCase().equals("C")&&end.toUpperCase().equals("D")){
            System.out.println("left: "+end+" found");
        }else if (start.toUpperCase().equals("C")&&end.toUpperCase().equals("A")){
            System.out.println("left > up: "+end+" found");
        }else if (start.toUpperCase().equals("C")&&end.toUpperCase().equals("B")){
            System.out.println("left > up > right: "+end+" found");
        }else if (start.toUpperCase().equals("C")&&end.toUpperCase().equals("C")){
            System.out.println(start+" found");
        }else if (start.toUpperCase().equals("D")&&end.toUpperCase().equals("A")){
            System.out.println("up: "+end+" found");
        }else if (start.toUpperCase().equals("D")&&end.toUpperCase().equals("B")){
            System.out.println("up > right: "+end+" found");
        }else if (start.toUpperCase().equals("D")&&end.toUpperCase().equals("C")){
            System.out.println("up > right > down: "+end+" found");
        }else if (start.toUpperCase().equals("D")&&end.toUpperCase().equals("D")){
            System.out.println(start+" found");
        }
    }
}
