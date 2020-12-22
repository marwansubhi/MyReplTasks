package Repl.Tasks09;

public class Telephone {
   public String number;

   public static int quantity = 250;
   public static double total = 15658.92;

   public void setNumber (String number){
       this.number = number;

   }

   public String getNumber(){
      return number;
   }



}
class main{
    public static void main(String[] args) {

        Telephone telephone = new Telephone();
        telephone.setNumber("832-299-0295");
        telephone.getNumber();
    }
}