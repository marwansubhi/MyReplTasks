package Repl.Tasks04;

import java.util.Arrays;

public class ArraysCopyCertainValues {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(getWithE(numbers)));
    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

//        String getWithE = "";
//        String [] fewValues;
//        for (int i =0; i<= arr.length-1;i++){
//            if (arr[i].toLowerCase().contains("e")){
//                getWithE+=arr[i]+" ";
//            }
//        } fewValues =getWithE.split(" ");
        //********************

        String hasE = "";
        String [] fewValues;
        for (int i =0; i<= arr.length-1;i++){
            if (arr[i].toLowerCase().contains("e")){
                hasE+=arr[i]+" ";
            }
        } fewValues =hasE.split(" ");



        //***************************************************
//        String getWithE = "";
//
//        for(String each : arr) {
//
//            if(each.toLowerCase().contains("e")) {
//                getWithE += each + " ";
//            }
//
//        }
//        System.out.println(getWithE);
//
//        String[] fewValues = getWithE.split(" ");
        //***************************************************



        //YOUR CODE ENDS HERE -----------------------


        return fewValues;
    }
}