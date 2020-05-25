package loops;
import java.util.Scanner;

public class RaisingPower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		int p=1;
		
		for(int i=x; i>0; i--) {
			p= p*y;
		}
		System.out.println("The value is " + p);
		
		

	}

}
