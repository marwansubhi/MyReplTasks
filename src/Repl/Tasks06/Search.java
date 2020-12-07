package Repl.Tasks06;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");
        System.out.println(search(arr, "foo"));


    }//end mai
    public static String search(ArrayList<String> r, String find)
    {
        String result = "";
        for (String each : r){
            if (each.contains(find)) {
                result+=each; break;
            }
            else{
                result+="search failed";
            }
        }
        return result;



    }//end wineSeller
}
