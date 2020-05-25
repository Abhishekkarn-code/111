package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		float R =  sc.nextFloat();
		int T = sc.nextInt();
		
		float simpleInterest = P*T*R/100;
		System.out.println("The simple interest is " + simpleInterest); 
		
	}

}
