import java.util.Scanner;
public class gradesPoints {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Type the points: ");
		int a = Integer.parseInt(reader.nextLine());
		
		if (a >= 50) {
			System.out.print("5");
		}	else if (a >= 45) {
			System.out.print("4");
		}	else if (a >= 40 ) {
			System.out.print("3");
		}	else if (a >= 35) {
			System.out.print("2");
		}	else if (a >= 0) {
			System.out.print("1");
		}

	}
	
}
