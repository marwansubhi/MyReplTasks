package Repl.Tasks08;

public class FindErrorString {
    public static void main(String[] args) {

        String line = " foo bar error";
        System.out.println( isError(line));

    }
    public static boolean isError(String line) {

        if (line.startsWith("error"))return true;
        else return false;
    }

}
