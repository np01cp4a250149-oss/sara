import java.util.Scanner;

/**
 * Write a description of class s5assign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s5assign
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Boolean deposit = true;
    double feeRate = 0.005;
    while(deposit){
    
        System.out.println("Enter your Principal Amt(min. 1000): ");
        double P = input.nextDouble();
        
        if (P < 1000){
        System.out.println("Invalid Amt, -Try Again-:\n");
        continue;
        }
        
        System.out.println("Enter Annual Interest rate (8-12): ");
        double AI = input.nextDouble();
        if(AI < 8 ||  AI > 12){
        System.out.println("Invalid Interest Value Entered, -Try Again-:\n");
        continue;
        }
        
        System.out.println("Enter Amt of Years(max. 5): ");
        int year = input.nextInt();
        if(year > 5 || year < 1){
        System.out.println("Invalid Amt of Years Entered, -Try Again-:\n");
        continue;
        }
        
        double monthlyInterest = (AI / 100) / 12;
        int months = year * 12;
        
        double A = P;
        int m = 1;
        while (m <= months){
        
            A = A * (1 + monthlyInterest);
            m++;
            
        }
        
        double fee = A * feeRate;
        double FinalAmt = A - fee;
        
        System.out.println("Fixed Deposit Details:\n");
        System.out.printf("Principal(P): Rs %.2f\n", P);
        System.out.printf("Annual Rate(R): %.2f%%\n", AI);
        System.out.printf("Monthly Rate(M): %.6f%%\n", monthlyInterest);
        System.out.println("Year Duration(T): \n"+year);
        System.out.println("Months (t): \n"+months);
        System.out.printf("Maturity Amount(A): Rs%.2f\n", A);
        System.out.printf("Fee Rate(f): 0.5%%\n");
        System.out.printf("Fee amount(F): Rs %.2f\n", fee);
        System.out.printf("Final Amount: Rs %.2f\n", FinalAmt);
    
    System.out.println("Do You Want to Continue? (yes/no)");
    String depositAns = input.next();
    
    deposit = depositAns.equalsIgnoreCase("yes");
}
    
    }

}