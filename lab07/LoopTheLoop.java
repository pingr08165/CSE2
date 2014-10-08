// Ben Pingrey
// CSE 02
// Lab 7
// Using while loops to print various patterns

// Import scanner
import java.util.Scanner;

// Create class
public class LoopTheLoop{
    // Create main method
    public static void main(String[] arg){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        int nStars;             // Number of stars to be printed out on a given line
        int nLines;             // line number (as entered by the user)
        int i;                  // counter variable
        String breaker;         // string to determine if loop is broken
        
        // Loop program until conditional break by user
        while(true){
            // Reset variables
            nStars = 0;
            nLines = 0;
            i = 0;
            
            // Get user input
            while(nLines < 1 || nLines > 15){
                System.out.print("Enter an int in the range [1,15]: ");
                while(!myScanner.hasNextInt()){
                    myScanner.nextLine();   // Clear junk in scanner
                    System.out.print("Enter an int in the range [1,15]: ");
                } // End of nested while
                nLines = myScanner.nextInt();
            } // End of outer while
            
            
            // Code to print out nLines stars
            i = 0;                      // Reset counter variable
            while(i < nLines){
                i++;                    // Increment i
                System.out.print('*');
            } // End of while loop
            System.out.print('\n');
            // Code to print out nLines of stars, with each line having one more star than the last
            while(nStars < nLines){
                nStars++;               // Increment nStars by one
                // Loop to print out one line of nStars stars
                i = 0;                  // Set i to zero for each new line
                while (i < nStars){
                    i++;                        // Increment conuter variable
                    System.out.print('*');
                } // End of nested while loop
                System.out.print('\n');         // Move to next line
                // End of code to print one line of nStars stars
            } // End of outer while loop
            
            
            // Conditional break by user
            System.out.print("Do you want to continue? (Y/y to continue): ");
            breaker = myScanner.next();
            
            if(!breaker.equals("Y") && !breaker.equals("y")){
                break;                
            } // End of conditional break if
            
        } // End of infinite loop
    }
} // End of class