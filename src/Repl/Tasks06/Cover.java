package Repl.Tasks06;

public class Cover {
    public static void main(String[] args) {
        String main = "ello";
        String coverMe = "ello";
        System.out.println(coverString(main, coverMe));

    }

    public static String coverString(String main, String coverME) {
        String result = "";
        if (main.contains(coverME)) result += main.replaceAll(coverME, ("[" + coverME + "]"));
        else result += "[" + main + "]";
        return result;
    }
}
