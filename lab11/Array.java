// Ben Pingrey
// CSE 02
// Lab 11
// Program to practice with arrays

// Import scanner
import java.util.Scanner;

// Create class

public class Array {
    // Main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner in = new Scanner(System.in);
        
        // Declare variables
        int data[] = new int[10];       // Array to store user input
        int reverse[] = new int[10];    // Array to store user input in reverse order
        int highest;                    // Value of highest int in array data[]
        int lowest;                     // Value of lowest int in array data[]
        int sum;                        // Sum of all values in array data[]
        
        // Get user input
        System.out.print("Enter 10 ints: ");
        
        // Store input to array data[]
        for(int i = 0; i < 10; i++){
            data[i] = in.nextInt();
        }
        
        // Search array for highest value and print it out
        highest = data[0];
        for(int i = 1; i < 10; i++){
            if(data[i] > highest){
                highest = data[i];
            }
        }
        System.out.println("The highest value is: " + highest);
        
        // Search array for lowest value and print it out
        lowest = data[0];
        for(int i = 1; i < 10; i++){
            if(data[i] < lowest){
                lowest = data[i];
            }
        }
        System.out.println("The lowest value is: " + lowest);
        
        // Print out the sum of all values in the array
        sum = 0;
        for(int i = 0; i < 10; i++){
            sum += data[i];
        }
        System.out.println("The sum of all values is: " + sum);
        
        // Create an array reverse[] with entries in the opposite order of data[]
        for(int i = 0; i < 10; i++){
            reverse[i] = data[9 - i];
        }
        // Print out data[] and reverse[] side by side
        for(int i = 0; i < 10; i++){
            System.out.println("\t" + data[i] + "\t" + reverse[i]);
        }
        
    } // End of main method
} // End of class