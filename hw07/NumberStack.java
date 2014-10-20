// Ben Pingrey
// CSE 02
// Homework 7
// Program to print stacked number patterns using loops

// Import scanner
import java.util.Scanner;

// Create class
public class NumberStack{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner in = new Scanner(System.in);
        
        // Variable declarations
        int limit = 0;              // Number of times patterns are to be repeated (1-9)
        int currentNum = 1;         // Current iteration of pattern
        int n = 0;                  // Counter variable
        int i = 0;                  // Counter variable
        int j = 0;                  // Conuter variable
        int k = 0;                  // Counter variable
        
        // Get user input, verify input is valid
        while (limit < 1 || limit > 9){
            System.out.print("Enter an int between 1 and 9: ");
            while(!in.hasNextInt()){
                in.nextLine();
                System.out.print("Enter an int between 1 and 9: ");
            }
            limit = in.nextInt();
            in.nextLine();
        }
        // For loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("For loop stack:");
        currentNum = 1;
        for(currentNum = 1; currentNum <= limit; currentNum++){
            // Print out one iteration of pattern-------------------------
            for(j = 0; j < currentNum; j++){
                n = 0;
                // Print out the appropriate number of spaces
                for(n = 0; n < limit - currentNum; n++){
                    System.out.print(" ");
                }
                // Print out the appropriate number of currentNum characters
                for(i = 0; i < 2*(currentNum - 1) + 1; i++){
                    System.out.print(currentNum);
                }
                System.out.println("");
            }
            for(k = 0; k < limit - currentNum; k++){
                System.out.print(" ");
            }
            for(k = 0; k < 2*(currentNum-1)+1; k++){
                System.out.print("-");
            } // End of code for one iteration----------------------------
            System.out.println("");
        } // End of for loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        // While loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("While loop stack:");
        currentNum = 1;
        while(currentNum <= limit){
            // Print out one iteration of pattern-------------------------
            j = 0;
            while(j < currentNum){
                n = 0;
                // Print out the appropriate number of spaces
                while(n < limit - currentNum){
                    System.out.print(" ");
                    n++;
                }
                // Print out the appropriate number of currentNum characters
                i = 0;
                while(i < 2*(currentNum - 1) + 1){
                    System.out.print(currentNum);
                    i++;
                }
                System.out.println("");
                j++;
            }
            k = 0;
            while(k < limit - currentNum){
                System.out.print(" ");
                k++;
            }
            k = 0;
            while(k < 2*(currentNum-1)+1){
                System.out.print("-");
                k++;
            } // End of code for one iteration----------------------------
            System.out.println("");
            currentNum++;
        } // End of while loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        // Do while loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Do while loop stack:");
        currentNum = 1;
        if(currentNum <= limit){
            do{
                // Print out one iteration of pattern---------------------
                j = 0;
                if(j < currentNum){
                    do{
                        n = 0;
                        // Print out the appropriate number of spaces
                        if(n < limit-currentNum){
                            do{
                                System.out.print(" ");
                                n++;
                            }while(n < limit - currentNum);
                        }
                        // Print out the appropriate number of currentNum characters
                        i = 0;
                        if(i < 2*(currentNum - 1) + 1){
                            do{
                                System.out.print(currentNum);
                                i++;
                            } while(i < 2*(currentNum - 1) + 1);
                        }
                        System.out.println("");
                       j++;
                    }while(j < currentNum);
                }
                k = 0;
                if(k < limit - currentNum){
                    do{
                        System.out.print(" ");
                        k++;
                    } while(k < limit - currentNum);
                }
                k = 0;
                if(k < 2*(currentNum-1)+1){
                    do{
                        System.out.print("-");
                        k++;
                    } while(k < 2*(currentNum-1)+1); // End of code for one iteration
                }
                System.out.println("");
                currentNum++;
            }while(currentNum <= limit);
        } // End of do while loop stack~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
} // End of class