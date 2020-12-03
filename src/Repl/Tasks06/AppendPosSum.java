package Repl.Tasks06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class AppendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,-8,0,4,3,3));
        System.out.println(appendPosSum(list));

    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        int sum = 0;
        for (int each : list) if (each>0)list1.add(each);
        for (int each :list1)sum+=each;
        list1.add(sum);
        return list1;

    }
}
