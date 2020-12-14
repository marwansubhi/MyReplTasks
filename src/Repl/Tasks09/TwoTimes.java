package Repl.Tasks09;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes {
    public static void main(String[] args) {

        ArrayList<Integer> parameters = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(parameters));


    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> parameters){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<parameters.size();i++){
            list.add(parameters.get(i)) ;
            list.add(parameters.get(i)) ;
        }
        return list;
    }
}
