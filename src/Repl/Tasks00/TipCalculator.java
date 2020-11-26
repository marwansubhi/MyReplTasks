package Repl.Tasks00;

import java.util.Scanner;

/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
 */
public class TipCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Split:");
        String split = in.next();
        in.nextLine();
        System.out.println("Number of people:");
        int numOfPeople = in.nextInt();
        System.out.println("Check amount:");
        double check = in.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = in.next();
        in.nextLine();
        double tip = 0;
        if (serviceQuality.equalsIgnoreCase("poor")) {
            tip = 0.05 * check;
            check += tip;
        } else if (serviceQuality.equalsIgnoreCase("fair")) {
            tip = 0.1 * check;
            check += tip;
        }else if (serviceQuality.equalsIgnoreCase("good")){
            tip = 0.15 * check;
            check += tip;
        }else if (serviceQuality.equalsIgnoreCase("great")){
            tip = 0.2 * check;
          check += tip;
        }else if (serviceQuality.equalsIgnoreCase("Excellent")){
            tip = 0.25 * check;
            check += tip;
        }
        System.out.print("Number of people entered: ");
        for (int i =1; i<=numOfPeople;i++) System.out.print("&");
        System.out.println();
        String result =  "Total to pay: " + check+"\nTotal tip: "+tip+"\nTotal per person" +
                ": "+check/numOfPeople+"\nTip per person: "+tip/numOfPeople;
        System.out.println(result);
    }
}
/*
Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */