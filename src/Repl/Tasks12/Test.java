package Repl.Tasks12;

public class Test {

    public static void main(String[] args) {
        String str = "MaruF The cool";
        setTitle(str);
    }


    public static void check(String word){
        String result = "";
        if (word.isEmpty()){
            word = "unknown";
            System.out.println( word);
        }
        else if (!word.contains(" ")){
            word = word.toUpperCase().charAt(0)+""+word.toLowerCase().substring(1);
            System.out.println( word);
        }
        else if (word.contains(" ")){
            for (String each :word.split(" ")){

                result+=each.toUpperCase().charAt(0)+each.toLowerCase().substring(1)+" ";
            }
            System.out.println(result);

        }
    }
    public static void setTitle(String title) {
        String result = "";

        if (!title.contains(" ")){
            result = title.toUpperCase();
            System.out.println(result);
        }else if (title.isEmpty()){
            result = "";
            System.out.println(result);
        }
        else if (title.contains(" ")){
            for (String each : title.split(" ")){
                if (!isTitleWord(each)) result+=each.toLowerCase()+" ";
                if (isTitleWord(each)) result+=each.toUpperCase().charAt(0)+each.toLowerCase().substring(1)+" ";

            }
            System.out.println(result);
        }


    }
    public static Boolean isTitleWord(String word) {
        switch (word.toLowerCase()) {
            case "a":
            case "an":
            case "the":
            case "and":
            case "but":
            case "for":
            case "nor":
            case "or":
            case "so":
            case "yet":
            case "at":
            case "by":
            case "in":
            case "into":
            case "near":
            case "of":
            case "on":
            case "to":
            case "than":
            case "via":
                return false;

            default:
                return true;
        }
        // return true;

    }
}
