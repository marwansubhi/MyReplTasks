package Repl.Tasks09;

public class Carpet {
    //do not change -- Start
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

   public Carpet(){
       this.width = 300;
       this.length = 300;
       this.totalPrice = 200;
       this.unitPrice = 0;

   }

   public Carpet(double width, double length, double unitPrice, boolean isPersian ){
       this.width = width;
       this.length = length;
       this.unitPrice = unitPrice;
       this.isPersian = isPersian;
       this.totalPrice =  (isPersian)? (width + length) * unitPrice +200:(width + length) * unitPrice;


   }



}

class CarpetObject {
    public static void main(String[] args) {
        Carpet c = new Carpet();
        System.out.println(c.totalPrice); //200.0
        Carpet c2 = new Carpet(20, 20, 2, false);
        System.out.println(c2.totalPrice);
        Carpet c3 = new Carpet(20,20,2,true);

        System.out.println(c3.totalPrice);


    }
}
