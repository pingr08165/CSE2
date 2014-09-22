// Ben Pingrey
// CSE 02
// Homework 4, part 2
// program to give the number of days in an inputed month, accounting for leap years

// Import scanner
import java.util.Scanner;

// Create class
public class Month{
    // Create main method
    public static void main(String[] args){
        // Make scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        int month;         // Month, to be entered by user
        int year;          // Year, to be entered by user
        
        // Get user input
        System.out.print("Please enter the number of the month (1-12): ");
        // Check that input is valid
        if (!myScanner.hasNextInt()){
            System.out.println("You did not enter an integer!");
            return;
        } // End of if
        
        // Sets month to entered integer
        month = myScanner.nextInt();
        
        if ((month > 12) || (month < 1)){       // Checks if entered int is valid
            System.out.println("You did not enter an integer between 1 and 12.");
            return; // Terminates program
        } // End of if
        
        if (month == 4 || month == 6 || month == 9 || month == 11 ) {  // Outputs 30 days for April, June, September, November
            System.out.println("The month has 30 days");
        } // End of if
        else if (month == 2){           // Checks for leap year if month is February
            System.out.print("Please enter the year as an int: ");
            if (myScanner.hasNextInt()) {
                year = myScanner.nextInt();
                if ((year % 4) == 0)        // 29 days if leap year
                {
                    System.out.println("The month has 29 days");
                }// End of double nested if
                else {
                    System.out.println("The month has 28 days");
                } // End of double nested else
            } // End of nested if
            else {
                System.out.println("You did not enter a valid int!");
                return; // Terminates program if year is invalid
            } // end of nested else
        } // end of else if
        else {
            System.out.println("The month has 31 days"); // 31 days for all other valid months
        }
        
    } // End of main method
    
} // End of class