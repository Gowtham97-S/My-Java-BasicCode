import java.util.Scanner;
public class ScannerInput {

	public static void main (String[]args) {
		 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number A = ");
		int firstNumber= scanner.nextInt();
		
		System.out.println("Enter first number B = ");
		int secondNumber = scanner.nextInt();
		
		int total = firstNumber + secondNumber ;
		
		System.out.println("Total is "+ total) ;
		
	}
}
