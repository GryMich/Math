import java.util.Scanner;

public class exc36o3SummingAndCoutingNumbers {

	public static void main(String[] args) {
		//36.1 Reading numbers
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Type numbers: ");
		
		int number = 0;
		int sum = 0;
		int counter = 0;
		while (number >= 0) {
			
			number = Integer.parseInt(reader.nextLine());
			
			sum = sum + number;
			counter++;
			System.out.println(sum);
					
			if (number == -1) {
				System.out.println("Thank you!");
				System.out.println("The sum is: " + sum);
				System.out.println("How many numbers: "+ counter);
				
				break;
			}
			

		}
			
	}

}
