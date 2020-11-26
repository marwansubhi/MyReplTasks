package Repl.Tasks01;

import java.util.Scanner;

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
 */
public class Party {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        String guestNames = "";
        System.out.println("Please enter guest name:");
        String name = input.nextLine();
        guestNames+=name;

        System.out.println("Do you want to enter new guest name:");
        String question = input.next();
        while (question.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
           name = input.next();

            System.out.println("Do you want to enter new guest name:");
             question = input.next();
            guestNames+=", "+name;
        }System.out.println("Guest's list: "+guestNames);

    }
}
