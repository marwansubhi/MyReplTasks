package Repl.Tasks05;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
       // String str = "07:05:45pm";
        // System.out.println(Integer.parseInt(str.substring(0,1))+12+(str.substring(1,str.length()-2)));
        //timeConversion(str);
    }

    public static void timeConversion(String s) {
        int num = Integer.parseInt(s.substring(0, s.indexOf(":")));

        String result = "";
        String lastPortion = s.substring(2, s.length() - 2);
        String lastTwo = s.substring(s.length() - 2);
        int check = s.substring(0,s.indexOf(":")).length();
        if (num < 0 || num > 12) {
            System.err.println("invalid input");
        } else {
            if (s.equalsIgnoreCase("12:00:00am")) {
                result += "00:00:00";
            } else if (lastTwo.equalsIgnoreCase("am")) {
                result += s.substring(0, s.length() - 2);
            } else if (lastTwo.equalsIgnoreCase("pm")) {
                if (num<10){
                    if (check==1){
                        result += (num + 12) +":" + lastPortion;
                    }
                    if (check>1){
                        result += (num + 12)  + lastPortion;
                    }

                }else if (num>=10&&num<=12){
                    result += (num + 12) +":" + s.substring(3, s.length() - 2);
                }
            }
        }
        System.out.println(result);
    }
}












/*
if (num<0||num>12){
            System.err.println("invalid input");
        }else {
            if (s.equalsIgnoreCase("12:00:00am")){
                result+="00:00:00";
            }
            else if (lastTwo.equalsIgnoreCase("am")){
                result+=s.substring(0,s.length()-2);
            }
            else if (lastTwo.equalsIgnoreCase("pm")){

                result+=(num+12)+":"+s.substring(3,s.length()-2);
            }
        }
 */