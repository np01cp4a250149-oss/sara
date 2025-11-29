import java.util.Scanner;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your num: ");
         int num= input.nextInt();
         
        if(num%3==0){
            {
                if(num%5 == 0){
                    System.out.println("dividible by both");
                }
                else{
                   System.out.println("dividible by 3 but not by 5"); 
                }
            }
        }
        else if(num%5==0){
                    System.out.println("dividible by 5 but not by 3");
            }
        else{
            System.out.println("not divisible by both");
        }
        
    }
}