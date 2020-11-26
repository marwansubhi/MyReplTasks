package Repl.Tasks05;

public class SimplePrintPattern {
    public static void main(String[] args) {
        printHollowRect();
    }
    public static void printHollowRect(){

        for (int i = 0; i<6;i++){
            if (i<=4){
                System.out.print("*");
            }if (i==4){
                for (int j =1; j<=3;j++){
                    System.out.println();
                    System.out.print("*   *");
                }
            }
        }
        System.out.println();
            for (int k=0;k<=4;k++){
                System.out.print("*");
            }
    }
}
