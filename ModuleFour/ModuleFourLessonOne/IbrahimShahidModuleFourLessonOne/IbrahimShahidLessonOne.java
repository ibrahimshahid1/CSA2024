/**
 ** Ibrahim Shahid
 * Date: 9/17/2024
 * North Carolina Virtual Public Schools
 * Description: Java keyboard reader for integers, booleans, ints, strings and multi line strings
 * Difficulties:One major difficulty that i cant solve, whenever i try to run all of them together, it doesnt work and only gives my the integer part, it only works when i compile it/run it step by step, like kb reader for string, then for integer, then for double
 * You can use external java libraries to do some really cool stuff
 */
import java.io.*;
import java.util.*;

public class IbrahimShahidLessonOne {
    public static void main(String[] args) {
        // Scanner for integers
        Scanner kbReader = new Scanner(System.in);
        
        // Prompting the user to enter an integer
        System.out.print("Enter your integer here. ");
        
        // Read the integer input
        int i = kbReader.nextInt();
        
        // Multiply the integer by 3 and print the result
        System.out.println(3 * i);
        //doubles
        System.out.print("Enter your doubles here");
        double d = kbReader.nextDouble();
        double dd = kbReader.nextDouble();
        System.out.println(d);
        //strings
        System.out.print("Enter your String here");
        String s = kbReader.next();
        System.out.println("This is the first part of the String,..." +s);
        s = kbReader.next();
        System.out.println("This is the next part of the String..."+s);
        //multi lines
        
        System.out.print("enter your string here.");
        String m = kbReader.nextLine();
        System.out.println(m);
        
        
    
    }
    
}
/*
 *Expected output
 *Enter your integers here ___
 *Enter your Doubles here ____
 *Enter your Strings here____
 *This is the first part of the string
 *This is the next part of the string
 *enter your your string here___
 */

