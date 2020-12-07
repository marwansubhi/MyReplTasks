package Repl.Tasks07;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> r = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "fur";

        System.out.println(search(r, find));


    }
    public static String search(ArrayList<String> r, String find){

        for (String each : r){
            if (each.equalsIgnoreCase(find)|| each.contains(find)) return each;
        }
        return  "search failed";

    }
}
