

public class exc40PrintingLikeABoss {
	// 40.0 - 40.3
	private static void xmasTree (int height) {
		
		int i = 0;
		int a = 1;
		int b = height--;
		int c = 0;
		
		while (height>=i) {
		
		printWhitespaces(b);
		printStars(a);
		
		i++;
		b--;
		a=a+2;
		
				
		if (height<i) {
						
			printWhitespaces((a-2)/2);
			printStars(3);
			printWhitespaces((a-2)/2);
			printStars(3);
			
			}
		}
	}
	
	private static void printTriangle (int size) {
		
		int i = 0;
		int a = 1;
		int b = size--;
		
		while (size>=i) {
			
			printWhitespaces(b);
			printStars(a);
			
			i++;
			b--;
			a++;
		
		}
	}
	private static void printWhitespaces (int size) {
		
		int i = 0;
		
		while (i<size) {
			
			System.out.print (" ");
			i++;
		}
	}
	private static void printStars (int amount) {
			
		int i = 0;
		
		while (i<amount) {
			
			System.out.print("*");
			i++;
			
			
		}
		
		System.out.println();	
	}

	public static void main(String[] args) {

	xmasTree(20);
	
	}

}
