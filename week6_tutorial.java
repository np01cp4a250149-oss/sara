
/**
 * Write a description of class week6_tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_tutorial
{
    public static void main(String[] args){//common line argumrnts
     int[] age;//declaring array
     age= new int[5];//constructing array
     
     System.out.println(age.length);//finding length of an array
     
     //firstindex=0, lastindex=age.length-1==5-1=4;
     
     age[0]=10;
     age[1]=20;
     age[2]=30;
     age[3]=40;
     age[4]=50;
         
      int[] agr={5,10,15,20,25};//all in one
      
      System.out.println(agr.length);//5
      System.out.println(agr[0]);//5
      
      int sum=0;
      for(int i=0; i<agr.length; i++)//sum
      {
          sum=sum+agr[i];
      }
      System.out.println(sum);
      
      
      for(int i=agr.length-1; i>=0; i--)//reverse ma print
      {
          System.out.println(agr[i]);
      }
     
      
      //2Darray
      int[][] matrix={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
      
      System.out.println(matrix.length);//length=4, index=3
      
      for(int i=0; i< matrix.length; i++)
      {
          for(int j=0; j< matrix.[i]; j++)
          {
          System.out.println(matrix[i][j]);
        }
        
      }
      
    }
    
}