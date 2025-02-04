import java.util.Scanner;
/**
 ** Ibrahim Shahid
 * Date: 12/23/2024
 * North Carolina Virtual Public Schools
 * Description: Address Formatting algo
 * Difficulties:  I had some struggles doing object oriented programming and stuff so i uesd the ThinkJava2e textbook to help me
 * 
 */
public class addresstester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an address with a street number or post office box number, city, state, and zip.");

        try {
            // Input for street
            System.out.print("Street: "); // each system.out.println statement asks the user for a specifc part like the street name, city or state
            String street = scanner.nextLine();

            // input for city
            System.out.print("City: ");
            String city = scanner.nextLine();

            // input for state
            System.out.print("State (2-letter abbreviation): ");
            String state = scanner.nextLine();

            // input for zip
            System.out.print("ZIP (5 digits): ");
            String zip = scanner.nextLine();

            // create address object
            address address = new address(street, city, state, zip); 

            // print the full address
            System.out.println("\nFormatted Address:");
            address.printFullAddress();

            System.out.println("\nAddress Details:");
            address.printAddressDetails();

        } catch (IllegalArgumentException e) { //error handling catch prints error message and finally ensures the scanner object closes, just for fun
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*
 * expected output

Address Details:
************
************
**
*****
( i had to blur this out bc i put everything for this course on github)
 */