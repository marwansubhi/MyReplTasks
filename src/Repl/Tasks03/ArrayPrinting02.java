package Repl.Tasks03;

import java.util.Scanner;

public class ArrayPrinting02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

       // String[] arr = {"apple", "banana", "kiwi" , "grape","milk", "soda","juice", "coffee"};
        for (int i=0; i<=arr.length-1;i++){

            System.out.print(arr[i]+" , ");
            i++;
            System.out.println(arr[i]);
            }
        }

    }

