// Ben Pingrey
// CSE 02
// Homework 4, part 4
// Program to turn the time passed in seconds into the conventional form <hours>:<minutes>:<seconds>

// Import Scanner
import java.util.Scanner;

// Create class
public class TimePadding{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        int seconds;        // Number of seconds entered by user
        int nHours;         // Number of hours passed
        int nMins;       // Number of minutes passed
        int nSecs;       // Number of seconds passed 
        
        // Get input
        System.out.print("Enter the number of seconds that have passed: ");
        // Validate input
        if(!myScanner.hasNextInt()){
            System.out.println("You did not enter an integer! Shame on you!");
            return; // Terminates program if input was invalid
        }
        seconds = myScanner.nextInt(); // Gets value from input
        if (seconds < 0){
            System.out.println("You entered a negative integer! Unfortunately, time doesn't go that direction (does it?)");
            return; // Terminates program if input was negative
        }
        
        // Perform nessecary calculations
        nHours = seconds / 3600;                     // Integer division will find the number of hours
        nMins = (seconds - 3600*nHours)/60;       // Integer division will find number of minutes
        nSecs = seconds - 3600*nHours - 60*nMins; // Subtract to find remaining seconds
        
        // Output results
        System.out.printf("The time is %02d:%02d:%02d%n", nHours, nMins, nSecs);
        
    } // End of main method
} // End of class/