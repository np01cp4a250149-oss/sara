import java.util.Scanner;

/**
 * Write a description of class mpsp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mpsp
{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter MP");
        float mp=obj.nextFloat();
        System.out.println("MP of first item;");
        
        System.out.println("enter catagory among A B C D");
         char catagory= obj.next().charAt(0);
         if(catagory=='A'){
             float sp=mp-(mp*60);
             System.out.println("sp is:"+sp);
             
         }
         else if(catagory=='B'){
             float sp=mp-(mp*40);
             System.out.println("sp is:"+sp);
            }
            else if(catagory=='C'){
             float sp=mp-(mp*20);
             System.out.println("sp is:"+sp);
            }
            else if(catagory=='D'){
             float sp=mp-(mp*10);
             System.out.println("sp is:"+sp);
            }
            else{
             float sp= mp;
             System.out.println("sp is"+sp);
            }
             
            
         
         
    }
}