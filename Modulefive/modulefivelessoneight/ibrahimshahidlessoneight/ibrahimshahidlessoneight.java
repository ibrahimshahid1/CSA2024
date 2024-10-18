
/**
 * Write a description of class ibrahimshahidlessoneight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class ibrahimshahidlessoneight
{
    public static void main(String[] args) throws IOException
     {
        Scanner sf = new Scanner(new File("C:\\Users\\Ibrah\\Documents\\GitHub\\CSA2024\\Modulefive\\modulefivelessoneight\\ibrahimshahidlessoneight\\myData.in") ); 
        int maxIndx = -1;
        String text[] = new String[100];
        while(sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
            //System.out.println(text(maxIndx));
            
        } 
        sf.close();
        String answer = "";
        int sum = 0;
        for(int j = 0; j <= maxIndx; j++)
        {
            Scanner sc = new Scanner(text[j]);
            sum = 0;
            answer = "";
            while(sc.hasNext()){
                int i = sc.nextInt();
                answer = answer + "+" + 1;
                sum = sum + i;

            }
            answer = answer+"="+ sum;
            System.out.println(answer);
            

        }

      }
}
