import java.util.Scanner;

public class conditionalLoops {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("How old are you? ");
		int number1 = Integer.parseInt(reader.nextLine());

		if (number1 >= 18) {
			System.out.print("You have reached the age of majority!");
		} else 
			System.out.print("You have not reached the age of majority yet!");

		}
	}

