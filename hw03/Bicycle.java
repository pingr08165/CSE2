// Ben Pingrey
// CSE02, Homework 3, program 1
// Program to recieve input from user about a bike trip and calculate speed, distance, time

// Import scanner class
import java.util.Scanner;

// Create class
public class Bicycle{
    // Create main method
    public static void main(String[] args){
        // Declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        double milesPerCount = 0.0013387; // Conversion factor from counts to miles. Based on 27 inch wheel diameter
        int seconds;                      // Duration of bicycle trip in seconds
        int counts;                       // Counts of bycicle trip (one per wheel rotation)
        double tripTime;                  // Duration of trip in minutes
        double tripLength;                // Length of trip in miles
        double aveSpeed;                  // Average speed in miles per hour
        
        // Get user input
        System.out.print("Enter the number of seconds: ");
        seconds = myScanner.nextInt();
        
        System.out.print("Enter the number of counts: ");
        counts = myScanner.nextInt();
        
        // Calculate output
        tripTime = (double)seconds / 60;                       // Sets trip time to trip duration in minutes
        tripLength = counts*milesPerCount;             // Sets tripLength to length of trip in miles
        aveSpeed = tripLength/((double)seconds/3600);  // Sets aveSpeed to average miles per hour
        
        // Output results, using printf to specify the desired decimal places
        System.out.printf("The distance was %.2f miles and took %.1f minutes.%n", tripLength, tripTime);
        System.out.printf("The average speed was %.2f mph.%n", aveSpeed);
        
    } // End of main method
} // End of class