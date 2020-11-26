package Repl.Tasks06;

public class ValidateTask {
    public static void main(String[] args) {
//        boolean a = true;
//        int b = 10;
//        int c = b+1;
        System.out.println(validateTask(true,6,5));

    }
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){

        if (notEmpty && taskId == currentId+1) return true;
        else return false;
    }
}
