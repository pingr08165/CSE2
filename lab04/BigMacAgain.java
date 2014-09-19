// Ben Pingrey
// CSE02, Lab 04
// Program to calculate the price of a fast food order using a scanner and selection statements

// Import Scanner
import java.util.Scanner;

// Create class
public class BigMacAgain{
    public static void main(String[] args){
        // Make scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Declare and/or initialize variables
        final double bigMacPrice = 2.22;       // Price of one big mac in dollars
        final double friesPrice = 2.15;        // Price of an order of fries in dollars
        int nBigMacs;                          // Number of big macs ordered
        String fries;                          // Determines if the user wants fries or not
        double mealCost = 0;                   // Price of final order
        
        // Ask user for input on number of big macs ordered
        System.out.print("How many big macs would you like to order: ");
        
        // Confirm that the value entered is valid (positive and an integer)
        if (myScanner.hasNextInt()){
            nBigMacs = myScanner.nextInt();
            if (nBigMacs < 0){
                System.out.println("The value you entered was invalid. Please try again and input a positive integer.");
                return; // Terminates program
            }// end of nested if statement
        } // End of if statement
        else{
            System.out.println("The value you entered was invalid. Please try again and input a positive integer."); // Give an error message to invalid input
            return; // Terminates the program
        } // End of else statement
        
        // Add the cost of big macs to the total cost
        mealCost += nBigMacs*bigMacPrice; 
       
        // Output result to user
        System.out.printf("You ordered %d Big Macs for a cost of %d x $2.22 = $%.2f%n", nBigMacs, nBigMacs, mealCost); 
        
        // Ask user if he/she wants fries
        System.out.print("Would you like fries with that order? (Y/y or N/n): ");
        
        // Get input, confirm that input was correct
        fries = myScanner.next(); // sets the value of fries to the string entered
        if (fries.equals("Y") || fries.equals("y") ){
            mealCost += friesPrice; // Add the cost of fries to the meal cost if the user entered 'Y' or 'y'
            System.out.println("You ordered fries for a cost of $2.15"); // Print result to user
        } // End of first if
        else if (!fries.equals("N") && !fries.equals("n")){ // Tests that 'N' or 'n' were not entered
            System.out.println("You did not enter a valid character. Please enter 'Y', 'y', 'N', or 'n' next time.");
            return; // Terminates the program if the user entered an invalid character
        } // end of else if
        
        // Output total cost
        System.out.printf("The total cost of the meal is $%.2f%n", mealCost);
        
    } // End of main method
    
} // End of class