
/**
 ** Ibrahim Shahid
 * Date: 9/14/2024
 * North Carolina Virtual Public Schools
 * Description: Tiled Area of Swimming Pool With Island in the Middle Calculator
 * Difficulties:  No major difficulties, its easy math
 * how to essentially make meaniningful programs using math with java
 */
public class IbrahimShahidlesson4
{
    public static void main (String[]args){
        // Declare variables
        double poolDiameter = 8.32;
        double islandDiameter = 1.91;
        double poolRadius;
        double islandRadius;
        double poolArea;
        double islandArea;
        double tileArea;
        final double PI = 3.1415;

        // Calculations
        poolRadius = poolDiameter / 2.0;
        islandRadius = islandDiameter / 2.0;
        poolArea = PI * poolRadius * poolRadius;
        islandArea = PI * islandRadius * islandRadius;
        tileArea = poolArea - islandArea;

        // Output using System.out.println
        System.out.println("A resistance pool with a diameter of " + poolDiameter + " meters that contains a circular island of " + islandDiameter + " meters has " + tileArea + " square meters that needs tile.");        
        
}
}

/**
 * sample output: A resistance pool with a diameter of 8.32 meters that contains a circular island of 1.91 meters has 51.50041586250001 square meters that needs tile.
 * 
 * 
 */
