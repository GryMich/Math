import java.util.Scanner;
public class naukaScanner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int numberOne = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int numberTwo = Integer.parseInt(reader.nextLine());
		
		double sum = (double) numberOne / numberTwo;
		
		System.out.print("Sum of the numbers: " + sum);
		
		
		
	}

}
