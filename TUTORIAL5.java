import java.util.Scanner;

/**
 * Write a description of class TUTORIAL5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TUTORIAL5
{
    public static void main(String[] args){
        //sum of 10 natural nums
        Scanner input=new Scanner(System.in);
        System.out.println("ank for any num");
        int n= input.nextInt();
        int sum= 0;
        int i;
        for(i=1; i<=10; i++)
        {
            sum =sum+i;
            System.out.println(sum);
        }
        System.out.println("total sum :"+sum);
        
    }
    do{
        System.out.println(i);
        i++;
    }
    while(i<1);
}
   for(int i=1; i<=5; i++)
   {
       if(i==2)
       {
           break; //continue;=skip
       }
       System.out.println(i);
   }