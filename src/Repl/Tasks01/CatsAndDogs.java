package Repl.Tasks01;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
 */
import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        while (word.contains("cat")) {
            word = word.replaceFirst("cat","");
            countOfCats++;
        }
        while (word.contains("dog")){
            word = word.replaceFirst("dog", "");
            countOfDogs++;
        }
        System.out.println(countOfCats==countOfDogs);
    }
}
