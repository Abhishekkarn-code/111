package loops;

import java.util.Scanner;

public class SeriesSum2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		float S= 0;
		
		for(float i=1; i<=n; i++) {
			if(i%2==0) {
				S =S-(1/i);
			}else {
				S=S+(1/i);
			}
		}
		System.out.println("Sum is " + S);
	}	 

}
