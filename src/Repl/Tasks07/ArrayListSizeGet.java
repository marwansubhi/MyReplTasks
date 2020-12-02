package Repl.Tasks07;

import java.util.ArrayList;

public class ArrayListSizeGet {
    public static void main(String[] args) {

    }
    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum = 0;
        for (int each: ints) sum+=each;
        return sum;

    }
}
