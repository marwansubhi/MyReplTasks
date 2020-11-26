package Repl.Tasks06;

public class GetDuplicates {
    public static void main(String[] args) {
        String [] arr = {"1","2","aa","1"};
        System.out.println(getDup(arr));


    }
    public static int getDup(String[] r){
        int count=0;
        for (int j =0; j<r.length;j++){
            String n = r[j];
            int k = 0;
            for (int i = 0; i<r.length;i++){
                if (r[i].equals(n))k++;
            }
            if (k>1)count++;
        }
       return count;


    }
}
