import java.util.Scanner;

/**
 * Write a description of class w6q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q4
{
    public static void main(String[] args){
        int[] score={10,20,30,400,50};
        
        for(int i=0; i<score.length; i++)
        {
            System.out.println(score[i]);
        } 
        int sum=0;
      for(int i=0; i<score.length; i++)//sum
      {
          sum=sum+score[i];
      }
      System.out.println(sum);
      double avg=sum/5;
      int high= score[0];
      int low= score[0];
      
      
      for(int j=0; j< score.length; j++)//sum
      {
          if(score[j]>high){
              high= score[j];
          }
          if(score[j]<low){
              low= score[j];
          }
      }
      System.out.println("highest="+ high);
       System.out.println("lowest="+ low);
       
       Scanner input=new Scanner(System.in);
        System.out.println("Enter your index length");
        int len= input.nextInt();
        
        int [] arr1= new int[len];
        
         for(int i=0; i<arr1.length; i++)//sum
      {
         System.out.println("Enter your score:");
         arr1[i]= input.nextInt();
      }
         
       
    }
}