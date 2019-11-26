import java.util.Scanner;

public class exc32SumOfSetOfNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Until what?: ");
		
		int a = 0;
		int b = Integer.parseInt(reader.nextLine());
		int sum = 0;
		int c = 0;
		
		
		while (a<b) {
			
			System.out.println(a);
			
			sum = sum + a;
			c = a++;
		}
		
		
		System.out.print("Sum of numbers: " + sum);
	}

}
