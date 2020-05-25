package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		
		while(temp>0) {
			 int lastDigit= temp%10;
			  r= r*10 + lastDigit;
			  
			  temp/= 10;
		}
		if(r==n) System.out.println("It is PalinDrome Number");
		else System.out.println("It is not PalinDrome Number");
		
		
		
	}

}
