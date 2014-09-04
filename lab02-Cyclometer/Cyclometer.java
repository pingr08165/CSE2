// Ben Pingrey
// CSE02 
/* Lab 2--Create a program that records information about a bike trip with variables
   and outputs that information when run
*/

// Establish class
public class Cyclometer {
    // Establish main method
    public static void main(String[] args){
        // Initialize and assign variables
        // Input data
        int secsTrip1 = 480;         // Duration of trip 1
        int secsTrip2 = 3220;        // Duration of trip 2
        int countsTrip1 = 1561;      // Number of counts on trip 1 (rotations)
        int countsTrip2 = 9037;      // Number of counts on trip 2 (rotations)
        
        // Intermediate and output variables
        double wheelDiameter = 27.0;    // Diameter of bycicle's wheels in inches
        double pi = 3.14159;            // Value of pi
        double feetPerMile = 5280;      // Number of feet per mile
        double inchesPerFoot = 12;      // Number of inches per foot
        double secondsPerMinute = 60;   // Number of seconds per minute
        
        // Initialize variables for distances of each trip and total distance
        double distanceTrip1, distanceTrip2, totalDistance;
        
        // Print out stored input data for time and counts for each trip
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+(countsTrip1)+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+(countsTrip2)+" counts.");
        
        // Calculate trip distances and total distance
        distanceTrip1 = countsTrip1*wheelDiameter*pi;                           // Gives distance for trip 1 in inches
        distanceTrip1 /= inchesPerFoot*feetPerMile;                             // Converts distance 1 into miles
        distanceTrip2 = countsTrip2*wheelDiameter*pi/inchesPerFoot/feetPerMile; // Gives distance of trip 2 in miles directly
        totalDistance = distanceTrip1 + distanceTrip2;                          // Gives the total distance in miles
        
        // Print out results
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");              // Prints distance of trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");              // Prints distance of trip 2
        System.out.println("The total distance was "+totalDistance+" miles.");  // Prints total distance traveled
        
        
    } // End of main method
} // End of class