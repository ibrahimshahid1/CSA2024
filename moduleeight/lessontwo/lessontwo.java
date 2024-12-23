/*
 * ibrahim shahid
 * north caorlina virutal public schools
 * using custom methods to make budget calculators for venues and events and stuff
 * no major difficulties, it just took a long time to like develop and everything
 * 11/26/2024
 */

import java.util.Scanner;
public class lessontwo{
    public static double calculateCapacityUsage(int ticketsSold, int venueCapacity){
        return(double) ticketsSold/ venueCapacity;

    }
    public static double calculateSales(int ticketsSold, double ticketPrice){
        return ticketsSold * ticketPrice;

    }
    public static double calculateLostRevenue(int totalTicketsToSell, int totalTicketsSold, double lowestTicketPrice) {
        int unsoldTickets = totalTicketsToSell - totalTicketsSold;
        return unsoldTickets * lowestTicketPrice;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("What is the capacity of the venue: ");
        int venueCapacity = scanner.nextInt();

        System.out.print("What is the price per ticket sold by phone: ");
        double phoneTicketPrice = scanner.nextDouble();

        System.out.print("What is the number of phone sales: ");
        int phoneSales = scanner.nextInt();

        System.out.print("What is the price per ticket sold at the venue: ");
        double venueTicketPrice = scanner.nextDouble();

        System.out.print("What is the number of venue sales: ");
        int venueSales = scanner.nextInt();

        System.out.print("What is the number of tickets to sell: ");
        int totalTicketsToSell = scanner.nextInt();

        // Calculations
        int totalTicketsSold = phoneSales + venueSales;
        double percentCapacityUsage = calculateCapacityUsage(totalTicketsSold, venueCapacity) * 100;
        double phoneSalesRevenue = calculateSales(phoneSales, phoneTicketPrice);
        double venueSalesRevenue = calculateSales(venueSales, venueTicketPrice);
        double totalRevenue = phoneSalesRevenue + venueSalesRevenue;
        double lostRevenue = calculateLostRevenue(totalTicketsToSell, totalTicketsSold, Math.min(phoneTicketPrice, venueTicketPrice));

        // Output
        System.out.println("\n--- Sales Report ---");
        System.out.printf("Percent capacity usage: %.2f%%\n", percentCapacityUsage);
        System.out.printf("Phone sales: $%.2f\n", phoneSalesRevenue);
        System.out.printf("Venue sales: $%.2f\n", venueSalesRevenue);
        System.out.printf("Total sales: $%.2f\n", totalRevenue);
        System.out.printf("Lost revenue based on lowest price ticket: $%.2f\n", lostRevenue);

        scanner.close();
    }
}
/*
 * sample output
 * What is the capacity of the venue: 54
What is the price per ticket sold by phone: 32
What is the number of phone sales: 5
What is the price per ticket sold at the venue: 21
What is the number of venue sales: 5
What is the number of tickets to sell: 3

--- Sales Report ---
Percent capacity usage: 18.52%
Phone sales: $160.00
Venue sales: $105.00
Total sales: $265.00
Lost revenue based on lowest price ticket: $-147.00
 */