import java.util.Scanner;

/**
 * Write a description of class GradeEvaulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaulator
{
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your grades=");
        int grades= input.nextInt();
        String isValid=(grades >= 40) ? "pass" : "fail";
        System.out.println(isValid);
        
        
    }
}