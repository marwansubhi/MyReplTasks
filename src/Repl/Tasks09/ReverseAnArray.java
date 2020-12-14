package Repl.Tasks09;

public class ReverseAnArray {
    public static void main(String[] args) {

    }

    /**
     * Reverses the order of the elements in the specified array
     *
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        //write your codes here

        for (int i =0; i< arr.length/2; i ++){
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }


        return arr;
    }
}
