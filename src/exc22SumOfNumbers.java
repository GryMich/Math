import java.util.Scanner;

public class exc22SumOfNumbers {

	public static void main(String[] args) {

	Scanner reader = new Scanner (System.in);
	
	int sum = 0;
	int read;
	
	System.out.println("Type first number: ");
	read = Integer.parseInt(reader.nextLine());
	
	System.out.println("Type second number: ");
	read = read + Integer.parseInt(reader.nextLine());
	
	System.out.println("Type third number: ");
	read = read + Integer.parseInt(reader.nextLine());
	
	sum = read;
	
	System.out.println("Sum of numbers: " + sum);
	

	}

}
