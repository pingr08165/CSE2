// Ben Pingrey
// CSE02
// Homework 11
// Program 2-- program to sort a 3d array

// Import Random class
import java.util.Random;
// Create class
public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    } // End of main method
    
    // buildMat3d()--Method to construct a ragged 3d array
    public static int[][][] buildMat3d(){
        int[][][] matrix = new int[3][][];
        // Allocate and assign values to matrix;
        for(int i = 0; i < 3; i++){
            matrix[i] = new int[1+2*(i+1)][];
            // Fill matrix[i] with arrays of ints
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = new int[i+j+1];
                // Fill matrix[i][j] with ints
                fill(matrix[i][j]);
            }
        }
        return matrix;
    } // End of buildMat3d
    
    // fill()--Method to fill an arry with random ints in the range 1-99 (inclusive)
    public static void fill(int[] array){
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(99) + 1;
        }
    } // End of fill()
    
    // show() -- Method to print out all slabs of the input array
    public static void show(int[][][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("---------- Slab " + (i+1));
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.printf("%-2d ", array[i][j][k]);
                }
                System.out.println();
            }
        }
    } // End of show()
    
    // findMin() --Method to find the smallest entry in a 3D array
    public static int findMin(int[][][] array){
        int min = array[0][0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for( int k = 0; k < array[i][j].length; k++){
                    if(array[i][j][k] < min){
                        min = array[i][j][k];
                    }
                }
            }
        }
        return min;
    } // End of findMin()
    
    // sort()-- Method to sort array of ints in increasing numerical order (using a selection sort) (single dimensional array parameter version)
    public static void sort(int[] unsorted) {
            int temp;
            int min;
            int index;
            for (int i = 0; i < unsorted.length - 1; i++) {
                // Find the lowest unsorted entry in unsorted
                min = unsorted[i];
                index = i;
                for (int j = i + 1; j < unsorted.length; j++) {
                    if (unsorted[j] < min) {
                        min = unsorted[j];
                        index = j;
                    }
                }
                // Swap value of unsorted[i] and unsorted[j]
                temp = unsorted[i];
                unsorted[i] = unsorted[index];
                unsorted[index] = temp;
            }
        } // End of sort()
        
        // sort() --Method to sort a 2D array using an insertion sort
        public static void sort(int[][] array){
            // Sort each single dimensional array in array using the int[] version of sort above (a selection sort)
            for(int i = 0; i < array.length; i++){
                sort(array[i]);
            }
            // Preform insertion sort on array[] based on the first member of each element of array[][]
            for(int i = 1; i < array.length; i++){
                int j = i;
                while(j > 0 && array[j][0] < array[j-1][0]){
                    // Swap array in question with member to left if current member's first entry is less (out of order). Repeat until individual array is sorted
                    int[] temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
            }
        } // End of sort()
    
} // End of class