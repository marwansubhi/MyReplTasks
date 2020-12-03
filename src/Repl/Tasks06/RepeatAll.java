package Repl.Tasks06;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        list.addAll(Arrays.asList(true,false,false));

        repeatAL(list);


    }
    public static void repeatAL (ArrayList<Boolean> list){
        list.addAll(list);
        System.out.println(list);

    }
}
