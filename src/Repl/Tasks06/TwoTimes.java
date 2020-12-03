package Repl.Tasks06;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));

        System.out.println(twoTimes(list));

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int each : list) {
            list1.add(each);
            list1.add(each);
        }
        return list1;
    }
}
