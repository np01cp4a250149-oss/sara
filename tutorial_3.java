
/**
 * Write a description of class tutorial_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial_3
{
    int qty;//instance variable
    static int rrt;//static variable
    public static void main(String[] args){
        
        int age=18;//local variable
        System.out.println(age);
        System.out.println(tutorial_3.rrt);
        
        //implicit Typecasting
        
        double dtr= age;
        System.out.println(dtr);
        
        //explict typecasting
        
        double db= 10.09;
        int itr= (int)db;
        System.out.println(itr);
        
        //exception in arithmatic
        
        byte b1= 10;
        byte b2= 11;
        
        byte sum= (byte)(b1+b2);
        
        //short, char
        
        
        
        //minimum, maximum, size, bytes
        
        System.out.println(Byte.MAX_VALUE);//MAXIMUM VALUES
        System.out.println(Byte.MIN_VALUE);//MINIMUM VALUES
        System.out.println(Byte.SIZE);//BITS
        System.out.println(Byte.BYTES);//BYTES
        
        //ESCAPE SEQUENCE
        
        System.out.println("HELLO\nWORLD");
         System.out.println("Hamro\tNepal");
          System.out.println("She said \"HI\"");
          
          //Unicode Escape Sequence
          
           System.out.println("\u2764");
    }
    
    
}