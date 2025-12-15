
/**
 * Write a description of class w6q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q7
{
    public static void main(String[] args)
    {
        String[][] seats={{"sam","ram","tom"},{"", "", ""}};
        for(int i=0; i<seats.length; i++){
            for(int j=0; j<seats[i].length; j++){
                if(seats[i][j]==""){
                    System.out.print("[empty]\t");
                }
                else{
                    System.out.print(seats[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}