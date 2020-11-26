package Repl.Tasks00;

import java.util.Scanner;

/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

 */
public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if (word.length()%2!=0&&word.length()>=5) {
            int n1 = word.length()/2-1;
            int n2 = word.length()/2;
            int n3 = word.length()/2+1;
            System.out.println(word.charAt(n1)+""+word.charAt(n2)+""+word.charAt(n3));
        }
        else System.out.println("invalid");

    }
}
/*
fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */