/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
    
  public static void main(String []arg){
    Scanner myScanner = new Scanner(System.in);
    int percent;
    double proportion;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    if(!myScanner.hasNextInt()){
        System.out.println("Invalid input.");
        return; // Terminates program if input is invalid
    }
    percent = myScanner.nextInt();
    if(percent < 0 || percent > 99){
        System.out.println("Invalid input.");
        return; // Terminates program if input is outside of specified range
    }
    
   System.out.println("You entered "+percent+"%");
   
   //print out the proportion remaining 
   proportion = 1 - percent/100.0;
   
   System.out.printf("The proportion remaining is %.2f%n", proportion);
 
  }
}
  

/* Error report: 
 *    --Added a check to confirm that input is an int between 0 and 99
 *    --Modified proportion section of code to work for all inputs
 * 
 * 
 */