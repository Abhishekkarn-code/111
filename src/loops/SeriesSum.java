package loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		float S=0;
		float i;
		
		for(i=1; i<=n; i++) {
			S= S+(1/i);
		}
		System.out.println("Sum of series " + S);
	}
		

}
