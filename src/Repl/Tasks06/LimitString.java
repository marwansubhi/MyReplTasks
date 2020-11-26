package Repl.Tasks06;

public class LimitString {
    public static void main(String[] args) {
        String a = "bla bla";
        int b= 3;
        System.out.println(limit(a, b).length());

    }
    public static String limit(String text, int maxLength){
        String result = "";
        for (int i =0; i<maxLength;i++) {
            result += text.charAt(i);
        }
        return result;
    }
}
