package Repl.Tasks10;

public class Pizza {
    private String size;
    private int numOfCheeseToppings;
    private int numOfPepperoniToppings;
    private int numOfHamToppings;

    public Pizza(String size, int numOfCheeseToppings, int numOfPepperoniToppings, int numOfHamToppings) {
        this.size = size;
        this.numOfCheeseToppings = numOfCheeseToppings;
        this.numOfPepperoniToppings = numOfPepperoniToppings;
        this.numOfHamToppings = numOfHamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheeseToppings() {
        return numOfCheeseToppings;
    }

    public void setNumOfCheeseToppings(int numOfCheeseToppings) {
        this.numOfCheeseToppings = numOfCheeseToppings;
    }

    public int getNumOfPepperoniToppings() {
        return numOfPepperoniToppings;
    }

    public void setNumOfPepperoniToppings(int numOfPepperoniToppings) {
        this.numOfPepperoniToppings = numOfPepperoniToppings;
    }

    public int getNumOfHamToppings() {
        return numOfHamToppings;
    }

    public void setNumOfHamToppings(int numOfHamToppings) {
        this.numOfHamToppings = numOfHamToppings;
    }

    public double calcCost() {
        double result = 0;
        if (size.equalsIgnoreCase("small")){
            result += 10 + 2*getNumOfCheeseToppings()+2*getNumOfPepperoniToppings()+2*getNumOfHamToppings() ;
        }
        else if (size.equalsIgnoreCase("medium")) {
            result += 12 + 2*getNumOfCheeseToppings()+2*getNumOfPepperoniToppings()+2*getNumOfHamToppings() ;
        }
        else if (size.equalsIgnoreCase("large")){
            result += 14 +  2*getNumOfCheeseToppings()+2*getNumOfPepperoniToppings()+2*getNumOfHamToppings() ;
        }

        return result;
    }

    public String getDescription(){
        return size+" Pizza with "+getNumOfCheeseToppings()+" Cheese toppings, "+getNumOfPepperoniToppings()+" Pepperoni toppings, and "+getNumOfHamToppings()+" Ham toppings\n"+
                "Total price: "+calcCost();
    }

}
/*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size,
quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */

class PizzaObj{
    public static void main(String[] args) {
        Pizza pizza = new Pizza("small",1,1,1);
        System.out.println(pizza.getDescription());
    }
}