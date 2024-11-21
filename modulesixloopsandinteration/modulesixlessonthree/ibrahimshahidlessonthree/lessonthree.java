/**
 ** Ibrahim Shahid
 * Date: 11/16/2024
 * North Carolina Virtual Public Schools
 * Description: do while loops and for loops in java 
 * using do while loops and for loops in java, and also kb reader to read in number and list numbers between the intervals (start) and (end) and then find the average
 */
import java.util.Scanner;
public class lessonthree {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        for (int i =0; i<5; i++){
            System.out.println("Run#" + (i +1));

            System.out.print("enter Starting value:");
            int start = scanner.nextInt();

            System.out.println("Enter Ending Value");
            int end = scanner.nextInt();

            //initialize variables

            int sum =0;
            int count =0;
            int current = start;
            System.out.println("Values between" + start+ "and" + end + ":");
            do{
                System.out.println(current); // Print current value
                sum += current; // Add to sum
                count++; // Increment count
                current++; // Move to the next value

            } while(current <= end);
            System.out.println("Sum of the numbers " + start + ".." + end + " is " + sum);
            System.out.printf("The average of the numbers %d..%d is %.2f\n", start, end, (double) sum / count);
            System.out.println();

        }
        
        scanner.close();


    }



}
/*
 * sample output
 * Run #1
Enter Starting Value: 22
Enter Ending Value: 25
Values between 22 and 25:
22
23
24
25
Sum of the numbers 22..25 is 94
The average of the numbers 22..25 is 23.50

 */