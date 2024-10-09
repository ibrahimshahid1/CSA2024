/**
 ** Ibrahim Shahid
 * Date: 10/8/2024
 * North Carolina Virtual Public Schools
 * Description: Java Basic Logic with if else statements
 * Difficulties: No major difficulties besides knowing where to put brackets and stuff
 *You can make abstract concepts and ideas with if then statements
 */
import java.io.*;
import java.util.*;
public class ibrahimshahidlesson2
{
    public static void main(String args[]){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your grade level?");
        int myGrade = kbReader.nextInt();
        
        if(myGrade >=70)
        {
            System.out.println("you passed!");
            
        }
        else
        {
            System.out.println("Better luck next time!");
        }
        
    }
}
/*
 * Outputs depend on the number inputted, if the number is above 70, then it will output congratulations, you passed, and if your grade is below 70, then it will display, better luck next time.
 */
