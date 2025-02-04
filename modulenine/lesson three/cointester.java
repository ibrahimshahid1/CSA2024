 import java.util.Scanner;

public class cointester {
    public static void main(String[] args) {
        // Create three Coin objects
        coin coin1 = new coin();
        coin coin2 = new coin();
        coin coin3 = new coin();

        // We'll track the number of flips
        int totalFlips = 0;

        // We keep flipping until all 3 coins match
        // Start with do-while or while loop logic

        // We will keep flipping *all* coins until all sides are the same.
        // That means coin1.getSide() == coin2.getSide() == coin3.getSide()

        do {
            // Increment flip count
            totalFlips++;

            // Flip each coin
            coin1.flip();
            coin2.flip();
            coin3.flip();

            // Print the result of this flip
            System.out.println("coin 1 is on " + coin1.getSide() + 
                               ", coin 2 is on " + coin2.getSide() + 
                               ", coin 3 is on " + coin3.getSide());

            // Continue flipping while they are NOT all the same
        } while (!allCoinsMatch(coin1, coin2, coin3));

        // Once the loop ends, we have all coins on the same side
        System.out.println("The coins were flipped a total of " + totalFlips + " times.");
    }

    // Helper method to check if all 3 coins are the same side
    private static boolean allCoinsMatch(Coin c1, Coin c2, Coin c3) {
        return c1.getSide().equals(c2.getSide()) && c2.getSide().equals(c3.getSide());
    }
}
 {
    
}
