package Repl.Tasks08;

public class Atts{
    public String name, color;
    public int amount;




    public String asString() {
        return
                "name: " + name +
                " color: " + color +
                " amount: " + amount
                ;
    }
}
class AttsObject{
    public static void main(String[] args) {
        Atts a = new Atts();
        a.name = "table";
        a.color = "brown";
        a.amount = 1;

        System.out.println(a.asString());
    }
}
