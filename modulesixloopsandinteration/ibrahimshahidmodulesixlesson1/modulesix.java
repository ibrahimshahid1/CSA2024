    
/**
 ** Ibrahim Shahid
 * Date: 11/9/2024
 * North Carolina Virtual Public Schools
 * Description: Java total cost aggregate using while loops
 * Difficulties: no difficulties besides getting the filepath right which is concerning
 * While loops can be used to perform operations on datasets like finding the average of a set of numbers
 */
import java.io.FileReader;
import java.util.Scanner;
public class modulesix
{
    public static void main(String[] args) {
        double totalCost = 0;
        String filepath = "C:\\Users\\Ibrah\\Documents\\GitHub\\CSA2024\\modulesixloopsandinteration\\ibrahimshahidmodulesix\\data.in";
        int itemCount = 0;
        Scanner fileReader = new Scanner(new FileReader(filepath));
        System.out.println("Item Costs");
        while(fileReader.hasNextLine()){
            double cost = fileReader.nextDouble();
            if (cost==0){
                break;
            }
            System.out.println(cost);  
            totalCost += cost;         
            itemCount++;    
        }
        fileReader.close();
        double averageCost = (itemCount > 0) ? (double) totalCost / itemCount : 0;
        System.out.println("\nTotal Cost: "+ totalCost);
        System.out.println("Number of Item" + itemCount);
        System.out.println("average cost" + averageCost);

    }
   
}
/*
 * sample output
 * Item Costs:
14.99
39.99
69.95
74.95
59.95
49.95
75.50
14.50
29.95
29.95

Total Cost: 459.72
Number of Items: 10
Average Cost: 45.97

 */
