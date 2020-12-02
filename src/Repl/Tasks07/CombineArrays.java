package Repl.Tasks07;

public class CombineArrays {
    public static void main(String[] args) {
        String[] arr1 = {"f","o","o"};
        String[] arr2 = {"d","e","q"};
        System.out.println(combineRs(arr1,arr2));


    }
    public static String combineRs(String[] r1,String[] r2) {

        String newString = "";
        String []arr = new String[r1.length+r2.length];
        int j =0;
        for (String each : r1)arr[j++]=each;
        for (String each : r2)arr[j++]=each;
        for (String each : arr)newString+=each;
        return newString;

    }
}
