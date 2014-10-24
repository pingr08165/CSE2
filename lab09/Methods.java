// Ben Pingrey
// CSE 02
// Lab 09
// Program to practice with creating methods


// Import scanner
import java.util.Scanner;
// Create class
public class Methods {
    // Main method
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order");
    } // End of main method
    
    // Other Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // getInt--method to prompt the user to enter an int, confirm validity of input, and return int
    public static int getInt(Scanner myScanner){
        System.out.print("Enter an int: ");
        while(!myScanner.hasNextInt()){
            myScanner.nextLine(); // Clear junk input
            System.out.print("Invalid entry. Try again: ");
        }
        int num = myScanner.nextInt();
        myScanner.nextLine();   // Clear junk input
        return num;
    } // End of getInt
    
    // larger--method to receive two ints and return the largest one
    public static int larger(int a, int b){
        if (a > b) {return a;}
        else {return b;}
    } // End of larger
    
    // ascending--method to return true if 3 ints are entered in ascending order, else return false
    public static boolean ascending(int a, int b, int c){
        if(a <= b && b <= c){return true;}
        else{return false;}
    } // End of ascending
}
