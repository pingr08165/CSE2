// Ben Pingrey
// CSE 02
// Lab 5
// Program to let the user choose between several chance based games and output a sample result

// Import scanner
import java.util.Scanner;

// Create class
public class RandomGames{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        String game;            // String to hold the character represening the user's chosen game
        int rouletteNumber;     // Number selected on roulette, 0-36 represent that, 37 represents 00
        int crapsNumber1;       // First number between 1 and 6
        int crapsNumber2;       // Second number between 1 and 6
        int cardNum;            // Card number for pick a card (1-13)
        String cardSuit = "";   // Card suit for pick a card
        
        // Get input on game choice
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        game = myScanner.next();
        
        // Check validity of input
        if (!game.equals("R") && !game.equals("r") && !game.equals("C") && !game.equals("c") && !game.equals("P") && !game.equals("p")){
            System.out.println("Invalid entry.");
            return; // Terminates program if input is invalid
        }
        
        // Roulette code
        if (game.equals("R") || game.equals("r")){
            // Will set rouletteNumber to a pseudorandom number between 0 and 37
            rouletteNumber = (int)(Math.random()*38);
            
            if (rouletteNumber == 38){
                System.out.println("Roulette: 00"); // Accounts for the special rouletteNumber = 37 case, which represents 00
                return; // Terminates program
            } 
            else {
                System.out.printf("Roulette: %d%n", rouletteNumber);
            }
            
        } // End of roulette code
        
        // Craps code
        if (game.equals("C") || game.equals("c")){
            crapsNumber1 = (int)(Math.ceil(Math.random()*6));
            crapsNumber2 = (int)(Math.ceil(Math.random()*6));
            System.out.printf("Craps: %d + %d = %d%n", crapsNumber1, crapsNumber2, crapsNumber1+crapsNumber2 );
            return; // Terminates program
        } // End of craps code
        
        // Pick a card code
        if(game.equals("P") || game.equals("p")){
            // Pick a pseudorandom suit (1-4)
            switch ((int)(Math.random()*4+1)){
                case 1: cardSuit = "Hearts";
                        break;
                case 2: cardSuit = "Diamonds";
                        break;
                case 3: cardSuit = "Clubs";
                        break;
                case 4: cardSuit = "Spades";
            } // End of suit switch
            // Pick a card number (1-13)
            cardNum = (int)(Math.random()*13+1);
            // Output results
            switch (cardNum){
                case 1: System.out.printf("Your card is: Ace of %s%n", cardSuit);
                        break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: System.out.printf("Your card is: %d of %s%n", cardNum, cardSuit);
                         break;
                case 11: System.out.printf("Your card is: Jack of %s%n", cardSuit);
                         break;
                case 12: System.out.printf("Your card is: Queen of %s%n", cardSuit);
                         break;
                case 13: System.out.printf("Your card is: King of %s%n", cardSuit);
                         break;
            } // End of output switch
        } // End of pick a card code
        
    } // End of main method
    
} // End of class