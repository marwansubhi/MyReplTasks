package Repl.Tasks06;

public class MergeThem {
    public static void main(String[] args) {
        String one = "12345";
        String two = "abcde";
        System.out.println(mergeStrings(one, two));

    }

    public static String mergeStrings(String one, String two) {
        String result = "";
        if (one.length()<two.length()){
            for (int i = 0, j = 0; i < one.length() && j < one.length(); i++, j++) {
                result += "" + one.charAt(i) + two.charAt(j);
            }
            result=result+two.substring(one.length());
        }
        else if (one.length()>two.length()){
            for (int i = 0, j = 0; i < two.length() && j < two.length(); i++, j++) {
                result += "" + one.charAt(i) + two.charAt(j);
            }
            result+=one.substring(two.length());
        }
        else {
            for (int i = 0, j = 0; i < one.length(); i++, j++) {
                result += "" + one.charAt(i) + two.charAt(j);
            }
        }
        return result;

    }
}
