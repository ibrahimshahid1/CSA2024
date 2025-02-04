/**
 ** Ibrahim Shahid
 * Date: 12/31/2024
 * North Carolina Virtual Public Schools
 * Description: stock market algo
 * Difficulties:  i had a lot of hard time in terms of organizing the entire code project and also trying to implement other features within the program. i mainly used thinkjava2e and other online resources in order to help me complete this task
 * 
 */
import java.util.Scanner;

public class stocktester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter first stock symbol: ");
        String firstStockSymbol = scanner.nextLine();
        Stock firstStock = new Stock(firstStockSymbol);

        processStock(firstStock, scanner);

        
        System.out.print("\nEnter second stock symbol: ");
        String secondStockSymbol = scanner.nextLine();
        Stock secondStock = new Stock(secondStockSymbol);

        processStock(secondStock, scanner);

        scanner.close();
    }

    private static void processStock(Stock stock, Scanner scanner) {
        System.out.print("How many purchases did you make? ");
        int numberOfPurchases = scanner.nextInt();

        for (int i = 1; i <= numberOfPurchases; i++) {
            System.out.print("Purchase " + i + ". How many shares and at what price/share? ");
            int shares = scanner.nextInt();
            double pricePerShare = scanner.nextDouble();
            stock.addPurchase(shares, pricePerShare);
        }

        System.out.print("Selling price: ");
        double sellingPrice = scanner.nextDouble();
        stock.setSellingPrice(sellingPrice);

        double profitOrLoss = stock.getProfitOrLoss();
        if (profitOrLoss >= 0) {
            System.out.printf("Net Profit: $%.2f%n", profitOrLoss);
        } else {
            System.out.printf("Net Loss: $%.2f%n", profitOrLoss);
        }
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