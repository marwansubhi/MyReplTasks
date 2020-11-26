package Repl.Tasks06;

public class ThreeLocks {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        System.out.println(threeLocks(a, b,c));

    }
    public static boolean threeLocks(boolean a, boolean b, boolean c){
        if ((a==true&&b==true)||(c==true))return true;
        else return false;
    }
}
