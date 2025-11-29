import java.util.Scanner;

/**
 * Write a description of class WEEK4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WEEK4
{
    public static void main(String [] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grades= input.nextInt();
        if(grades>=40){
         System.out.println("pass");
        }
         else{
         System.out.println("fail");
        }
            
        
        
    }
}