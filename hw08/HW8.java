// Ben Pingrey
// CSE02
// Homework 8
// Program to practice in creating and testing methods

// Import scanner
import java.util.Scanner;

// Create class
public class HW8 {
    // Main method
    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");
    } // End of main method
    
    // Additional methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // getInput--Method to get input from the user in the form of one character specified from a list. Two parameter version
    public static char getInput(Scanner myScanner, String list){
        int length = list.length(); // Get the length of string list
        String input;
        // Get and verify input
        while(true){
            input = myScanner.nextLine();
            // Check that input is one character
            if(input.length() != 1){
                System.out.println("You did not enter one character!");
                continue;
            }
            // Return appropriate character if it was on list, else repeat prompt
            for(int i = 0; i < length; i++){
                if(input.charAt(0) == list.charAt(i)){
                    return input.charAt(0);
                }    
            }
            System.out.print("You did not enter one of '" + list + "'. Try again: ");
        }
        
    } // End of two parameter getInput
    
    // Three parameter getInput to stop after a certain number of attempts
    public static char getInput(Scanner myScanner, String list, int stop){
        int length = list.length(); // Get the length of string list
        String input;
        // Get and verify input
        for(int repeat = 0; repeat < stop; repeat++){
            input = myScanner.nextLine();
            // Check that input is one character
            if(input.length() != 1){
                System.out.println("You did not enter one character!");
                continue;
            }
            // Return appropriate character if it was on list, else repeat prompt
            for(int i = 0; i < length; i++){
                if(input.charAt(0) == list.charAt(i)){
                    return input.charAt(0);
                }    
            }
            if(repeat != stop - 1){
            System.out.print("You did not enter one of " + list + ". Try again: ");
            }
        }
        System.out.printf("You failed after %d tries.%n", stop);
        return ' ';
        
    } // End of three parameter version of getInput (stops after a certain number of attempts)
    
    // Three parameter getInput for a list of digits
    public static char getInput(Scanner myScanner, String userPrompt, String list){
        int length = list.length(); // Get the length of string list
        String input;
        // Get and verify input
        while(true){
            System.out.print("Enter one of the following:");
            for(int character = 0; character < length; character++){
                System.out.printf(" '%c'", list.charAt(character));
            }
            System.out.print(": ");
            input = myScanner.nextLine();
            // Check that input is one character
            if(input.length() != 1){
                System.out.println("You did not enter one character!");
                continue;
            }
            // Return appropriate character if it was on list, else repeat prompt
            for(int i = 0; i < length; i++){
                if(input.charAt(0) == list.charAt(i)){
                    return input.charAt(0);
                }    
            }
            System.out.println("You did not enter an acceptable character.");
        }
        
    } // End of digit version of three parameter getInput
} // End of class
