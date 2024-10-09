
/**
 ** Ibrahim Shahid
 * Date: 10/8/2024
 * North Carolina Virtual Public Schools
 * Description:  Boolean testing for equality,  Boolean AND,  Boolean OR 
 * Difficulties:  No major hurdles faced towards completing the task
 * Boolean arguments
 */
public class IbrahimShahidLesson1
{
    public static void main(String args[]){
        int x = 37;
        int y = 49;
        int z = 37;
        boolean a = (x>y); // boolean testing for equality
        System.out.println(a); // print out boolean testing for equality
        boolean b = !(x<y)&& (x==z); //Boolean AND
        System.out.println(b); //print boolean AND
        boolean c  = (x>y) || (x<z); // boolean OR
        System.out.println(c); //print out boolean OR
        boolean d = true || false && false; //Opearaotr precendence
        System.out.println(d); //print out example for operator precedence
        
    }
}
/*
 * Example output
 * false
 * false
 * false
 * true
 */