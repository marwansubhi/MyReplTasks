package Repl.Tasks06;

public class Max {
    public static void main(String[] args) {
        int x = 100;
        int max = 20;
        System.out.println(max(x, max));

    }
    public static int max(int x, int max){
        if (x>max)return max;
        else return x;
    }
}
