package Repl.Tasks08;

public class LameCalculator {


    public int plus(int n1, int n2){

        return n1+n2;
    }
    public int minus(int n1, int n2){

        return n1-n2;
    }
    public int divide(int n1, int n2){

        return n1/n2;
    }
    public int multiply(int n1, int n2){

        return n1*n2;
    }

}
class LCObjects{
    public static void main(String[] args) {
        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = "+lc.plus(1,1));
        System.out.println("2-3 = "+lc.minus(2,3));
        System.out.println("2x3 = "+lc.multiply(2,3));
        System.out.println("10:2 = "+lc.divide(10,2));
    }
}
