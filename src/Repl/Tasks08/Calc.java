package Repl.Tasks08;

public class Calc {
    public static int plus(int n1, int n2) {

        return n1 + n2;
    }

    public static int minus(int n1, int n2) {

        return n1 - n2;
    }


}

class Main {
    public static void main(String[] args) {

        System.out.println("1+1= "+Calc.plus(1,1));
        System.out.println("1-1 = "+Calc.minus(1,1) );

    }
}
