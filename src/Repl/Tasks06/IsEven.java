package Repl.Tasks06;

public class IsEven {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isEven(n));

    }
    public static boolean isEven (int n){
        if (n%2==0)return true;
        else return false;
    }
}
