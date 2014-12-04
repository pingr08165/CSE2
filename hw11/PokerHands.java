// Ben Pingrey
// CSE02
// Homework 11
// Program 1-- Program to rank inputed poker hands

// Import scanner
import java.util.Scanner;

public class PokerHands {
    // Create main method
    public static void main(String[] args) {
            // Create scanner
            Scanner in = new Scanner(System.in);

            // Declare variables
            int[] hand = new int[5]; // Array of integers representing cards in poker hand
            int suit; // Holds value pertaining to suit chosen by user
            int card; // Holds value pertaining to card chosen by user
            char suitInput = ' '; // Holds char entered by user representing suit
            String input; // String input by user
            String cardInput = ""; // Holds char entered by user representing card
            int finalCard; // Holds final value (1-52) of card
            int[] rank = new int[13]; // Counts frequency of each card appearence in hand
            int[] frequency = new int[5];
            
            // fill hand with zeros
            for(int i = 0; i < 5; i++){
                hand[i] = 0;
            }

            // Get input
            for (int i = 0; i < 5;) {
                // Reset input variables 
                suitInput = ' ';
                cardInput = "";
                // Get suit input
                while (!(suitInput == 'c') && !(suitInput == 'd') && !(suitInput == 'h') && !(suitInput == 's')) {
                    System.out.print("Choose card suit ('c' 'd' 'h' or 's'): ");
                    input = in.next();
                    if (input.length() == 1) {
                        suitInput = input.charAt(0);
                    }
                }
                if (suitInput == 'c') {
                    suit = 1;
                }
                else if (suitInput == 'd') {
                    suit = 2;
                }
                else if (suitInput == 'h') {
                    suit = 3;
                }
                else {
                    suit = 4;
                }
                // Get card input
                while (!cardInput.equals("a") && !cardInput.equals("k") && !cardInput.equals("q") && !cardInput.equals("j") && !cardInput.equals("2") && !cardInput.equals("3") && !cardInput.equals("4") && !cardInput.equals("5") && !cardInput.equals("6") && !cardInput.equals("7") && !cardInput.equals("8") && !cardInput.equals("9") && !cardInput.equals("10")) {
                    System.out.print("Choose card value ('a' 'j' 'q' 'k' or 2-10): ");
                    cardInput = in.next();
                }
                
                if (cardInput.equals("a")) {
                    card = 1;
                }
                else if (cardInput.equals("j")) {
                    card = 11;
                }
                else if (cardInput.equals("q")) {
                    card = 12;
                }
                else if (cardInput.equals("k")) {
                    card = 13;
                }
                
                else{
                    card = Integer.parseInt(cardInput);
                    
                }
                // Add card to hand[]
                finalCard = 13*(suit-1) + card;
                if(!search(hand,finalCard)){
                    hand[i] = finalCard;
                    i++;
                }
                else{
                    System.out.println("Card already in hand, try again.");
                }
            }
            // Output hand
            // Clubs output
            System.out.print("Clubs: ");
            for(int i = 0; i < 5; i++){
                if(hand[i] > 0 && hand[i] < 14){
                    if(hand[i]%13 > 1 && hand[i]%13 < 11){
                        System.out.print(hand[i]%13 + " ");
                    }
                    else if(hand[i]%13 == 1){System.out.print("a ");}
                    else if(hand[i]%13 == 11){System.out.print("j ");}
                    else if(hand[i]%13 == 12){System.out.print("q ");}
                    else if(hand[i]%13 == 0){System.out.print("k ");}
                }
            }
            System.out.println();
            // End of clubs output
            
            // Diamonds output
            System.out.print("Diamonds: ");
            for(int i = 0; i < 5; i++){
                if(hand[i] > 13 && hand[i] < 27){
                    if(hand[i]%13 > 1 && hand[i]%13 < 11){
                        System.out.print(hand[i]%13 + " ");
                    }
                    else if(hand[i]%13 == 1){System.out.print("a ");}
                    else if(hand[i]%13 == 11){System.out.print("j ");}
                    else if(hand[i]%13 == 12){System.out.print("q ");}
                    else if(hand[i]%13 == 0){System.out.print("k ");}
                }
            }
            System.out.println();
            // End of Diamonds output
            
            // Hearts output
            System.out.print("Hearts: ");
            for(int i = 0; i < 5; i++){
                if(hand[i] > 26 && hand[i] < 40){
                    if(hand[i]%13 > 1 && hand[i]%13 < 11){
                        System.out.print(hand[i]%13 + " ");
                    }
                    else if(hand[i]%13 == 1){System.out.print("a ");}
                    else if(hand[i]%13 == 11){System.out.print("j ");}
                    else if(hand[i]%13 == 12){System.out.print("q ");}
                    else if(hand[i]%13 == 0){System.out.print("k ");}
                }
            }
            System.out.println();
            // End of Hearts output
            
            // Spades output
            System.out.print("Spades: ");
            for(int i = 0; i < 5; i++){
                if(hand[i] > 39 && hand[i] < 53){
                    if(hand[i]%13 > 1 && hand[i]%13 < 11){
                        System.out.print(hand[i]%13 + " ");
                    }
                    else if(hand[i]%13 == 1){System.out.print("a ");}
                    else if(hand[i]%13 == 11){System.out.print("j ");}
                    else if(hand[i]%13 == 12){System.out.print("q ");}
                    else if(hand[i]%13 == 0){System.out.print("k ");}
                }
            }
            System.out.println();
            // End of Spades output
            
            // Determine what hand is present
            // fill array rank (gives the number of each of a specific type of card present)
            for(int i = 0; i < 13; i++){
                rank[i] = 0;
            }
            for(int i = 0; i < 5; i++){
                rank[hand[i]%13] += 1;
            }
            if(search(rank, 4)){
                System.out.println("Hand is four of a kind");
                return;
            }
            if(search(rank, 3)){
                if(search(rank, 2)){
                    System.out.println("Hand is a full house.");
                    return;
                }
            }
            // Search for one or two pairs
            int pairs = 0;
            for(int i = 0; i < 13; i++){
                if(rank[i] == 2){
                    pairs++;
                }
            }
            if(pairs == 2){
                System.out.println("Hand is two pairs.");
                return;
            }
            if(pairs == 1){
                System.out.println("Hand is one pair.");
                return;
            }
            
            // Search for a straight
            boolean straight = false;
            if((hand[0]-1)/13 == (hand[1]-1)/13 && (hand[0]-1)/13 == (hand[2]-1)/13 && (hand[0]-1)/13 == (hand[3]-1)/13 && (hand[0]-1)/13 == (hand[4]-1)/13){
                straight = true;
            }
            // Search for a flush
            // Reorder rank so that rank[0] through rank[9] represent 2-10 and rank[10] through rank[13] represent j, q, k, a
            int temp;
            for(int i = 0; i < 11; i++){
                temp = rank[i];
                rank[i] = rank[i+2];
                rank[i+2] = temp;
            }
            
            // Find first index value of new rank that is filled
            int index = -1;
            for(int i = 0; i < 13; i++){
                if(rank[i] != 0){
                    index = i;
                    break;
                }
            }
            // Search for consecutive entries from index onward
            boolean flush = true; // Start by assuming that there is a flush
            for(int i = index; i < index+5; i++){
                if(rank[i] != 1){
                    flush = false; // If no consecutive card is found, there is no flush
                    break;
                }
            }
            
            // Check for royal flush and straight flush
            if(flush && straight){
                if(index == 8){
                    System.out.println("Hand is roayl flush");
                }
                else{
                    System.out.println("Hand is straight flush");
                }
                return;
            }
            if(flush){
                System.out.println("Hand is flush");
                return;
            }
            if(straight){
                System.out.println("Hand is straight");
                return;
            }
            
            System.out.println("Hand is high card");
            
        } // End of main method

    // sort()-- Method to sort array of ints in increasing numerical order (using a selection sort)
    public static void sort(int[] unsorted) {
            int temp;
            int min;
            int index;
            for (int i = 0; i < unsorted.length - 1; i++) {
                // Find the lowest unsorted entry in unsorted
                min = unsorted[i];
                index = i;
                for (int j = i + 1; j < unsorted.length; j++) {
                    if (unsorted[j] < min) {
                        min = unsorted[j];
                        index = j;
                    }
                }
                // Swap value of unsorted[i] and unsorted[j]
                temp = unsorted[i];
                unsorted[i] = unsorted[index];
                unsorted[index] = temp;
            }
        } // End of sort()
        
        // search() -- Method to search an array for an int
        public static boolean search(int[] input, int target){
            for(int i = 0; i < input.length; i++){
                if(input[i] == target){return true;}
            }
            return false;
        }
        
} // End of class


/*
ace = 1
2-10 = 2-10
jack = 11
queen = 12
king = 13
*/