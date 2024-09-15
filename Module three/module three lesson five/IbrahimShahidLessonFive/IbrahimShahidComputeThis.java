

/**
 ** Ibrahim Shahid
 * Date: 9/15/2024
 * North Carolina Virtual Public Schools
 * Description: Math with Java Examples/Practice
 * Difficulties:  No major difficulties,i had a little trouble with the x raised to the power of z part
 * in the beggining, but i got it right eventually.
 * how to essentially make meaniningful programs using various math concepts like square root and abs
 */
public class IbrahimShahidComputeThis
{
    public static void main (String[]args){
        int x = 3;
        int y = -5;
        int z = 0;
        double w = 17.5;
        z = Math.abs(y);
        System.out.println("w = " + w + ", x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("The absolute value of y is " + z);
        double sqrtW = Math.sqrt(w);
        System.out.println("The square root of w is " + sqrtW);
        double xPowerZ = Math.pow(x, z);
        System.out.println("x raised to the power of z is " + xPowerZ);
        int MaxY = Math.max(x,y);
        System.out.println(MaxY + " is the max of x and y");
        int minXY = Math.min(x, y);
        System.out.println(minXY + " is the min of x and y");
        long intW = Math.round(w);
        System.out.println("If you round w you get " + intW);
        double floorW = Math.floor(w);
        System.out.println("The floor value of w is " + floorW);
        double ceilW = Math.ceil(w);
        System.out.println("The ceiling value of w is " + ceilW);
        int randomNum = 1 + (int) (Math.random() * 10);
        System.out.println("A random number between 1 and 10 is: " + randomNum);
        
        

        
        
        
        
        
        
        
    }
}

/*
 * Sample Outputs
 *  
 *  w = 17.5, x = 3, y = -5, z = 5
The absolute value of y is 5
The square root of w is 4.183300132670378
x raised to the power of z is 243.0
3 is the max of x and y
-5 is the min of x and y
If you round w you get 18
The floor value of w is 17.0
The ceiling value of w is 18.0
A random number between 1 and 10 is: 2
 */
