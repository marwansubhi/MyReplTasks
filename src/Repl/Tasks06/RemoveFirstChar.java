package Repl.Tasks06;

public class RemoveFirstChar {
    public static void main(String[] args) {

    }
    public static String removeFirst(String target){
        String result = "";
        for (int i = 1; i<target.length();i++){
            result+=target.charAt(i);
        }
        return result;
    }
}
