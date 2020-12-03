package Repl.Tasks06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,3,3));
        System.out.println(removeInst(list, 4));

    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : r)list.add(each);
        list.removeIf(p-> p==n);
        return list;


    }
}
