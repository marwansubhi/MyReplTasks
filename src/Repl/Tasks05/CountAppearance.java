package Repl.Tasks05;

public class CountAppearance {
    public static void main(String[] args) {
        String[] arr = {"a", "foo", "foo", "bar", "foo", "bla"};
        String str = "foo";
        System.out.println(count_appearance(arr,str));

    }

    public static int count_appearance(String[] arr, String t) {
        int count = 0;
        for (String each : arr) {
            if (t.equalsIgnoreCase(each)) count++;
        }
        return count;
    }

}
