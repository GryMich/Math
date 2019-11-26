import java.util.Scanner;

public class exc34Factorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Until what?: ");
		
		int a = 1;
		int b = Integer.parseInt(reader.nextLine());
		int sum = 1;
		int c = 0;
		
		
		while (a<b) {
			
			System.out.println(a);
			
			sum = sum*a;
			c = a++;
			
		}
		
		
		System.out.print("Factorial is " + sum*b);
	}

}
