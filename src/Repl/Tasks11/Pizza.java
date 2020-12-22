package Repl.Tasks11;

public class Pizza {
    private String size;
    private int numOfCheese, numOfPepperoni, numOfHam;

    public Pizza(String size, int numOfCheese, int numOfPepperoni, int numOfHam) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;
        this.numOfHam = numOfHam;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheese() {
        return numOfCheese;
    }

    public void setNumOfCheese(int numOfCheese) {
        this.numOfCheese = numOfCheese;
    }

    public int getNumOfPepperoni() {
        return numOfPepperoni;
    }

    public void setNumOfPepperoni(int numOfPepperoni) {
        this.numOfPepperoni = numOfPepperoni;
    }

    public int getNumOfHam() {
        return numOfHam;
    }

    public void setNumOfHam(int numOfHam) {
        this.numOfHam = numOfHam;
    }

    public double calcCost() {
        double result = 0;

        if (size.equals("small")) {
            result += 10 + (2 * getNumOfCheese() + 2 * getNumOfHam() + 2 * getNumOfPepperoni());
        } else if (size.equals("medium")) {
            result += 12 + (2 * getNumOfCheese() + 2 * getNumOfHam() + 2 * getNumOfPepperoni());
        } else if (size.equals("large")) {
            result += 14 + (2 * getNumOfCheese() + 2 * getNumOfHam() + 2 * getNumOfPepperoni());
        }

        return result;
    }

    public String getDescription() {
        return size + " Pizza with " + getNumOfCheese() + " Cheese toppings, " + getNumOfPepperoni() +
                " Pepperoni toppings, and " + getNumOfHam() + " Ham toppings.\nTotal Price: " + calcCost();
    }
}

class PizzaObj{
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large",0,0,2);
        System.out.println(p1.getDescription());
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
A public method named getDescription() that returns a String
containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().

getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */

