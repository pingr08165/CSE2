// Ben Pingrey
// CSE 02
// Lab03--A lab to recieve input from the user about Big Mac prices,quantities, and tax and output the total cost


// Import scanner class
import java.util.Scanner;

// Establish class
public class BigMac{
    // Start of main method
    public static void main(String[] args){
        // Establish variables
        int nBigMacs;       // Number of big macs ordered
        double salesTax;    // Sales tax displayed as a percentage (i.e. 15% would be displayed as 15)
        double bigMacPrice; // Price of one Big Mac in dollars
        double totalCost;   // Total cost of purchase in dollars
        
        // Create scanner instance
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        // Gather required input
        System.out.print("Please enter the cost of one BigMac as a double value: ");
        bigMacPrice = myScanner.nextDouble(); // Sets the value of bigMacPrice to the value of the next double inputed
        
        System.out.print("Please enter the number of BigMacs ordered as an integer value: ");
        nBigMacs = myScanner.nextInt();
        
        System.out.print("Please enter the percent state sales tax as a double (i.e. 9.5% would be entered as 9.5): ");
        salesTax = myScanner.nextDouble();
        
        // Calculate total cost
        totalCost = nBigMacs*bigMacPrice*(1+(salesTax/100));
        
        // Output results, using printf to modify the number of decimal places displayed
        // It should be noted that the result is displayed rounded up to the nearest cent, as opposed truncated.
        System.out.printf("The total cost of %d Big Macs, at $%.2f each, with a sales tax of %.1f%c, is $%.2f%n", nBigMacs, bigMacPrice, salesTax, '%', totalCost);
        
        
    } // End of main method
} // End of class