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
        list.addAll(wordList1);
        list.addAll(wordList2);
        return list;
    }
}
