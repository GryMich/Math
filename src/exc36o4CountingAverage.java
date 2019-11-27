import java.util.Scanner;

public class exc36o4CountingAverage {
//jest to ca³e zadanie 36
	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Type numbers: ");
		
		int number = 0;
		int sum = 0;
		int counter = 0;
		double average = 0.0;
		int even = 0;
		int odd = 0;
		
		while (number >= 0) {
			
			number = Integer.parseInt(reader.nextLine());
			
								
			if (number == -1) {
				
				break; 
			} if (number % 2 == 0) {
				even++;
				
			} if (number % 2 != 0) {
				odd++;
																								
			}
			
			sum = sum + number;
			counter++;
		}	
		System.out.println("Thank you!");
		System.out.println("The sum is: " + sum);
		System.out.println("How many numbers: "+ counter);
		System.out.println("Average: "+ (double)sum/counter);
		System.out.println("Even numbers: "+ even);
		System.out.println("Odd numbers: "+ odd);
		}
		
	}
