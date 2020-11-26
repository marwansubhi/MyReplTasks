package Repl.Tasks05;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }
    public static void person (String info){
        String [] arr = info.split(",");
        String result = "person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2];
        System.out.println(result);
    }
}
