package Repl.Tasks06;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "mama";
        System.out.println(uniqueChars(str));

    }
    public static String uniqueChars(String str) {
        //TODO: write your below
        String word = "";
        for (int i =0; i<str.length();i++){
            if (!word.contains(str.charAt(i)+""))word+=str.charAt(i);
        }
        return word;

    }
}
/*
//            int count = 0;
//            for (int j=0; j<str.length();j++){
//                if (str.charAt(i)==str.charAt(j))count++;
//            }if (count==1)word+=str.charAt(i);
 */