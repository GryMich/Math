import java.util.Scanner;

public class exc41GuessANumber {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner (System.in);
		
		int number = 50; 
				
		System.out.println("Guess a number: ");
		
		int a = Integer.parseInt(reader.nextLine());
		
				
		if (number>a) {
						
			System.out.println("The number is greater");
		}			
			else if (number<a) {
				
			System.out.println("The number is lesser");
			
			}
			else if (number==a) {
			
			System.out.println("Yes! Your guess is correct!");
			
			
		}
		}
	}


