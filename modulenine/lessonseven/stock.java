import java.util.ArrayList;
/**
 ** Ibrahim Shahid
 * Date: 12/31/2024
 * North Carolina Virtual Public Schools
 * Description: stock market algo
 * Difficulties:  i had a lot of hard time in terms of organizing the entire code project and also trying to implement other features within the program. i mainly used thinkjava2e and other online resources in order to help me complete this task
 * 
 */
class Stock {
    private String symbol;
    private ArrayList<Purchase> purchases;
    private double sellingPrice;


    private static class Purchase {
        int shares;
        double pricePerShare;

        Purchase(int shares, double pricePerShare) {
            this.shares = shares;
            this.pricePerShare = pricePerShare;
        }

        double getTotalCost() {
            return shares * pricePerShare;
        }
    }

    public Stock(String symbol) {
        this.symbol = symbol;
        this.purchases = new ArrayList<>();
    }

    
    public void addPurchase(int shares, double pricePerShare) {
        purchases.add(new Purchase(shares, pricePerShare));
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getTotalPurchaseAmount() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.getTotalCost();
        }
        return total;
    }


    public double getSellingAmount() {
        int totalShares = 0;
        for (Purchase purchase : purchases) {
            totalShares += purchase.shares;
        }
        return totalShares * sellingPrice;
    }

   
    public double getProfitOrLoss() {
        return getSellingAmount() - getTotalPurchaseAmount();
    }

    
    public String getSymbol() {
        return symbol;
    }
}
/*
 * expected output
 * Enter first stock symbol: AAPL
How many purchases did you make? 3
Purchase 1. How many shares and at what price/share? 100 152.74
Purchase 2. How many shares and at what price/share? 100 153.45
Purchase 3. How many shares and at what price/share? 100 150.56
Selling price: 147.50
Net Loss: $-1425.00

 */