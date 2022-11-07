import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		
		 System.out.println("Enter mark: ");
		 Scanner sc = new Scanner(System.in);
		 int mark = sc.nextInt();   // Set the value of "mark" here!
		 
	     System.out.println("The mark is " + mark);
	 
	      // if-else statement
	      if (mark >= 50 ) {
	         System.out.println("PASS" );
	      } else {
	         System.out.println("FAIL");
	      }
	      System.out.println("DONE");


	}

}
