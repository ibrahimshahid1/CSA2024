
/**
 * Write a description of class bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Formatter;

public class bird
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[]args){
        Formatter fmt = new Formatter( );
fmt.format("My number is%15.1f, and my string is%9s", 1961.0729, "Hello!");
String s = fmt.toString();
System.out.println(s);
    }
}
