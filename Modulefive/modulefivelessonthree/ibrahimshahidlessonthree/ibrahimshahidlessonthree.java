/**
 * Write a description of class ibrahimshahidlessonthree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class ibrahimshahidlessonthree {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your grade: ");
        int theGrade = kbReader.nextInt();
        
        if (theGrade >= 90) {
            System.out.println("You made an A");
        }
        else if (theGrade >= 80)
        {
            System.out.println("You made a B");
            
        }
        else if(theGrade >=70)
        {
            System.out.println("You made a C.");
            
        }
        else{
            System.out.println("You failed buddy.");
        }
        // Close the scanner to avoid resource leak
    }
}
