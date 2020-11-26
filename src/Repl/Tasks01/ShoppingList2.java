package Repl.Tasks01;
/*
In this assignment, you will write a program that will generate a shopping list.
It's more advanced version of assignment #22 (Shopping list I).
Your program should ask use to enter items followed by its price. After adding item,
ask user if he wants to add one more item. If so, repeat previous steps again.
If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.
 */

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            System.out.println("Add one more item?");
            countinue = scan.next();
            count++;
        } while (countinue.contains("yes"));
        System.out.println(shoppingListReport.substring(0, shoppingListReport.length() - 2) + "\nTotal price: " + totalPrice);


    }
}
