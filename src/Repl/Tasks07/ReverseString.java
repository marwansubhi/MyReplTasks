package Repl.Tasks07;

public class ReverseString {
    public static void main(String[] args) {
        String str = "123456789";
        System.out.println(reverse(str));
    }

    public static String reverse(String input) {
        String newString = "";
        for (int i = input.length() - 1; i >= 0; i--)
            newString += input.charAt(i);
        return newString;
    }
}
