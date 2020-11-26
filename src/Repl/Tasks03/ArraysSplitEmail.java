package Repl.Tasks03;

import java.util.Scanner;

public class ArraysSplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        //String email = "info@cybertekschool.com";
        int count = 0;

        for (int i =0; i<=email.length()-1;i++) {
            if (email.charAt(i) == '@') {
                count++;

            }
        }
            if (count>1||!email.contains("@")){
                System.out.println("Invalid email");
            }else {

                System.out.println("Email id: "+email.substring(0,email.indexOf("@")));
                System.out.println("Email domain: "+email.substring(email.indexOf("@")+1));
            }

    }
}
