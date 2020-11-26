package Repl.Tasks06;

public class At3rdChar {
    public static void main(String[] args) {
        String a = "blabla";
        String b = "a";
        System.out.println(at3(a, b));

    }
    public static String at3(String target,String word){
        String result = "";
        result = target.substring(0,3)+word+target.substring(3);
        return result;
    }
}
