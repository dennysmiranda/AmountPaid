
package amountpaid;

/**
 * Dennys Miranda
 * 04-03-20
 * @author dennysmiranda
 */
import java.util.Scanner;
public class AmountPaid {
    
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        //Declare Varibles
        double amountPays = 0.0, amountMonths = 0.0;
        double amountPaid = 0.0;
        
        //Get input
        System.out.print("How much are you paying each month for your car? $");
        amountPays = keyboard.nextDouble();
        System.out.print("How many months have you paid for your car? ");
        amountMonths = keyboard.nextDouble();
        
        //calculations
        amountPaid = amountPays * amountMonths;
        
        //Get output
        System.out.println("You have paid $" + amountPaid + " for your car so far.");
        
    }
    
}
