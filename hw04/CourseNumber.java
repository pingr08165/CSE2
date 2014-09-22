// Ben Pingrey
// CSE 02
// Homework 4, part 3
// Program to receive a course semester and output the year/semester the course was offered

// Import scanner
import java.util.Scanner;

// Create class
public class CourseNumber{
    // Create main method
    public static void main(String[] args){
        // Create scanner instance
        Scanner myScanner = new Scanner(System.in);
        
        // Declare variables
        int courseNum;      // Course number as entered by the user
        int year;           // int representing the first four digits of courseNum
        int semester;       // int representing the last two digits of courseNum
        String semOutput;   // Semester as a string to be outputed to user
        
        // Get input
        System.out.print("Please enter the course semester number: ");
        if(!myScanner.hasNextInt()){
            System.out.println("You did not enter an integer!");
            return; // Terminates program if integer was not entered
        } // end of if
        
        courseNum = myScanner.nextInt(); // sets courseNum to value entered
        
        // Extract the year from courseNum
        year = (int)((double) courseNum / 100);
        
        if(year > 2014 || year < 1865){
            System.out.println("The number was outside the range [186510,201440]");
            return; // Terminates program if year is invalid
        }
        
        // Extract the semester from courseNum
        semester = (int) (courseNum - year*100);
        
        // Determine if semester is invalid
        if ((semester < 10) || (semester > 40) || (semester % 10 != 0)){
            System.out.printf("%d is not a valid semester%n", semester);
            return; // Terminates program if semester is invalid
        }
        
        if (semester == 10){
            semOutput = "Spring";    // Sets semOutput to Spring
        }
        else if (semester == 20){
            semOutput = "Summer 1";  // Sets semOutput to Summer 1
        }
        else if (semester == 30){
            semOutput = "Summer 2";  // Sets semOutput to Summer 2
        }
        else {
            semOutput = "Fall";      // Sets semOutput to Fall
        }
        
        // Output results
        System.out.printf("The course was offered in the %s semester of %d.%n", semOutput, year);
        
    } // End of main method
} // End of class