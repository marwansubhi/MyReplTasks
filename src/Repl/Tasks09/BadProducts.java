package Repl.Tasks09;

public class BadProducts {
    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,0};
        int limit = 4;

        System.out.println(badP(arr, limit));


    }
    public static boolean badP(int[] products,int limit) {


        int count = 0;
        for (int each : products){
            if (each==0)count++;
        }
        if (count>=limit)return false;
        else return true;

    }
}
