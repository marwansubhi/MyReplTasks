package Repl.Tasks03;

public class UtopianTree {
    public static void main(String[] args) {
        for (int i = 1,j=1, n=2; i<=10; i++,n++){
            if (i>0&&i<=3){
                System.out.println("year "+i+" - growth "+j+" cm\ntree size: "+i+"cm");
            }
            if (i>3&&i<=10){ j=2;
                System.out.println("year "+i+" - growth "+ j +" cm\ntree size: "+ n +"cm");n++;
            }
        }
    }
}
