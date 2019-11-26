import java.util.Scanner;
public class biggerNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Type a number: ");
		int a = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int b = Integer.parseInt(reader.nextLine());

		
		System.out.print("The bigger number of the two number given was: ");
		System.out.print(Math.max(a, b) );
	}

}
