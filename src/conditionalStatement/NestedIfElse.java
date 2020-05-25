package conditionalStatement;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int a = 12, b = 14, c=18;
		int Max= 0;
		
//		if(a>b) {
//			if(a>c) {
//				Max = a;
//			} else {
//				Max = c;
//			}
//		} else {
//			if(b>c) {
//				Max=b;
//			}
//			else {
//				Max=c;
//			}
//		}
		
		Max = a>b ? a>c ? a:c : b>c ? b:c; 
				
				
		System.out.println("Max number is " + Max);
		
	}
}

	
			