public class exc39MethodsPrinting {
	//39.0 - 39.4
	private static void printTriangle (int size) {
		
		int i = 0;
		int a = 1;
		
		while (size>i && a<=size) {
			
			printStars(a++);
			
			i++;
		}
	}
	private static void printRectangle(int width, int heigth) {
		
		int i = 0;
		
		while (width>=i && heigth>i) {
			
			printStars (width);
			
			i++;
			
			
		}
		
	}
	private static void printSquare (int sideSize) {
		
		int i = 0;
		
		while (i<sideSize) {
			
			printStars(4);
			i++;
			
			if (i==sideSize) {
						break;
			}
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

	printTriangle(4);
	
	}

}
