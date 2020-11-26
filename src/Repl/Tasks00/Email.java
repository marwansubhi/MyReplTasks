package Repl.Tasks00;
/*
Write a program that will print out information about user based on email. Print first and last name from the upper case.

 */
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String first = email.toUpperCase().charAt(0)+email.substring(1,email.indexOf("_"));
        char lastCap = email.toUpperCase().charAt(email.indexOf("_")+1);
        String last = email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String topLevelDomain = email.substring(email.indexOf(".")+1,email.length());

        String info = "First name: "+first+"\nLast name: "+lastCap+""+last+"\nDomain: "+domain+"\nTop-Level Domain: "+topLevelDomain;
        System.out.println(info);
//        System.out.println(first);
//        System.out.println(lastCap+""+last);
//        System.out.println(domain);
//        System.out.println(topLevelDomain);

    }
}
