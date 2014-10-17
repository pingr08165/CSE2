// Ben Pingrey
// CSE 02
// Lab 08 -- rewriting loops as different kinds of loops

import java.util.Scanner;
public class MoreLoops {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        /*
        System.out.print("Enter an int- ");
        while (!scan.hasNextInt()) {
            scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
        } */
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
        //DO-WHILE LOOP
        System.out.print("Enter an int- ");
        if(!scan.hasNextInt()){
            do{
                scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
            } while (!scan.hasNextInt());
        }
        
        n = scan.nextInt();
        /*
        for (int j = 0; j < n && j < 40; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        } */
        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
        //WHILE STATEMENTS
        int j = 0;
        while(j < n && j < 40){
            int k = 0;
            while(k < j+1){
                System.out.print('*');
                k++;
            }
            System.out.println();
            j++;
        }

        int k = 4;
        /*
        do {
            System.out.println("k=" + k);
            k++;
        }
        while (k < 4); */
        
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP
        System.out.println("k=" + k);
        k++;
        while(k < 4){
            System.out.println("k=" + 4);
        }

        int count = 0;
        /*
        while (true) {
            switch (n) {
                default: System.out.println(n + " is > 5 or <1");
                break;
                case 1:
                case 2:
                    System.out.print("Case 2 ");
                    continue;
                case 3:
                    break;
                case 4:
                    System.out.println("Case 4");
                case 5:
                    System.out.println("Case 5");
                    break;
            }
            count++;
            if (count > 10)
                break;
        } */
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
        for(boolean bool = true; bool;){
            if(n < 1 || n > 5){
                System.out.println(n + " is > 5 or <1");
            }
            if(n == 1 || n == 2){
                System.out.print("Case 2 ");
                continue;
            }
            if(n == 4){
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            if(n == 5){
                System.out.println("Case 5");
            }
            count++;
            if(count > 10){
                break;
            }
        }
    }
}