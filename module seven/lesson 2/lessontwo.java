/*
 * Ibrahim Shahid
 * North Carolina Virtual Public Schools
 * Description: kb reader for a string and string scrammbler
 * No major difficulties
 * Date: 11/20/2025
 * You can make cool stuff with strings and loops
 */
import java.util.Scanner;

public class lessontwo { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            // Prompt the user for a string
            System.out.print("What string would you like to enter: ");
            String userInput = scanner.nextLine();

            // Print the entered string
            System.out.println("You entered: " + userInput);

            // Reverse the string
            String reversedString = new StringBuilder(userInput).reverse().toString();

            // Print the reversed string
            System.out.println("The string reversed is: " + reversedString);

            // Print the reversed string in uppercase
            System.out.println("The reversed string in capital letters is: " + reversedString.toUpperCase());

            // Ask if the user wants to enter another string
            System.out.print("Would you like to enter another string (Y/N)? ");
            choice = scanner.nextLine().trim().toUpperCase();

        } while (choice.equals("Y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
/*
 * which string would you like to enter : Bird
 * You entered: Bird
 * The string reveresd is: drib
 * The Reversed string in capital eltters is DRIB
 * Would you like to enter another string (Y/N)?
 */
