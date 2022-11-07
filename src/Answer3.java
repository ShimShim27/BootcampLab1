import java.util.Scanner;
/**
 * Trying nested-if and switch-case statements.
 */
public class Answer3 {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
	  
	  System.out.println("Enter number: ");
	  Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();  // Set the value of "number" here!
      
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         print("ONE");
      } else if ( number == 2 ) {
    	  print("TWO");
      }else if ( number == 3 ) {
    	  print("THREE");
      } else if ( number == 4 ) {
    	  print("FOUR");
      } else if ( number == 5 ) {
    	  print("FIVE");
      } else if ( number == 6 ) {
    	  print("SIX");
      } else if ( number == 7 ) {
    	  print("SEVEN");
      } else if ( number == 8 ) {
    	  print("EIGHT");
      } else if ( number == 9 ) {
    	  print("NINE");
      }  else {
    	  print("OTHER");
      }
      
      
      // Using switch-case-default
      switch(number) {
         case 1: 
            print( "ONE" ); 
            break;  // Don't forget the "break" after each case!
         case 2: 
            print("TWO" ); 
            break;
         case 3: 
             print("THREE" ); 
             break;
         case 4: 
             print("FOUR" ); 
             break;
         case 5: 
             print("FIVE" ); 
             break;
         case 6: 
             print("SIX"); 
             break;
         case 7: 
             print("SEVEN" ); 
             break;
         case 8: 
             print("EIGHT" ); 
             break;
         case 9: 
             print("NINE" ); 
             break;
                
         default: 
        	 print("OTHER"); 
      }
   }
   
   public static void print(String s) {
	   System.out.println(s);
   }
}
   
   
