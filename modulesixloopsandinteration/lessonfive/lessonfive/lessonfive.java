import java.util.Scanner;
import java.util.Random;
public class lessonfive{
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100) +1;// generate the random number that we have to guess

        
        
        double payout = 2;// intital payout
        double guessCost = 0.25; //cost for each guess
        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Game");
        System.out.println("You start with 2 bucks, and each guess is $0.25");
    
        int userGuess = 0;

        do{
            System.out.printf("Payout is %.2f. Enter your guess:", payout);
            userGuess  = scanner.nextInt(); //take the users guess

            if(userGuess == randomNumber){
                System.out.printf("Congratulations! Computers number is %d. This guess cost you $0.25", 
                                  randomNumber, 2.00 - payout + guessCost);
                                 
            break;
            
         } else if(userGuess > randomNumber){
                System.out.printf("Your guess is too high.This guess costed you $0.25",
                                randomNumber, 2.00 - payout + guessCost);
                                


            }
            else{
                System.out.printf("Your guess was too low. This guess costed you $0.25",
                randomNumber, 2.00  - payout +guessCost);

            }

            payout -= guessCost;

            if(payout<=0){
                System.out.println("Sorry youve spent all of your money on a game that you had a 1/100 probability of winnig. Keep in mind, that there is no reward. Game Over.");
                break;
            }
        }
        while(true);

        scanner.close();
}
}