import java.util.*;

/**
 * Write a description of class lab02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lab02
{ 
    public static void main(String[] args)
    {
    
    //int age; //declaring the variable
    //age =18; //assigning the variable
     //declaring and assigning
    
    //scanner class
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    
    int firstNum = input.nextInt();
    
    System.out.println("My first number is: "+ firstNum);
     
    System.out.println("Enter second number: ");
     
    double secondNum= input.nextDouble();
    
    System.out.println("my first number is: "+ firstNum);
    System.out.println("my second number is: "+ secondNum);
    
    
    //post and pre increment operator
    
    int h=1;
    int j= ++h;
    int k= h++;
    
    System.out.println(h + j + k);
    
    //ternery operator
    
    int age =18;
    String isValid=(age>=18) ? "Driving is allowed" : "Driving is not allowed";
    System.out.println(isValid);

    
}
}