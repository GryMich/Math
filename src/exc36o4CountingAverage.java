import java.util.Scanner;

public class exc36o4CountingAverage {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Type numbers: ");
		
		int number = 0;
		int sum = 0;
		int counter = 0;
		double average = 0.0;
		
		while (number >= 0) {
			
			number = Integer.parseInt(reader.nextLine());
			
								
			if (number == -1) {
				
				break; 
				
			} else  {
				
				sum = sum + number;
				counter++;
				
								
			}
		}	
		System.out.println("Thank you!");
		System.out.println("The sum is: " + sum);
		System.out.println("How many numbers: "+ counter);
		System.out.println("Average: "+ (double)sum/counter);
	}

}
