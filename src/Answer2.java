import java.util.Scanner;
/**
 * Trying if-else statement and modulus (%) operator.
 */
public class Answer2 {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
	  System.out.print("Enter number: ");
	  Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number % 2 == 0 ) {
         System.out.println( "Even Number" );   // even number
      } else {
         System.out.println( "Odd Number" );   // odd number
      }
      System.out.println( "bye!" );
   }
}
