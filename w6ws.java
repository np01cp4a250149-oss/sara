import java.util.Scanner;

/**
 * Write a description of class w6ws here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6ws
{
    public static void main(String[] args){
        int[] age;//declare
        age= new int[5];//construct
        
        int[] agr=new int[5];//d and c in same line
        
        
        int[][] arr;
        arr= new int[2][5];//2Darray
        
        //int arr[][]=new in
        
        
        //3
        String[] name= {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        for(int i=0; i< name.length; i++)
        {
            System.out.println(name[1]);
        }
        System.out.println(name[2]);
        
        name[4]="alex";
        System.out.println(name[4]);
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the index you want to updaate :");
        
        int i= input.nextInt();
         System.out.println("Enter your name:");
         String n= input.next();
         name[i]= n;
         System.out.println(name[i]);
          
        for(int j=0; j< name.length; j++)
        {
            System.out.println("value at index"+name[j]);
        }
        
    }   
}