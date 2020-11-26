package Repl.Tasks02;

public class Compute {
    public static void main(String[] args) {

        int k = 1;
        int total = 0;

        do {
            total+=(k*k);// 1+4+9+16=
            k++;
        }while (k<=50);
        System.out.println("total = " + total);
    }
}
