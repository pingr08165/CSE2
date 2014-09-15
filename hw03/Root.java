//Ben Pingrey
//CSE02, Homework 3, program 2
//A program to estimate the cube root of an entered value

//Import scanner class
import java.util.Scanner;

//Create class
public class Root{
    //Create main method
    public static void main(String[] args){
        //Create scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Declare variables
        double number;          //Number to have its cube root taken
        double guess;           //Guessed cube root
        double calcNum;         //Number calculated from cubing guess
        
        //Get input
        System.out.print("Enter a double to have its cube root approximated: ");
        number = myScanner.nextDouble();
        
        //Calculate cube root
        //Initial guess is number / 3
        guess = number/3;
        
        //Refine guess 5 times 
        guess = (2*guess*guess*guess+number)/(3*guess*guess);   //Refined 1 time
        guess = (2*guess*guess*guess+number)/(3*guess*guess);   //Refined 2 times
        guess = (2*guess*guess*guess+number)/(3*guess*guess);   //Refined 3 times
        guess = (2*guess*guess*guess+number)/(3*guess*guess);   //Refined 4 times
        guess = (2*guess*guess*guess+number)/(3*guess*guess);   //Refined 5 times
        
        //Calculate number using guessed root
        calcNum = guess*guess*guess;
        
        //Output results with 10 decimal places
        System.out.printf("The cube root of %f is approximately %.10f%n", number, guess);
        System.out.printf("%.10f*%.10f*%.10f = %.10f%n", guess, guess, guess, calcNum);
        
        
    } //End of main method
    
} //End of class