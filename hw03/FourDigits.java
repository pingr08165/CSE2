//Ben Pingrey
//CSE02, Homework 3, program 3
//Program to display the first four digits after the decimal point of an inputted number

//Import scanner
import java.util.Scanner;

//Create class
public class FourDigits{
    //Create main method
    public static void main(String[] args){
        //Create scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Declare variables
        double value;       //The number entered by the user
        double decimals;    //The decimals of the entered number
        int firstDigit;     //First digit after the decimal place
        int secondDigit;    //Second digit after the decimal place
        int thirdDigit;     //Third digit after the decimal place
        int fourthDigit;    //Fourth digit after the decimal place
        
        //Get input
        System.out.print("Enter a double value to get back the first 4 digits after the decimal point: ");
        value = myScanner.nextDouble();
        
        //Reduce value to decimals with modulus operator
        decimals = value % 1;
        
        //Retrieve first decimal digit by multiplying by 10 and casting to int
        firstDigit = (int)(10*decimals);
        
        //Retrieve second decimal digit by multiplying by 100, taking modulus with 10, and casting to int
        secondDigit = (int)(100*decimals%10);
        
        //Retrieve third decimal digit via same process as above
        thirdDigit = (int)(1000*decimals%10);
        
        //Retrieve fourth decimal digit
        fourthDigit = (int)(10000*decimals%10);
        
        //Output results
        System.out.println("The first four decimal digits are: "+firstDigit+secondDigit+thirdDigit+fourthDigit);
        
    } // End of main method
} //End of class