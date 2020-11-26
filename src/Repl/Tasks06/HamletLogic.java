package Repl.Tasks06;

public class HamletLogic {
    public static void main(String[] args) {
        boolean toBe = false;
        boolean notToBe = false;
        System.out.println(hamletQuote(toBe, notToBe));

    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe)
    {
        if ((toBe ==true&&notToBe==true)||(toBe==true||notToBe==true))return true;
        else return false;

    }
}
