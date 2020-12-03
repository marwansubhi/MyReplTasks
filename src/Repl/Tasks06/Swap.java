package Repl.Tasks06;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));

        System.out.println(swap(list, 0, 2));


    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String each : list) list1.add(each);
        String temp = list1.get(pos1);
        list1.set(pos1, list1.get(pos2));
        list1.set(pos2, temp);
        return list1;

    }
}
