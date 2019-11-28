import java.util.Scanner;

public class SelfMethod {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many times the text should be printed?");
		
		int number = Integer.parseInt(reader.nextLine());
		int counter = 0;
		
		while (number > counter) {
		
		greet();
		
		counter++;
		}
	}
	
	public static void greet () {
		System.out.println("Greeting from the world of methods!");
	}
}
