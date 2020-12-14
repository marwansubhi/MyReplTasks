package Repl.Tasks09;

import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        if (model.equalsIgnoreCase("Extravagant")&&(year>=2010&&year<=2012)) System.out.println(true);
        else if (model.equalsIgnoreCase("Guzzler")&&(year>=2015&&year<=2018)) System.out.println(true);
        else System.out.println(false);

    }

}
