package Repl.Tasks07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        String word = "hi";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
        removeAll(list,word);


    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeIf(p-> p.equalsIgnoreCase(targetWord));
        System.out.println(wordList);
    }
}
