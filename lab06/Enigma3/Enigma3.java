/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }                   // n = 45, k = 53
    switch(n+k){        
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:          // Switch leaps here because n + k is 98
        n/=5;           // n becomes 9
        k/=9;           // k becomes 5
      default:
        n-=3;           // n becomes 6
        k-=5;           // k becomes 0, causing the runtime error in line 48
    }
     out+=1/n + 1/k;                // Division by zero because k = 0
    System.out.println(out);
  }
}

/*
 * Error report:
 *      Runtime error from division by zero in the original code's line 48
 *          -- Value of k is zero by that line, causing division by zero
 *          -- Going into line 32 switch statement, k = 53, n = 45
 *          -- K is assigned a value of zero on line 46
 * 
 */
