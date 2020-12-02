package Repl.Tasks07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListSet {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,1,1,1,9,9,9));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(5, 9, 9, 9, 6, 7, 9, 8));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0,5);
        System.out.println(list);
        System.out.println( list.get(1));
        list.addAll(Arrays.asList(6,7,8,9));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.removeAll(Arrays.asList(1));
        System.out.println(list);
        System.out.println(list.indexOf(9));
        System.out.println("index of first occur 9 is: "+list.indexOf(9));
        System.out.println("index of first last occur 9 is: "+list.lastIndexOf(9));
        System.out.println(list.contains(10));
        System.out.println("=================");
        System.out.println(list);
        System.out.println(list2);

       // System.out.println(list.equals(list2));
        System.out.println(list.containsAll(Arrays.asList(5, 9)));
        Predicate<Integer> divisibleBy3 = each-> each%3==0;
        list.removeIf(divisibleBy3 );
        System.out.println(list);



        System.out.println("********************");
        System.out.println();
        System.out.println();
        list.clear();
        System.out.println(list);



    }
}
