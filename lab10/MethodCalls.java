public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    } // End of main method
    
    // addDigit()-- method to add a digit between 0 and 9 to the beginning of the entered int
    public static int addDigit(int number, int digit){
        int signMultiplier = 1;                         // Represents the sign of the original number
        String numString;
        if(digit < 0 || digit > 9){
            return number;                              // Return number if digit is not between 0 and 9
            }
        if (number < 0){
            signMultiplier = -1;                        // Change sign if number is negative
        }
        numString = String.valueOf(Math.abs(number));   // Convert number to string to use its length to determine what to multiply digit by
        return (int)(signMultiplier*(digit*Math.pow(10,numString.length()) + Math.abs(number))); 
        
    } // End of addDigit()
    
    // join()-- Method to join two ints together as per addDigit (but accepts any ints)
    public static int join(int modifier, int base){
        if(modifier == 0){return base;}     // End condition
        int signMultiplier = 1;    
        if(modifier < 0){
            modifier = Math.abs(modifier);
            signMultiplier = -1;            // Accounts for the case of a negative modifier int
        }
        // Add the last digit of modifier to base using addDigit()
        int digit = modifier % 10;
        base = addDigit(base, digit);
        modifier = (int)(modifier/10.0);    // Modify value of modifier
        base = join(modifier, base);        // Recursively call join() for new base and modifier
        
        return base*signMultiplier;         // return result
    } // End of join()
    
} // End of class 
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
