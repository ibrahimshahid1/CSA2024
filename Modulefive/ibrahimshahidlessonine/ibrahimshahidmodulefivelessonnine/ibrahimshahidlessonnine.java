/**
 ** Ibrahim Shahid
 * Date: 10.18.2024
 * North Carolina Virtual Public Schools
 * Description: example program for reading a .in file and doing simple operations on them like determing numbers less than or equal, or greater than 500
 * Difficulties:  I had a hard time like finding tutorials online about reading that datafile bc the video given in the lecture wasnt that clear
 * ghow to read files in java and use if else statements to determine certain things about that list/file
 */

import java.io.File;
import java.util.Scanner;

public class ibrahimshahidlessonnine {
    public static void main(String[] args) throws Exception {
        // File path
        String filePath = "C:\\\\Users\\\\Ibrah\\\\Documents\\\\GitHub\\\\CSA2024\\\\Modulefive\\\\ibrahimshahidlessonine\\\\ibrahimshahidmodulefivelessonnine\\\\ModuleFiveLessonNineAssignmentOneDatafile.in";

        int lessThan500 = 0; // integer for numbers that are less than 500 in the list of numbers that we have
        int greaterOrEqual500 = 0; // integer for numbers that are greater than or equal to 500 in the list of numbers that we have in our list
        int totalNumbers = 0; // the total amount of numbers we have in our list

        File file = new File(filePath);
        Scanner scanner = new Scanner(file); // scanner to read our file
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt(); //read the next consecutive integer in our file, and also make an integer variable named number that is assigned the next integer value in the lsit given by the scanner
            
            if (number < 500) { //if the number given by the scanner, then lessThan500 is incremented by 1, that means, that every time number is less than 500, lessThan500 is increased by 1
                lessThan500++;
            } else {
                greaterOrEqual500++; // if the number is not less than 500, then the greatororequal500 value is increased by 1, and this happends every time when another consecutive number is given.
            }
            
            totalNumbers++; //increment totalnumbers by 1 every time scanner gets a new integer.
        }

        
        scanner.close(); // close the scanner 
        
        // Displaying the results
        System.out.println("The number of numbers less than 500 is " + lessThan500); // print out the number of numers that are less than 500 and then add the integer lessthan500
        System.out.println("The number of numbers greater than or equal to 500 is " + greaterOrEqual500); //print out the numbers that are greater than or queal to 500 with the greaterorequal500 variable name
        System.out.println("The total number of numbers is " + totalNumbers); // print out the total number of numbers attached with the variable name totalnumbers
    }
}
/*
 * sample output
 * The number of numbers less than 500 is 263
    The number of numbers greater than or equal to 500 is 237
    The total number of numbers is 500
 */