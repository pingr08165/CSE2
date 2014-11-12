// Ben Pingrey
// CSE 02
// Lab 12
// Program to practice writing methods dealing with arrays


public class ArrayMath {
    // Main method
    public static void main(String[] arg) {
        double x[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            y[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            z[] = {
                2.3, 13, 14
            },
            w[] = {
                2.3, 13, 14, 12
            },
            v[],
            u[] = {
                2.3, 12, 14
            };
        v = addArrays(x, y);
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x) +
            " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) +
            " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) +
            " == " + display(z));

    } // End of main method
    
    // Additional methods
    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    } // End of display()
    
    // equals() --Method to return true only if two arrays are of the same length and contain the same values
    public static boolean equals(double one[], double two[]){
        if(one.length != two.length){return false;} // Return false if array lengths differ
        // Return false if any of the array entries do not match
        for(int i = 0; i < one.length; i++){
            if(one[i] != two[i]){return false;}
        }
        // Otherwise, return true
        return true;
    } // End of equals()
    
    // addArrays() --Method to add the values of corresponding entries to create a new array. Assumes 0 for nonexistant values when array lengths differ
    public static double[] addArrays(double one[], double two[]){
        // Determine length of larger array
        int maxLength;
        int minLength;
        if(one.length > two.length){
            maxLength = one.length;
        }
        else{
            maxLength = two.length;
        }
        
        // Create result array with 0 for all members
        double result[] = new double[maxLength];
        for(int i = 0; i < maxLength; i++){
            result[i] = 0;
        }
        
        // Add the values in array one to result
        for(int i = 0; i < one.length; i++){
            result[i] += one[i];
        }
        // Repeat for array two
        for(int i = 0; i < two.length; i++){
            result[i] += two[i];
        }
        // Return result
        return result;
        
        
    } // End of addArrays()
}

/*
//output:

OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/