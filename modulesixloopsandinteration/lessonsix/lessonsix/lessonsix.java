
/**
 ** Ibrahim Shahid
 * Date: 11/9/2024
 * North Carolina Virtual Public Schools
 * Description: loops to make cool character triangles
 * Difficulties: 
 * for loops can be used to make triangles and possibly other shapes
 */
import java.util.Scanner;

public class lessonsix {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // number rows
        System.out.println("number of rows");
        int rows = sc.nextInt();

        // what character?
        System.out.println("What character?");
        char character = sc.next().charAt(0);

        // Loop to repeat for the number of rows from scanner class
        for (int i = 1; i <= rows; i++) {

            
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // Print the character
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }

            // Move to the next line 
            System.out.println();
        }

        // Close 
        sc.close();
    }
}
/*
 * Sample output
 * number of rows
 * 5
 * What character?
 *  a
 * 
 *   a
    aa
   aaa
  aaaa
 aaaaa
 */