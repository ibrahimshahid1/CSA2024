/**
 ** Ibrahim Shahid
 * Date: 10/11/2024
 * North Carolina Virtual Public Schools
 * Description: Java calculator for linear equations
 * Difficulties:no major difficulaties except that i had to review the scanner calss notes
 * you can make cool calculators and stuff with java
 */

import java.io.*;
import java.util.*;

public class ibrahimshahidlesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read A and B from the user
        System.out.print("Enter coefficient A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter constant B: ");
        double B = scanner.nextDouble();

        // Solve the equation if both a and b are 0
        if (A == 0 && B == 0) {
            // if a and b are both zero, inf sol
            System.out.println("The equation has infinitely many solutions.");
        } else if (A == 0 && B != 0) {
            // if a is 0 and b isnt, then the equation has no solution
            System.out.println("The equation has no solution.");
        } else {
            // Case 3: if a isnt 0, then we can solve for x
            double x = -B / A;
            System.out.println("The solution is x = " + x);
        }

        scanner.close();
    }
}
/*
 * sample output
 * enter coefficent a
 * enter cosntant b
 * the solution is x = __
 */


