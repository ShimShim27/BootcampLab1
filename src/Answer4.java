import java.util.Scanner;
/**
 * Trying nested-if and switch-case statements.
 */
public class Answer4 {  
   public static void main(String[] args) {
	  
	  System.out.println("Enter day dayNumber: ");
	  Scanner sc = new Scanner(System.in);
      int dayNumber = sc.nextInt();  
      
 
      // Using nested-if
      if (dayNumber == 0) {   // Use == for comparison
         print("Sunday");
      } else if ( dayNumber == 1 ) {
    	  print("Monday");
      }else if ( dayNumber == 2) {
    	  print("Tuesday");
      } else if ( dayNumber == 3 ) {
    	  print("Wednesday");
      } else if ( dayNumber == 4 ) {
    	  print("Thursday");
      } else if ( dayNumber == 5 ) {
    	  print("Friday");
      } else if ( dayNumber == 6 ) {
    	  print("Saturday");
      }  else {
    	  print("Not a valid day");
      }
      
      
      // Using switch-case-default
      switch(dayNumber) {
         case 0: 
            print( "Sunday" ); 
            break;  // Don't forget the "break" after each case!
         case 1: 
            print("Monday" ); 
            break;
         case 2: 
             print("Tuesday" ); 
             break;
         case 3: 
             print("Wednesday" ); 
             break;
         case 4: 
             print("Thursday" ); 
             break;
         case 5: 
             print("Friday"); 
             break;
         case 6: 
             print("Saturday" ); 
             break;
         default: 
        	 print("Not a valid day"); 
      }
   }
   
   public static void print(String s) {
	   System.out.println(s);
   }
}
   
   
