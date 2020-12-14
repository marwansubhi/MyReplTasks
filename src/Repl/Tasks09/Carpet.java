package Repl.Tasks09;

public class Carpet {
    //do not change -- Start
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

    public Carpet() {
        totalPrice = 200;

    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {


        this.totalPrice = (width + length) * unitPrice;
        if (isPersian)totalPrice+=200;

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
