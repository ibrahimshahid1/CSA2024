/**
 ** Ibrahim Shahid
 * Date: 10/11/2024
 * North Carolina Virtual Public Schools
 * Description: java leap year detector
 * Difficulties: no major difficulatuise
 * you can use loops and scanner to make some pretty cool stuff like detecting if said year is a leap year or not
 */
import java.util.Scanner;
public class lessoneight{
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = scanner.nextInt();
        int d = 4;
       System.out.println("The year you entered is " +year + ".");
       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // if the year % 4 is zero, AND the year moduleo 100 isnt 0, OR (||) the year module 400 is 0, then do the code inside, 
        //otherwase /(else) do the stuff listed in else
        System.out.println("The year " + year + " is a leap year.");
    } else {
        System.out.println("The year " + year + " is not a leap year.");
    }
       }
    }

/*
 * sample output
 * Enter Year
21
The year you entered is 21.
The year 21 is not a leap year.
PS C:\Users\Ibrah> 
 */
