// Ben Pingrey
// Homework 2
// Due 9-9-2014
// Program to preform various arithmetic operations on stored variables


// Create class
public class Arithmetic{
    public static void main(String[] args){
        // Variable declarations
        // 'Input' Variables
        int nSocks = 3;              // Number of pairs of socks
        double sockCost$ = 2.58;     // Cost per sock in dollars
        int nGlasses = 6;            // Number of drinking glasses
        double glassCost$ = 2.29;    // Cost per drinking glass in dollars
        int nEnvelopes = 1;          // Number of boxes of envelopes
        double envelopeCost$ = 3.25; // Cost per box of envelopes
        double taxPercent = 0.06;    // State sales tax in decimal form
        
        // Variables to be outputed
        double sockMoney = nSocks*sockCost$;               // Cost of socks alone
        double sockTax = sockMoney*taxPercent;             // Tax associated with sock cost
        double sockTotal = sockMoney+sockTax;              // Cost of socks + tax on socks
       
        double glassMoney = nGlasses*glassCost$;           // Cost of glasses alone
        double glassTax = glassMoney*taxPercent;           // Tax associated with glass cost
        double glassTotal = glassMoney+glassTax;           // Cost of glasses + tax on glasses
        
        double envelopeMoney = nEnvelopes*envelopeCost$;   // Cost of envelopes alone
        double envelopeTax = envelopeMoney*taxPercent;     // Tax associated with envelope cost
        double envelopeTotal = envelopeMoney+envelopeTax;  // Cost of envelopes + tax on envelopes
        
        // Output results
        /* Note--printf is used in place of println to allow for
           the output to be formated to include only 2 decimal places,
           as opposed to using a convoluted typcasting method of trucation
           (This format also makes it easier to copy and paste the code for each item and
           just change the variable names!)
        */
        // Sock results
        System.out.println("Item: Socks");                 
        System.out.printf("Number purchased: %d%n", nSocks);
        System.out.printf("Cost per sock: $%.2f%n", sockCost$);
        System.out.printf("Cost of socks purchased: $%.2f%n",sockMoney); // Used %.2f to display result as a float with 2 decimal places, used %n to move to next line
        System.out.printf("Cost of tax on socks: $%.2f%n", sockTax);
        System.out.printf("Cost of socks with tax: $%.2f%n%n", sockTotal);
        
        // Glass results
        System.out.println("Item: Drinking Glasses");                 
        System.out.printf("Number purchased: %d%n", nGlasses);
        System.out.printf("Cost per glass: $%.2f%n", glassCost$);
        System.out.printf("Cost of glasses purchased: $%.2f%n",glassMoney); 
        System.out.printf("Cost of tax on glasses: $%.2f%n", glassTax);
        System.out.printf("Cost of glasses with tax: $%.2f%n%n", glassTotal);
        
        // Envelope results
        System.out.println("Item: Box of envelopes");                 
        System.out.printf("Number purchased: %d%n", nEnvelopes);
        System.out.printf("Cost per box: $%.2f%n", envelopeCost$);
        System.out.printf("Cost of boxes purchased: $%.2f%n",envelopeMoney); 
        System.out.printf("Cost of tax on boxes of envelopes: $%.2f%n", envelopeTax);
        System.out.printf("Cost of boxes of envelopes with tax: $%.2f%n%n", envelopeTotal);
        
        // Total results 
        System.out.printf("Total cost of items before tax: $%.2f%n", (sockMoney+glassMoney+envelopeMoney));
        System.out.printf("Total tax on all items: $%.2f%n", (sockTax+glassTax+envelopeTax));
        System.out.printf("Total cost of purchases: $%.2f%n", (sockTotal+glassTotal+envelopeTotal));
        
        
    } // End of main method
} // End of class 