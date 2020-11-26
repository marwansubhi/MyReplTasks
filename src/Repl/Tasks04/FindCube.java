package Repl.Tasks04;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        cube();

    }
    public static void cube(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cubeValue = num*num*num;
        System.out.println(cubeValue);
    }
}
