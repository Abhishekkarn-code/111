package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		System.out.println("Enter the arrays");
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		
		
		
		for(int i=0; i<n-1; i++) {
			
			boolean sorted= true;
			
			for(int j=0; j<n-1-i; j++) {
				if(a[j+1]<a[j]) {
					int temp= a[j+1];
					a[j+1]= a[j];
					a[j]= temp;
					
					sorted = false;
				}	
			}
			if(sorted) break;
			
		}
		for(int item: a) {
			System.out.print(item+" ");
		}
	}

}
