package Repl.Tasks06;

public class ProfitOrLoss {
    public static void main(String[] args) {
        int buy = 200;
        int sell = 200;
        System.out.println(c_profits(buy, sell));

    }
    public static String c_profits (int buyPrice,int sellPrice){
        String result = "";
        if (sellPrice > buyPrice) result += "profit";
        else if (sellPrice < buyPrice) result += "loss";
        else result+="no loss";
        return result;
    }
}
