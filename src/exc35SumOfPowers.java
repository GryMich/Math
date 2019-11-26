import java.util.Scanner;

public class exc35SumOfPowers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Until what?: ");
		
		int a = 2;
		double b = Integer.parseInt(reader.nextLine());
		int sum = 0;
		
		
		
		
		while (a<=b) {
			
			System.out.println(a);
			
			sum = sum + (int)(Math.pow(a, b));
			b--;
			
		}
		
		
		System.out.print("Factorial is " + sum);
	}

}
