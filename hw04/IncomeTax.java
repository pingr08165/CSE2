// Ben Pingrey
// CSE 02
// Homework 4, part 1
// program to calculate an income tax based on the amount entered

/* As a side note, the example runs given in the homework description assume that
all income is taxed at the same rate (for instance 14% of 85000 is 11,900), so I shall
assume that that is how the program is supposed to run. 

It is worth noting that this approach DIFFERS from that used in most progressive income taxes, 
in which only the income above each bracket is taxed at that percent (e.g. the first 20,000 is taxed
at 5%, the next 20,000 is taxed at 7%, , the next 38,000 at 12%, and all income above that taxed at 14%.)
*/

// Import Scanner
import java.util.Scanner;

// Create class
public class IncomeTax{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        double taxRate;                   // Tax rate to be paid as a decimal (decided based on value of income)
        int income;                       // User inputed income (in thousands of dollars)
        
        
        // Get input from user
        System.out.print("Please enter an int giving the number of thousands: ");
        if (myScanner.hasNextInt()){
            income = myScanner.nextInt();       // Gets the inputed value from the user
            if (income < 0) {
                System.out.println("You did not enter a positive integer!");
                return; // Terminates program if input is negative
            } // End of nested if
            
            //----------Assign tax rate based on income----------
            else if (income < 20){
                taxRate = 0.05;  
            } 
            else if (income < 40){
                taxRate = 0.07;
            }
            else if (income < 78){
                taxRate = 0.12;
            }
            else {
                taxRate = 0.14;
            }
            
        } // End of if
        else {
            System.out.println("You did not enter an integer!");
             return; // Terminates program if input is not an integer
        } // End of else
        
        
        // Calculate tax and output results to user
        System.out.printf("The tax rate on $%d,000 is %.1f%c, and the tax amount is $%.2f%n", income, (taxRate*100), '%', (taxRate*income*1000));
        
    } // End of main method
} // End of class