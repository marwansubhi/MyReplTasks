package Repl.Tasks03;

public class ArrayPrinting03b {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        for (int i = 0, j =1, f = 2,d=3; i<arr.length&&j<arr.length&&f<arr.length&&d<arr.length;i++){
            System.out.print(arr[i]+" , "+arr[j++]+" , "+arr[f++]+" , "+arr[d++]+"\n");
        }
    }
}
