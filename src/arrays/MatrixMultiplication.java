package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Dimension of 1st array");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		
		System.out.println("Enter an arrays");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Dimension of 2st array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int b[][] = new int[row][col];
		
		System.out.println("Enter an arrays");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		if(cols == row) {
			int c[][] = new int[rows][col];
				for(int i=0; i<rows; i++) {
					for(int j=0; j<col; j++) {
						c[i][j] = a[i][j] * b[j][i];
					}
				}
				
				System.out.println("Result array c is");
				for(int i=0; i<rows; i++) {
					for(int j=0; j<col; j++) {
						System.out.print(c[i][j] +" ");
					}
				}
			
		} else {
			System.out.println("Cannot multiply the matrices");
		}
		
	}

}
