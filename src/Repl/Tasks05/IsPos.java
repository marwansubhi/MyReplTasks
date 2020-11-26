package Repl.Tasks05;

import java.util.Scanner;
/*
1-The task here is asking us to create a custom method that checks whatever array elements we provide in our
main method whether it is positive or negative,
The method should check every single element in the array regardless of the size
 */
public class IsPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        for (int each : arr){// 5-here i had to figure out what approach i need to take to use whatever array i am declaring inside the main method
                            // that i can use along with the custom method and since we have an array then i found it easier to iterate using for each loop

            if (each>0)isPos(each);// 6-here if invoking compiler to check if an element which i declared "each" of the array
                                   // that is giving in the main method is positive and the integer element "each" matches the condition in the custom method isPos
                                   // which will print "positive" because "each" in this case is > 0
            if (each<=0)isPos(each);// 7-here if invoking compiler to check if an element which i declared "each" of the array
                                  // that is giving in the main method is negative and the integer element "each" matches the condition in the custom method isPos
                                  // which will print "positive" because "each" in this case is <= 0
        }
    }
    public static void isPos( int num){// 2-here i am declaring a void method with int num called isPos as was asked in the repl.it task
                                       // and the method should check the int num whether it is positive or negative

        if (num>0) System.out.println("positive");//3- here i am telling the method to print me "positive" if int num > 0
        if (num<=0) System.out.println("not positive");//4- here i am using another if statement to tell the method
                                                      // to print"not positive" if the number less than or equal to zero

    }
}
//1000891802 ms jonson
//