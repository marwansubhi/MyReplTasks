package Repl.Tasks06;

public class ExtractNumberFromString {
    public static void main(String[] args) {

        String s = "asdf12gf";
        System.out.println(extractNum(s));

    }

    public static String extractNum(String s){
        String str = "";
        for (int i = 0; i<s.length();i++){
            if (Character.isDigit(s.charAt(i)))str+=s.charAt(i);
        }
        return str;
    }
}
