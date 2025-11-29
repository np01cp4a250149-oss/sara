import java.util.Scanner;

/**
 * Write a description of class pos_neg_zero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pos_neg_zero
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the num:");
         int num= input.nextInt();
         if(num>0){
             System.out.println("positive");
         }
         else if(num<0){
             System.out.println("negative");
         }
        else {
            System.out.println("zero");
        }
    }    
}