/**
 ** Ibrahim Shahid
 * Date: 12/21/2024
 * North Carolina Virtual Public Schools
 * Description: Coin Flipping Algo
 * Difficulties:  I had some struggles doing object oriented programming and stuff so i uesd the ThinkJava2e textbook to help me
 * 
 */
import java.util.Scanner;

public class CoinTester {
    public static void main(String[] args) {
    
        Coin coin1 = new Coin(); // objects to intialize coins
        Coin coin2 = new Coin(); 
        Coin coin3 = new Coin();

       
        int totalFlips = 0; // sets an integer value totalFlips with a value of zero



        do { // this loop makes the program do the code within do as long as  (!allCoinsMatch(coin1, coin2, coin3)) is not true (keep on flipping until all the coins output (heads or tails) are the same
           
            totalFlips++;

            
            coin1.flip();
            coin2.flip();
            coin3.flip();

           
            System.out.println("coin 1 is on " + coin1.getSide() +  // print out the status of each of the coins, coin 1 is on coin1.getside(), which basically tells us that coin 1 is on either heasd or tails, which is the value outputted by the method coint1.getside(), this is done for all the coins, 1-3.
                               ", coin 2 is on " + coin2.getSide() + 
                               ", coin 3 is on " + coin3.getSide());

            
        } while (!allCoinsMatch(coin1, coin2, coin3)); // 
 
    
        System.out.println("The coins were flipped a total of " + totalFlips + " times."); // outputs how many times the coins were flipped
    }

  
    private static boolean allCoinsMatch(Coin c1, Coin c2, Coin c3) {
        return c1.getSide().equals(c2.getSide()) && c2.getSide().equals(c3.getSide());
    }
}
/*
 * expected output
 * coin 1 is on tails, coin 2 is on heads, coin 3 is on heads
coin 1 is on heads, coin 2 is on tails, coin 3 is on tails
coin 1 is on heads, coin 2 is on tails, coin 3 is on tails
coin 1 is on tails, coin 2 is on heads, coin 3 is on tails
coin 1 is on heads, coin 2 is on heads, coin 3 is on tails
coin 1 is on heads, coin 2 is on heads, coin 3 is on heads
The coins were flipped a total of 6 times.
 */