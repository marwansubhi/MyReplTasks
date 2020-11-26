package Repl.Tasks00;

import java.util.Scanner;

/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.

Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.
 */
public class FindMidNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = in.nextInt();
        System.out.println("Enter second number:");
        num2 = in.nextInt();
        System.out.println("Enter third number:");
        num3 = in.nextInt();
        int mid = 0;
        if (num1>num2&&num2>num3)mid+=num2;
        else if ((num1>num3&&num3>num2)||(num2>num3&&num3>num1))mid+=num3;
        else if ((num2>num1&&num1>num3)||(num3>num1&&num1>num2))mid+=num1;
        else mid+=num2 ;
        System.out.println("Medium value is: "+mid);
    }

}
/*
Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */