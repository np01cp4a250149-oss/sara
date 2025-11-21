import java.util.*;

/**
 * Write a description of class WS_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WS_6
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
    System.out.println("Enter the level of water ");
    
    int level = input.nextInt();
    String isValid=(level>=1000) ? "WARNING: Water level has reached 1000L or more!" : " Normal";
       System.out.println(isValid);
    }
}