package Repl.Tasks06;

public class WordCount {
    public static void main(String[] args) {
        String word = "water fall";
        System.out.println(wordCount(word));

    }
    public static int wordCount(String words) {
        int count = 1;
        for (int i =0; i<words.length();i++){
            if (words.charAt(i)==' ')count++;
        }
        return count;
    }
}
