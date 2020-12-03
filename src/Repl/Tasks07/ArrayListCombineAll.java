package Repl.Tasks07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCombineAll {
    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("e","f","g"));
        System.out.println(combineAl(wordList1, wordList2));

    }
    public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String > list = new ArrayList<>();
        for (String each: wordList1)list.add(each);
        for (String each: wordList2)list.add(each);
        return list;
    }
}
