package Repl.Tasks09;

public class Stock {
    public String tickerSymbol, companyName;
    public int totalShares, price;
    public double percentChange;
    public long marketCap;


    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares * price;
    }

    public void adjustPrice(int value) {
        percentChange = (double) value / (double) price;
        price += value;
        marketCap = totalShares * price;

    }

    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\nCompany: " + companyName + "\nCurrent Price: $" + price + "(" + percentChange + "%)\nMarket Cap: $" + marketCap;

    }

}

class StockObj{
    public static void main(String[] args) {

        Stock stock = new Stock("Goog","Google, Inc",850,25);
        System.out.println(stock);
    }
}