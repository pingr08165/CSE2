// Ben Pingrey
// CSE 02
// Homework 5, program 2
// Program to randomly assign 3 boolean values, then ask the user about a random logical combination of them

// Import scanner
import java.util.Scanner;

// Create class
public class BoolaBoola{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        boolean b1;             // First boolean
        boolean b2;             // Second boolean
        boolean b3;             // Third boolean
        String input;           // String for user input
        boolean choiceOneOr;    // If true, first operator will be or, if false, first operator will be and
        boolean choiceTwoOr;    // If true, second operator will be or, if false, second operator will be and
        boolean intermediate;   // result of b1 <first operator, either && or ||> b2
        boolean result;         // Actual result of two logical operators
        String c1String;        // String to output for choice one
        String c2String;        // String to output for choice two
        
        // Randomly assign values to b1, b2, b3, choiceOneOr, and choiceTwoOr
        b1 = (int)(Math.random()*2) == 1;
        b2 = (int)(Math.random()*2) == 1;
        b3 = (int)(Math.random()*2) == 1;
        choiceOneOr = (int)(Math.random()*2) == 1;
        choiceTwoOr = (int)(Math.random()*2) == 1;
        
        // Determine result of first operation
        if (choiceOneOr){
            intermediate = b1 || b2;
            c1String = "||";
        }
        else {
            intermediate = b1 && b2;
            c1String = "&&";
        }
        // Detemrine result of second operation
        if (choiceTwoOr){
            result = intermediate || b3;
            c2String = "||";
        }
        else{
            result = intermediate && b3;
            c2String = "&&";
        }
        
        // Ask question and get user response
        System.out.printf("Does %b %s %b %s %b have the value of true (T/t) or false (F/f)?: ", b1, c1String, b2, c2String, b3);
        input = myScanner.next();
        
        // Determine if response is valid
        if(!input.equals("T") && !input.equals("t") && !input.equals("F") && !input.equals("f")){
            System.out.println("That is not a valid answer. Please try again");
            return; // Terminates program if input is invalid
        }
        
        // If user entered true
        if(input.equals("T") || input.equals("t")){
            if(result == true){
                System.out.println("Correct!");     // If the user is correct
            }
            else{
                System.out.println("Incorrect!");   // If the user in incorrect
            }
        }
        // If user entered false
        else{
            if (result == false){
                System.out.println("Correct!");     // If the user is correct
            }
            else{
                System.out.println("Incorrect!");   // If the user is incorrect
            }
        }
        
        
    } // End of main method
} // End of class