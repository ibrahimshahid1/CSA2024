/*
 * ibrahim shahid
 * north caorlina virtual public schools
 * 11/26/2024
 * using methods other than the main one to make a mileage calculator
 * it took me a while getting used to making new methods, otherwhise its fine
 */

import java.util.Scanner;

public class lessonone {

    // Convert miles to kilometers
    public static double milesToKM(double miles) {
        return miles * 1.60934;
    }


    public static double kmToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    
    public static double milesToYards(double miles) {
        return miles * 1760;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose 1 for miles, 2 for km, 3 for yards, or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.print("Enter your mileage: ");
            double input = scanner.nextDouble();

            if (choice == 1) {
                System.out.println("You entered " + input + " miles.");
                System.out.println("This is " + milesToKM(input) + " km.");
                System.out.println("This is " + milesToYards(input) + " yards.");
            } else if (choice == 2) {
                System.out.println("You entered " + input + " km.");
                System.out.println("This is " + kmToMiles(input) + " miles.");
                System.out.println("This is " + milesToYards(kmToMiles(input)) + " yards.");
            } else if (choice == 3) {
                double milesFromYards = input / 1760;
                System.out.println("You entered " + input + " yards.");
                System.out.println("This is " + milesFromYards + " miles.");
                System.out.println("This is " + milesToKM(milesFromYards) + " km.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
/*
sample output
 * Choose 1 for miles, 2 for km, 3 for yards, or 0 to exit: 
3
Enter your mileage: 55
You entered 55.0 yards.
This is 0.03125 miles.
This is 0.050291875 km.

Choose 1 for m
 */
