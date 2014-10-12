// Ben Pingrey
// CSE 02
// Homework 6, program 1
// Program to run a simple Monte Carlo simulation based on a game of roulette

// Create class
public class Roulette{
    // Create main method
    public static void main(String[] commandLineArgumentsThatProfessorChenForgotToTalkAboutBeforeTheFirstExamButIncludedAnyway){
        // Declare variables-----------------------------------------------------------------------
        int spin = 0;               // Current spin number--used as a counter variable
        int set = 0;                // Current set number--used as a counter variable
        final int spinMax = 100;    // Number of spins per set
        final int setMax = 1000;    // Number of sets to be done
        int guess;                  // Number guessed for each spin
        int rollNum;                // Number rolled for each spin
        int correctGuess = 0;       // Number of correct guesses in a set
        int profit = 0;             // Amount of profit earned throughout all sets
        int winnings = 0;           // Amount of money won in a given set
        int bust = 0;               // Number of sets where no guesses are correct
        int goodSet = 0;            // Number of sets where a profit was made (3 or more correct guesses)
        String gainOrLoss = "";     // String used in output depending upon if money was gained or lost
        // End of variable declarations------------------------------------------------------------
        
        // Code for repeating all sets-------------------------------------------------------------
        while(set < setMax){
            set++;
            // Reset relevent variables
            correctGuess = 0;
            spin = 0;
            
            // Code for one set of spins----------------------------------
            while(spin < spinMax){
                spin++;
                // Code for one spin-------------
                guess = (int)(Math.random()*38 + 1);    // Sets guess to a pseudorandom int between 1 and 38
                rollNum = (int)(Math.random()*38 + 1);  // Sets rollNum to a pseudorandom int between 1 and 38
                // Check to see if guess is correct
                if (rollNum == guess){
                    correctGuess += 1;                  // Increment correctGuess by 1
                } // End of if
                // End of code for one spin------
            } // End of while loop for one set of spins
            
            // Check if the set was a bust or good set and increment winnings, if any
            if (correctGuess == 0){
                bust += 1;
            }
            else{
                winnings += 36*correctGuess;
                if(correctGuess >= 3){
                    goodSet += 1;
                }
            }
            // End of code for one set of spins---------------------------
        } // End Code for repeating all sets-------------------------------------------------------
        // Determine if money was made or lost
        profit = winnings - spinMax*setMax;
        if(profit >= 0){
            gainOrLoss = "gained";
        }
        else{
            gainOrLoss = "lost";
        }
        
        // Output results
        System.out.printf("Number of sets where you went bust: %d%nNumber of sets where you made a profit: %d%nOver all spins, you %s $%d%n", bust, goodSet, gainOrLoss, Math.abs(profit));
        
    } // End of main method
} // End of class