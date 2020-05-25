package loops;

import java.util.Scanner;

public class TableAtOnce {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int multiple;
		
		for(int table=1; table<=n; table++) {
			for(int i=1; i<=10; i++) {
				multiple= table*i;
				System.out.print(multiple+ " ");
			}
			System.out.println();
		}
				
		

	}

}
