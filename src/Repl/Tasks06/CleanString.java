package Repl.Tasks06;

public class CleanString {
    public static void main(String[] args) {
        String a = "he said bla bla bla";
        String b = "bla";
        System.out.println(clean(a, b));

    }
    public static String clean (String text ,String badWord) {
        String result = "";
        if (text.contains(badWord))result+=text.replace(badWord,"");
        return result;
    }
}
