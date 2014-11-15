// Ben Pingrey
// CSE02
// Homework 11, Program 2
// Program to simulate poker hands

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
      showHands();
      simulateOdds();
  } // End of main method
  // Additional methods--------------------------
  // showOneHand() --Method to simulate one poker hand
  public static int[] showOneHand(){
      // Create random class
      Random rand = new Random();
      // Create an array to represent the deck
      int deck[] = new int[52];
      // Fill array with increasing ints
      for(int i = 0; i < deck.length; i++){
          deck[i] = i;
      }
      // Create array of ints representing a poker hand
      int hand[] = new int[5];
      
      // Select 5 cards from the deck
      for(int i = 0; i < 5; i++){
          // Determine location in deck of card to be selected
          int location = rand.nextInt(52 - i);  // Generates a random number between 0 and 51, 50, 49, 48, 47 (decreasing with each "draw")
          // "Draw" the card in the chosen location--add it to hand[i]
          hand[i] = deck[location];
          // Remove the chosen card from the pool by overriding it with the value at the end of the current deck (deck[51], deck[50], etc.)
          deck[location] = deck[51 - i];
      }
      // Return generated array
      return hand;
  } // End of showOneHand()
  
  // showHands --Method to print out hands until prompted to stop by user
  public static void showHands(){
      // Create scanner
      Scanner in = new Scanner(System.in);
      while(true){
      // Generate a hand
      int hand[] = showOneHand();
      // Generate array of strings corresponding to each card name
      String cardName[] = {"A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "};
      // Print results for clubs:
      System.out.print("Clubs:\t  ");
      for(int i = 0; i < 5; i++){
          if(hand[i] < 13){
              System.out.print(cardName[hand[i]]); // Print out the corresponding name
          }
      }
      System.out.println();
      // Print out results for Diamonds
      System.out.print("Diamonds: ");
      for(int i = 0; i < 5; i++){
          if(hand[i] > 12 && hand[i] < 26){
              System.out.print(cardName[hand[i] - 13]); // Print out the corresponding name
          }
      }
      System.out.println();
      // Print out results for Hearts
      System.out.print("Hearts:\t  ");
      for(int i = 0; i < 5; i++){
          if(hand[i] > 25 && hand[i] < 39){
              System.out.print(cardName[hand[i] - 26]); // Print out the corresponding name
          }
      }
      System.out.println();
      // Print out results for Spades
      System.out.print("Spades:\t  ");
      for(int i = 0; i < 5; i++){
          if(hand[i] > 38){
              System.out.print(cardName[hand[i] - 39]); // Print out the corresponding name
          }
      }
      System.out.println();
      // Ask if user wants to continue
      System.out.print("Enter 'Y' or 'y' to continue, anything else to quit: ");
      String answer = in.next();
      if(!answer.equals("Y") && !answer.equals("y")){
          return;
      }
    }
  } // End of showHands()
  
    // exactlyOneDup()--Method to return the location of the pair if exactly one pair is found, else returns -1
    public static int exactlyOneDup(int array[]){
        int dups = 0;   // Count the number of duplicates
        int index = 0;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] % 13 == array[j] % 13){
                    dups += 1;      // Add 1 to dups if a duplicate is found
                    index = i;      // Location of the duplicate card in array[]
                }
            }
        }
        // Return appropriate result
        if(dups == 1){return array[index] % 13;} // If one pair, returns value of that pair
        return -1;
    } // End of exactlyOneDup()
    
    // simulateOdds() -- Method to simulate the result of 10,000 poker hands
    public static void simulateOdds(){
        // Create an array to store the number of hands with one pair of each card type
        int onePair[] = new int[13];
        // Fill onePair with zeros
        for(int i = 0; i < 13; i++){
            onePair[i] = 0;
        }
        // Simulate 10,000 poker hands
        for(int i = 0; i < 10000; i++){
            // Generate a pseudorandom hand
            int hand[] = showOneHand();
            // Determine if there is a pair in the hand and, if so, determine which card it is
            int pair = exactlyOneDup(hand);
            if(pair != -1){
                onePair[pair % 13] += 1;    // Add one to the number of pairs for the corresponding card if a pair is present
            }
        }
        // Print out results
        String cardName[] = {"A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "};
        System.out.println("Rank\tFrequency of one pair");
        for(int i = 0; i < 13; i++){
            System.out.print(cardName[i] + "\t" + onePair[i] + "\n");
        }
        System.out.println("------------");
        // Find number of hands without one pair
        int notOnePair = 10000;
        for(int i:onePair){
            notOnePair -= i;
        }
        System.out.println("Hands without exactly one pair: " + notOnePair);
    } // End of simulateOdds
  
  
}
// Cards: 0-12  -- Clubs
//        13-25 -- Diamonds
//        26-38 -- Hearts
//        39-51 -- Spades

/*
--Sample Output
Clubs:    J 4 
Diamonds: 
Hearts:   J 7 4 
Spades:   

Go again? Enter 'y' or 'Y', anything else to quit- y
Clubs:    Q 2 
Diamonds: A 
Hearts:   5 
Spades:   J 

Go again? Enter 'y' or 'Y', anything else to quit- q
  rank   freq of exactly one pair
    A       312
    K       307
    Q       339
    J       325
   10       323
    9       334
    8       363
    7       312
    6       339
    5       349
    4       328
    3       293
    2       327
----------------------------
 total not exactly one pair: 5749
*/