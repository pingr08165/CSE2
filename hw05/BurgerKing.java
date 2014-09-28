// Ben Pingrey
// CSE 02
// Homework 5, program 1
// Program to allow the user to place an order for a burger, drink, or fries

// Import Scanner
import java.util.Scanner;

// Create class
public class BurgerKing{
    // Create main method
    public static void main(String[] args){
        // Declare scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        String input;              // String input from user
        char inputChar;            // Char extracted from input string
        String input2;             // Second string input from user
        char inputChar2;           // char extracted from input2 string
        String order = "";         // String containing final order
        
        // Get input from user
        System.out.print("Enter a letter to indicate a choice of:\nBurger (B or b)\nSoda (S or s)\nFries(F or f):  ");
        input = myScanner.next();
        // Check validity of input
        if (input.length() != 1){
            System.out.println("Invalid entry.");
            return; // Terminates the program if input is not a single character
        }
        // Extract char
        inputChar = input.charAt(0);
        
        // Determine what order was placed
        switch(inputChar){
            case 'B':
            case 'b': 
                // Burger code
                    System.out.print("Enter A or a for \"All the fixins\"\nC or c for Cheese\nN or n for none of the above: ");
                    input2 = myScanner.next();
                    if (input2.length() != 1){
                        System.out.println("Invalid entry.");
                        return; // Terminates program if input is not a single character
                    }
                    // Extract char
                    inputChar2 = input2.charAt(0);
                    switch (inputChar2) {
                        case 'A':
                        case 'a':
                            order = "You ordered a burger with all the fixins";
                            break;
                        case 'C':
                        case 'c':
                            order = "You ordered a burger with cheese";
                            break;
                        case 'N':
                        case 'n':
                            order = "You ordered a burger with no additional fixings";
                            break;
                        default: 
                            System.out.println("Invalid entry");
                            return; // Terminates program if input is invalid
                    } // End of burger code
                    break;
                    
            case 'S':
            case 's':
                // Soda code
                System.out.print("Enter P or p for Pepsi\nC or c for Coke\nS or s for Sprite\nM or m for Mountain Dew: ");
                    input2 = myScanner.next();
                    if (input2.length() != 1){
                        System.out.println("Invalid entry");
                        return; // Terminates program if input is not a single character
                    }
                    // Extract char
                    inputChar2 = input2.charAt(0);
                    switch (inputChar2) {
                        case 'P':
                        case 'p':
                            order = "You ordered a Pepsi";
                            break;
                        case 'C':
                        case 'c':
                            order = "You ordered a Coke";
                            break;
                        case 'S':
                        case 's':
                            order = "You ordered a Sprite";
                            break;
                        case 'M':
                        case 'm':
                            order = "You ordered a Mountain Dew";
                            break;
                        default: 
                            System.out.println("Invalid entry");
                            return; // Terminates program if input is invalid
                    } // End of soda code
                    break;
            case 'F':
            case 'f':
                // Fries code
                System.out.print("Would oyu like large (L or l) or small (S or s) fries?: ");
                    input2 = myScanner.next();
                    if (input2.length() != 1){
                        System.out.println("Invalid entry");
                        return; // Terminates program if input is not a single character
                    }
                    // Extract char
                    inputChar2 = input2.charAt(0);
                    switch (inputChar2) {
                        case 'L':
                        case 'l':
                            order = "You ordered large fries";
                            break;
                        case 'S':
                        case 's':
                            order = "You ordered small fries";
                            break;
                        default: 
                            System.out.println("Invalid entry");
                            return; // Terminates program if input is invalid
                    } // End of fries code
                    break;
            default: 
                System.out.println("Invalid entry");
                return; // Terminates program if character entered is not valid
        } // End of first switch
        
        // Output results
        
        System.out.println(order);
        
    } // End of main method
} // End of class