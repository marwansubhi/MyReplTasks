package Repl.Tasks05;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int sum = 1;
        for (int i =1, j =1, k = 1 ; i<=num-2;i++){
            sum = j+k;
            j =k;
            k = sum;
        }
        System.out.println(sum);

    }
}
