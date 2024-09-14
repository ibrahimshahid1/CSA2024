/**
 ** Ibrahim Shahid
 * Date: 9/14/2024
 * North Carolina Virtual Public Schools
 * Description: Odd/Even Number Identifier using modulo and java divison with remainder example
 * Difficulties:  No major hurdles faced towards completing the task
 * You can you modulo to identify odd and even numbers in java
 */
public class IbrahimShahidLessonThreeTutoirial
{
    public static void main(String[]args){
    int quotient, remainder; //variable declaration

quotient = 19 / 3; //integer division, 19/3. In Integer division the fractional part is discarded so 19/3 in integer division equals 6. 6 is stored in the quotient variable.

remainder = 19 % 3; //Calculates remainder when 19 is divided by 3 using % (modulo). 19%3 = 1 since the remainder when 19/3 is 1. 1 is stored in the remainder variable.

System.out.println("The quotient : " + quotient ); //prints out "the quotient" and the value of variable quotient together.

System.out.println("The remainder: " + remainder ); //prints out "the remainder" and the value of remainder together.

System.out.println("The original : " + 

(quotient*3 + remainder) );// prints "the original" and the value of quotient times 3 plus the remainder.
// start of code for odd/even number detector
int x = 10; // pick any number here, for this example, we chose 10

        if (x % 2 == 0) { 
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

/* we use modulo in this example to determine if x is even or odd. The code checks if x is divisible by 2 without a remainder, x%2 calcululates the remainder when x is divided by 2.
If the remainder is 0, that means x is even, if not (else) then its odd.
*/
}

}
/*
     *Sample output:
     *The quotient : 6
     *The remainder: 1
     *The orignial: 19
     *10 is even
*/
    
