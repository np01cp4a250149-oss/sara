
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
        
        //Arithmetic
        int a=3;
        int b=4;
        int sum= a+b;
        System.out.println("sum is: "+sum );
        
        int subtract= a-b;
        System.out.println("subtraction is: "+subtract );
        
        int multiply= a*b;
        System.out.println("multiplication is: "+ multiply );
        
        int division= a/b;
        System.out.println("division is: "+division );
        
        //unary
        int x=3;
        int c= ++x;
        int d= x++;
        System.out.println(x + c + d);
        
        //Relational
        int y=3;
        int z=3;
         
        System.out.println(y == z);
        System.out.println(y != z);
        System.out.println(y < z);
        System.out.println(y > z);
        System.out.println(y >= z);
        System.out.println(y <= z);
        
        //Logical
        System.out.println(a>b && a!=b);
        
        // ternary
        int age =18;
    String isValid=(age>=18) ? "Driving is allowed" : "Driving is not allowed";
    System.out.println(isValid);
    
        
    }
}