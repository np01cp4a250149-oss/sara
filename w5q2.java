
/**
 * Write a description of class w5q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q2
{
    public static void main(String[] args)
    {
     int i=1;
    while(i<=10)
    {
     System.out.println(i*i);
    i++;
     }
    
    int sum=0;
    do{
        sum = sum+(i*i);
        i++;
    }while(i<=10);
    
    System.out.println(sum);
}
}