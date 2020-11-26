package Repl.Tasks03;

import java.util.Scanner;

public class ArraysPrinting03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below

        //String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};

        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i++]+" , "+arr[i++]+" , "+arr[i]+"\n");i--;
            System.out.print(arr[i++]+" , "+arr[i++]+" , "+arr[i]+"\n");i--;
            System.out.print(arr[i++]+" , "+arr[i++]+" , "+arr[i]+"\n");i--;
            System.out.print(arr[i++]+" , "+arr[i++]+" , "+arr[i]+"\n");
        }
    }
}
