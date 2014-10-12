// Ben Pingrey
// CSE 02
// Homework 6, program 2
// Program to approximate a square root by the bisection method

// Import scanner
import java.util.Scanner;

// Create class
public class Root{
    // Create main method
    public static void main(String[] commandLineArgumentsThatProfessorChenForgotToTalkAboutBeforeTheFirstExamButIncludedAnyway){
        // Declare variables----------------------------------------------
        Scanner in = new Scanner(System.in);
        double x = 0;           // Number entered by user to have its square root approximated
        double high;            // High estimate of root
        double low;             // Low estimate of root
        double middle = 0;      // Midpoint between high and low estimates
        // End of variable delcarations-----------------------------------
        
        // Get user input
        while(!(x > 0)){
            System.out.print("Enter a positive double: ");
            while (!in.hasNextDouble()){
                in.nextLine();
                System.out.print("Enter a positive double: ");
            }
            x = in.nextDouble();
        }
        // Initial guess for high and low
        high = x + 1;
        low = 0;
        
        // Loop until the difference between high and low is less than a small multiple of 1+x
        while (high - low > .0000001*(1+x) ){
            // Code to do one iteration of bisection
            middle = (high - low)/2 + low;
            if (middle*middle > x){
                high = middle;          // Set high to the middle if middle squared is greater than x
            }
            else{
                low = middle;           // Set low to the middle if the middle squared is less than x
            }
        } // End of while
        
        // Output results
        System.out.printf("The square root of %f is approximately: %f%n", x, middle);
    
    } // End of main method
} // End of class