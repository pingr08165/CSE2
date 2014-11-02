// Ben Pingrey
// CSE02
// Homework 9
// Program to print out a pattern of number blocks using methods to allocate specific tasks

import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    } // End of main method
    
    // Additional methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // getInt()
    public static int getInt(){
        System.out.print("Enter an int: ");
        while(true){
            int i = checkInt();
            if(checkRange(i)){
                return i;
            }
        }
    } // End of getInt()
    
    // checkInt()
    public static int checkInt(){
        Scanner myScanner = new Scanner(System.in);
        while(!myScanner.hasNextInt()){
            myScanner.nextLine();
            System.out.print("You did not enter an int, try again: ");
        }
        return myScanner.nextInt();
    } // End of checkInt()
    // checkRange()
    public static boolean checkRange(int j){
        if(j <= 9 && j > 0){return true;}
        else{
            System.out.print("Int was not in range [1,9]. Try again: ");
            return false;
        }
    } // End of checkRange()
    
    // allBlocks()
    public static void allBlocks(int max){
        for(int i = 1; i <= max; i++){
            block(i, max);
        }
    } // End of allBlocks()
    
    // block()
    public static void block(int current, int max){
        // preform line() one time for each value of current
        for(int i = 0; i < current; i++){
            line(current, max);
        }
        // output line of hyphens at end of each block
        // Print out spaces
        for(int c = 0; c < max - current; c++){
            System.out.print(" ");
        }
        // Print out hyphens
        for(int i = 0; i < current*2 - 1; i++){
            System.out.print("-");
        }
        System.out.println("");
        return;
    }
    
    // line()
    public static void line(int current, int max){
        // Print out spaces
        for(int c = 0; c < max - current; c++){
            System.out.print(" ");
        }
        // Print out numbers
        for(int i = 0; i < current*2 - 1; i++){
            System.out.print(current);
        }
        System.out.println("");
        return;
    } // End of line()
} // End of class