// Ben Pingrey
// CSE 02
// Homework 11, program 1
// Program to practice using methods with arrays

import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    } // End of main method
    
    // Additional methods
    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    } // End of listArray
    
    // hasDups()--Method to return true if there are duplicate entries in an int array
    public static boolean hasDups(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){return true;}  // Return true if any two entries are the same
            }
        }
        return false;
    } // End of hasDups()
    
    // exactlyOneDup()--Method to return true if there is exactly one duplicate
    public static boolean exactlyOneDup(int array[]){
        int dups = 0;   // Count the number of duplicates
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    dups += 1;      // Add 1 to dups if a duplicate is found
                }
            }
        }
        // Return appropriate result
        if(dups == 1){return true;}
        return false;
    } // End of exactlyOneDup()
}

/*
Sample Output:

Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- n
*/