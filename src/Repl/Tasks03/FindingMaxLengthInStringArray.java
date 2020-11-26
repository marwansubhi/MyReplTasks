package Repl.Tasks03;

import java.util.Scanner;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        //String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String max = words[0];

        for (String each :words){
            if (each.length()>max.length()){
                max = each;
            }
        }
        System.out.println(max);


    }

}
