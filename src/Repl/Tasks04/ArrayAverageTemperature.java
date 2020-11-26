package Repl.Tasks04;

import java.util.Scanner;

public class ArrayAverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (double each: temps){
            total+=each;
        }avgTemp = total/temps.length;
        System.out.println(avgTemp);

    }
}
