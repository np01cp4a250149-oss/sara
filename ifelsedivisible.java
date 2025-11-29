import java.util.Scanner;

/**
 * Write a description of class ifelsedivisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ifelsedivisible
{
     public static void main(String[] args){
         
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter your num: ");
         int num= input.nextInt();
         if(num%3==0 && num%5==0){
             System.out.println("divible by both 3 and 5");
         }
         else{
             System.out.println("not divisible by both");
         }
        }
}