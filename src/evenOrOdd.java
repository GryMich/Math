import java.util.Scanner;
public class evenOrOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number1 = Integer.parseInt(reader.nextLine());
		
		int number2 = number1 % 2;
		
		if (number2 == 0) {
			System.out.print("Number is even");
		} else 
				System.out.print("Number is odd");
	    }
		
	}


