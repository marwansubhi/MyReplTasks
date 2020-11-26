package Repl.Tasks06;

public class Overloading1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double[] arr1 = {2.5,6.5,7.8,9.4,12.5};
        System.out.println(findMax(arr1));

    }
    public static int findMax(int[] arr){
       int max = arr[0];
        for (int each: arr){
            if (each>max)max=each;
        }
        return max;
    }
    public static double findMax(double[] arr){
        double max = arr[0];
        for (double each: arr){
            if (each>max)max=each;
        }
        return max;
    }
}
