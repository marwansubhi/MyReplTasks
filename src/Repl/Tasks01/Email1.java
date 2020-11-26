package Repl.Tasks01;
/*
In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything
 */
import java.util.Scanner;

public class Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
            if (email.contains("_")){
                String first = email.substring(0,email.indexOf("_"));
                String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
                String domain = email.substring(email.indexOf("@"));
                System.out.println(last+"_"+first+domain);
            }else System.out.println(email);
    }
}
