
/**
 * Write a description of class week6WSsen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6WSsen
{
 public static void main(String[] args){
    String[] Category = {"Nepali", "fiction"};
    String[][] Titles = new String[2][1];
    Titles[0][0] = "Asahamati";
    Titles[1][0] = "The Martian";
    
    double[][] Price = new double[2][1];
    Price[0][0] = 750;
    Price[1][0] = 800;
    for(int i = 0; i < Category.length ; i++){
    System.out.print(Category[i]+"  ");
        for(int j = 0 ; j < Titles[i].length ; j++){
        if(Titles[i][j] == null || Titles[i][j] == ""){
        System.out.println("[Empty]");
        }
        else{
        System.out.print(Titles[i][j]+ " ");
        System.out.printf("%.2f",Price[i][j]);
        }
        
        }
        System.out.println();
    }
    System.out.println();
    
    }
}