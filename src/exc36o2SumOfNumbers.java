import java.util.Scanner;

public class exc36o2SumOfNumbers {

	public static void main(String[] args) {
		//36.1 Reading numbers
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Type numbers: ");
		
		int number = 0;
		int sum = 0;
		
		while (number >= 0) {
			
			number = Integer.parseInt(reader.nextLine());
			
			sum = sum + number;
			
			System.out.println(sum);
					
			if (number == -1) {
				System.out.println("Thank you!");
				break;
			}
		

		}
			
	}

}
