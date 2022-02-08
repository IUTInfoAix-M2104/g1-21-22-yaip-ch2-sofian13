import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class TD {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
     int size;
	 // Declare variables
      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
	  System.out.println("Entrez la taille");
      size = in.nextInt();
                     // Read next input as "int"
           // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
            System.out.print( "0" );   // Use print() without newline inside the inner loop
            
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
   }
}