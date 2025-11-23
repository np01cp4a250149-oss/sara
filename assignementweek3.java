import java.util.*;

/**
 * Write a description of class assignementweek3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignementweek3
{
    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter travel distance in KM");
        double dis = input.nextDouble();
        
        System.out.println("Enter Time in Minutes");
        double time = input.nextDouble();
        
        System.out.println("Is the customer a local?(yes/no)");
        String isLocalInput = input.next();
        boolean isLocal = isLocalInput.equalsIgnoreCase("yes");
        
        System.out.println("Is it night travel?(yes/no)");
        String isNightInput = input.next();
        boolean isNight = isNightInput.equalsIgnoreCase("yes");
        
        //Fare rules
        double baseFare = 30;
        double perkm = 20;
        double perMin = 2;
        double nightRateExtra = 0.30;
        double localDiscount = 0.20;
        
        double fare = baseFare + (dis * perkm) + (time * perMin);
        
        fare = (isLocal) ? fare - (fare * localDiscount) : fare;
        
        fare = (isNight) ? fare + (fare * nightRateExtra) : fare;
        
        System.out.println("----------------------------");
        System.out.println("Final Fare: Rs. "+ fare);
        System.out.println("----------------------------");
    }
}