import java.util.Scanner;

public class exc33SumBetweenTwoNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Type first number: ");
		int a = Integer.parseInt(reader.nextLine());
		System.out.println("First: " + a);
		System.out.print("Type last number: ");
		int b = Integer.parseInt(reader.nextLine());
		System.out.println("Last: " + b);
		int sum = 0;
		int c = 0;
		
		
		
		while (a<b) {
			
			sum = sum + a;
			c = a++;
						
		}
		
		System.out.print("Sum of numbers: " + (sum + b));
	}

}
