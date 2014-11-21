// Ben Pingrey
// CSE 02
// Lab 13
// Program to practice sorting multidimensional arrays

// Import Random class  
import java.util.Random;
// Create class
public class RaggedArray{
    // Create main method
    public static void main(String[] args){
        // Create new Random object
        Random rand = new Random();
        
        // Declare / partially allocate 2-D array
        int[][] twoD = new int[5][];
        
        // Allocate each member of twoD
        for(int i = 0; i < 5; i ++){
            twoD[i] = new int[5+3*i];
        }
        
        // Fill each entry in twoD with a random int between 0 and  39 (inclusive)
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < twoD[i].length; j++){
                twoD[i][j] = rand.nextInt(40);
            }
        }
        // Display unsorted array
        System.out.println("Unsorted Array:");
        printArray(twoD);
        // Sort each member array of twoD
        for(int i = 0; i < 5; i++){
            sort(twoD[i]);
        }
        // Display sorted array
        System.out.println("Sorted Array:");
        printArray(twoD);
    } // End of main method
    // Additional methods
    // printArray() --Method to print out the values of a 2-D array
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("%-3d", array[i][j]);
            }
            System.out.println();
        } 
    } // End of printArray()
    
    // sort() --Method to sort the members of a one dimensional array of ints in increasing numberical order
    public static void sort(int[] input){
        // End condition (array is already sorted)
        boolean sorted = true;
        for(int i = 0; i < input.length-1; i++){
            if(input[i] > input[i+1]){
                sorted = false;
            }
        }
        if(sorted){return;}
        // Take first unsorted (greater than the following member) value and swap it with next member
        int temp;
        for(int i = 0; i < input.length-1; i++){
            if(input[i] > input[i+1]){
                temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
                break; // Exit the loop once a swap has been made
            }
        }
        // Call sort recursively until array is sorted
        sort(input);
    } // End of sort()
} // End of class