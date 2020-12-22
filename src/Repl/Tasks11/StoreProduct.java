package Repl.Tasks11;

public class StoreProduct {
    public String label;
    public int price;
    public String category;
    public boolean hasExpiration;
    public int stock;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock) {
        this(label,price,"misc",false,stock);

    }

    public StoreProduct(String label, int price) {
        this(label,price,0);

    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this(label, price,category,hasExpiration,0);

    }

    public void expired(boolean hasExpired) {
        if (hasExpired) {
            stock = 0;
        }
    }

    public boolean sale(int quantity) {
        if (stock > quantity) {
            stock -= quantity;
            return true;
        } else return false;
    }

    public double getDiscountedPrice(double discount) {


        return (price - discount * price);
    }
}

class StoreObjects {
    public static void main(String[] args) {
        StoreProduct store = new StoreProduct("Amazon", 80, 800);

        System.out.println(store.getDiscountedPrice(0.4));
    }
}
/*
1. Complete the StoreProduct.java class:

Include the following class variables:
* label
* price (as an integer)
* category
* hasExpiration (as a boolean)
* stock (represents how many the store has available)
All class variables should be declared case sensitive

Write four constructors:
* The main constructor
* A secondary constructor that does not have a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
* A secondary constructor that just does not have stock

2. Test your code with the Main.java class:
Create several StoreProduct objects using all Constructors and print their fields/states to make sure it's correct.

3. Include the following methods:

* public void expired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

* public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough,
 then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

* public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) and return that number.
 */